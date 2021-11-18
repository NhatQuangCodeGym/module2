public class Main {
    public static String FizzBuzzWay(int x)
    {
        if (((x % 3) == 0) && ((x % 5) == 0))
            return "FizzBuzz";
        if ((x % 3) == 0) return "Fizz";
        if ((x % 5) == 0) return "Buzz";
        return "";
    }

    public static void main(String[] args) {
        System.out.println(FizzBuzzWay(3));
    }
}

