package exceptions;
public class ExceptionExample {

    public static void main(String[] args) {
        try {
            // Versuchen Sie, eine Operation durchzuführen, die eine Ausnahme auslösen könnte
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            // Fangen und behandeln Sie die Ausnahme
            System.out.println("Ein Fehler ist aufgetreten: " + e.getMessage());
        } finally {
            // Dieser Code wird immer ausgeführt
            System.out.println("Das ist der finally Block");
        }

        try {
            myMethod();
        } catch (ArithmeticException e) {
            System.out.println("Ein Fehler ist in myMethod aufgetreten: " + e.getMessage());
        }
    }

    public static void myMethod() throws ArithmeticException {
        // Wenn eine ArithmeticException auftritt, wird sie an die aufrufende Methode weitergegeben
        int result = 10 / 0;
    }
}
