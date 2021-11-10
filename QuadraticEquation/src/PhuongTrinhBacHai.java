import java.util.Scanner;
public class PhuongTrinhBacHai {
    public static void main(String[] args) {
        double a, b, c;
        Scanner input = new Scanner((System.in));
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        QuadraticEquation qe = new QuadraticEquation(a, b, c);
        if (qe.getDiscriminant() < 0) {
            System.out.println("Phuong trinh khong co nghiem");
        } else if (qe.getDiscriminant() == 0) {
            System.out.println("Phuong trinh co 1 nghiem: " + qe.getRoot1());
        } else {
            System.out.println("Phuong trinh co 2 nghiem phan biet: ");
            System.out.println("Nghiem 1 la: " + qe.getRoot1());
            System.out.println("Nghiem 2 la: " + qe.getRoot2());
        }
    }
}
