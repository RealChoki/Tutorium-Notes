public class ExceptionSolved {
    /* Die Ausgabe kann wie folgt aussehen:
     *
     * Es existiert kein viertes Element
     * blub
     */
    public static void main(String[] args) {
        // TODO: Erstellen Sie ein Array mit drei Elementen (z.B. zahlen)
        int[] array = {1, 2, 3};

        try {
            // TODO: Versuchen Sie, auf das nicht existierende vierte Element des Arrays zuzugreifen
            int outOfBounds = array[3];
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: Fangen Sie die Ausnahme ab und geben Sie eine Fehlermeldung aus die ansagt, dass das vierte Element nicht existiert
            System.out.println("Es existiert kein viertes Element");
        } finally {
            // TODO: Geben Sie eine Nachricht aus, die immer angezeigt wird, unabhängig davon, ob eine Ausnahme aufgetreten ist oder nicht die "blub" ausgibt
            System.out.println("blub");
        }
    }
}




public class MultipleErrorsSolved {
    /* Die Ausgabe kann wie folgt am ende aussehen:
     *
     * Ich sollte keine fehler ueber mich haben
     */
    public static void main(String[] args) {
        try {
            processArray(new int[]{1, 2, 3}, "123", new String[]{"1"});
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Fehler 1 aufgetreten: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Fehler 2 aufgetreten: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Fehler 3 aufgetreten: " + e.getMessage());
        } finally {
            System.out.println("Ich sollte keine fehler ueber mich haben");
        }
    }

    public static void processArray(int[] array, String str, String[] strArray) { 
        // Fehler 1: Zugriff auf ein Array-Element außerhalb der Grenzen in einer Schleife
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
        }

        // Fehler 2: Versuch, eine nicht-numerische Zeichenkette in eine Ganzzahl umzuwandeln
        int number = Integer.parseInt(str);

        // Fehler 3: Division durch Null
        int length = strArray.length;
        int result = number / length;
    }
}




public class ThrowSolved {
    /* Die Ausgabe kann wie folgt aussehen wenn der dividend 10 ist und der divisor 2 ist:
     *
     * Result: 5
     */
    public static void main(String[] args) {
        calculate(10, 2);
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