package exceptions;

public class ThrowSolved {
    public static void main(String[] args) {
        calculate(10, 0);
    }

    private static void calculate(int dividend, int divisor) {
        try {
            divide(dividend, divisor);
        } catch (ArithmeticException e) {
            System.out.println("Ooops...");
        }
    }

    private static void divide(int dividend, int divisor) throws ArithmeticException {
        validate(divisor);
        int result = dividend / divisor;
        System.out.println("Result: " + result);
    }

    private static void validate(int divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException(); // direct
        }
    }
}
