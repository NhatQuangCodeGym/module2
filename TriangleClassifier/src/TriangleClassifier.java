
public class TriangleClassifier {
    public static void classifyTriangle(double firstSide,double secondSide, double thirdSide) {
        if ((firstSide + secondSide) > thirdSide && (firstSide + thirdSide) > secondSide && (secondSide + thirdSide) > firstSide && firstSide > 0 && secondSide > 0 && thirdSide > 0) {
            if (firstSide == secondSide && firstSide == thirdSide) {
                System.out.println("Tam giac deu");
            } else if ((firstSide == secondSide) || (firstSide == thirdSide) || (secondSide == thirdSide)) {
                System.out.println("tam giac can");
            } else if ((firstSide * firstSide == secondSide * secondSide + thirdSide * thirdSide) ||
                    (secondSide * secondSide == firstSide * firstSide + thirdSide * thirdSide) ||
                    (thirdSide * thirdSide == firstSide * firstSide + secondSide * secondSide)) {
                System.out.println("Tam giac vuong!");
            } else if (((firstSide * firstSide + secondSide * secondSide == thirdSide * thirdSide) && (firstSide == secondSide)) ||
                    ((firstSide * firstSide + thirdSide * thirdSide == secondSide * secondSide) && (firstSide == thirdSide)) ||
                    ((secondSide * secondSide + thirdSide * thirdSide == firstSide * firstSide) && (secondSide == thirdSide))) {
                System.out.println("Tam giac vuong can!");
            } else {
                System.out.println("Tam giac thuong!");
            }
        } else {
            System.out.println("3 cạnh của tam giác không thỏa mãn điều kiện lập thành tam giác!");
        }
    }

    public static void main(String[] args) {
        classifyTriangle(3,3,3);
    }
}
