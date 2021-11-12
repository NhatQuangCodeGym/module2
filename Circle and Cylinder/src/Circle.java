public class Circle {
    private String color;
    private double radius;

    public Circle() {
    }
    public Circle(double radius, String color){
        this.color = color;
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    @Override
    public String toString() {
        return getArea() + "";
    }
}
