public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("The Circle of Radius: " + circle1.getRadius() + " have the area: " + circle1.getArea());
        Circle circle2 = new Circle(2.0);
        System.out.println("The Circle of Radius: " + circle2.getRadius() + " have the area: " + circle2.getArea());
    }
}
