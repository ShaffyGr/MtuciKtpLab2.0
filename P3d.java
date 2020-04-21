class Point3d {

private double x;

private double y;

private double z;

public Point3d() {

this.x = 0;

this.y = 0;

this.z = 0;

}

public Point3d(double x, double y, double z) {

this.x = x;

this.y = y;

this.z = z;

}

public double distanceTo(Point3d point) {

return Math.sqrt((x - point.getX())*(x - point.getX())

+ (y - point.getY())*(y - point.getY())

+ (z - point.getZ())*(z -point.getZ()));
}

public double getX() {

return x;

}

public void setX(double x) {

this.x = x;

}

public double getY() {

return y;

}

public void setY(double y) {

this.y = y;

}

public double getZ() {

return z;

}

public void setZ(double z) {

this.z = z;

}

@Override

public boolean equals(Object o) {

if (this == o) return true;

if (o == null || getClass() != o.getClass()) return false;

Point3d point3d = (Point3d) o;

return Double.compare(point3d.x, x) == 0 &&

Double.compare(point3d.y, y) == 0 &&

Double.compare(point3d.z, z) == 0;

}
}