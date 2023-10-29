package cylinderpro_programme19;

public class Cylinder extends Circle {
    double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        if (height > 0) {
            return height;
        } else {
            height = 0;
            return height;
        }
    }

    public double getVolume() {
        double area = getArea() * getHeight();
        return area;
    }
}

