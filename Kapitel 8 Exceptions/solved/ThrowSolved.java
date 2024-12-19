package exceptions;

public class ThrowSolved {
    public static void main(String[] args) {
        Throw main = new Throw();
        main.calculate(10, 0);
    }

    private void calculate(int dividend, int divisor) {
        try {
            divide(dividend, divisor);
        } catch (ArithmeticException e) {
            System.out.println("Ooops...");
        }
    }

    private void divide(int dividend, int divisor) throws ArithmeticException {
        validate(divisor);
        int result = dividend / divisor;
        System.out.println("Result: " + result);
    }

    private void validate(int divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException(); // direct
        }
    }
}
