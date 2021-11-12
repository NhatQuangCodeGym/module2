public class Main {
    public static void main(String[] args) {
        Point p1 = new MovablePoint(3,2);
        Point p2 = new Point(2,2);
        p2.toString();
        p1.setXY(4,5);((MovablePoint)p1).move();
        System.out.println(p1.toString());
    }
}
