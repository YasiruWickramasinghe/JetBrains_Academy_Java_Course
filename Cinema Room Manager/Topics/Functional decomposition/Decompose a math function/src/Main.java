import java.util.Scanner;
import java.util.Locale;

class MultipleFunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double x = scanner.nextDouble();
        System.out.println(f(x));
    }

    public static double f(double x) {
        if (x <= 0) {
            return f1(x);
        }
        else if (x < 1 && x > 0) {
            return f2(x);
        }
        else if (x >= 1) {
            return f3(x);
        }
        return x;
    }

    //implement your methods here
    public static double f1(double x) {
        double result = Math.pow(x, 2) + 1;
        return result;
    }

    public static double f2(double x) {
        double result = 1 / (Math.pow(x, 2));
        return result;
    }


    public static double f3(double x) {
        double result = Math.pow(x, 2) - 1;
        return result;
    }
}
