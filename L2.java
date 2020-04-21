import java.text.DecimalFormat;

import java.util.Scanner;

class Lab2 {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

Point3d point1 = new Point3d();

Point3d point2 = new Point3d();

Point3d point3 = new Point3d();

try {

System.out.println("Enter three coordinates of first point");

point1.setX(sc.nextDouble());

point1.setY(sc.nextDouble());

point1.setZ(sc.nextDouble());

System.out.println("Enter three coordinates of second point");

point2.setX(sc.nextDouble());

point2.setY(sc.nextDouble());

point2.setZ(sc.nextDouble());

System.out.println("Enter three coordinates of third point");

point3.setX(sc.nextDouble());

point3.setY(sc.nextDouble());

point3.setZ(sc.nextDouble());

} catch(Exception e) {

System.out.println("You entered not valid data. Program failed.");

throw e;

}

double result = computeArea(point1, point2, point3);

if (result != 0) {

DecimalFormat df = new DecimalFormat("#.##");

System.out.println("Triangle area = " + df.format(result));

}

}

private static double computeArea(Point3d point1, Point3d point2, Point3d point3) {

if (point1.equals(point2) || point1.equals(point3) || point2.equals(point3)) {

System.out.println("Two points are identical. It's not a triangle.");

return 0d;

}

double a = point1.distanceTo(point2);

double b = point2.distanceTo(point3);

double c = point3.distanceTo(point1);

double p = (a + b + c)/2d;

return Math.sqrt(p*(p - a)*(p - b)*(p - c));

}

}