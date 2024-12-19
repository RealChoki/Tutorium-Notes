public class Throw {
    /* Die Ausgabe kann wie folgt aussehen wenn der dividend 10 ist und der divisor 2 ist:
     *
     * Result: 5
     */
    public static void main(String[] args) {
        calculate(10, 0);
    }

    private static void calculate(int dividend, int divisor) {
        // TODO: Die Methode "calculate" sollte versuchen die Methode "divide" aufzurufen und dabei einen "ArithmeticException" abfangen. Wenn eine "ArithmeticException" auftritt, sollte sie "Ooops..." ausgeben.
    }

    private static void divide(int dividend, int divisor) throws ArithmeticException {
       // TODO: Die Methode "divide" sollte die Methode "validate" aufrufen und den "divisor" geben und dabei eine "ArithmeticException" werfen. Es sollte auch eine variable beeinhalten "result" die das wert vom dividieren des "dividend" und "divisor" besitzt. Dieses Wert sollte augegeben werden z.B. "Result: __".
    }

    private static void validate(int divisor) throws ArithmeticException {
        // TODO: Die Methode "validate" sollte eine "ArithmeticException" direkt werfen, wenn der übergebene Divisor 0 ist"
    }
    // TODO: Korregieren sie das code sodass die Antwort "result" ausgegeben wird.
}