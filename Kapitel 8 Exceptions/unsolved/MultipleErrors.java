public class MultipleErrors {
    /* Die Ausgabe kann wie folgt am ende aussehen:
     *
     * Ich sollte keine fehler ueber mich haben
     */
    public static void main(String[] args) {
        try {
            processArray(new int[]{1, 2, 3}, "abc", new String[]{});
        } 
        // TODO: Schreiben Sie drei catch-Blöcke für die drei Fehler, die in der Methode processArray auftreten. 
        // TODO: Jeder catch-Block sollte seine Fehler Nummer ausgeben z.B. "Fehler 1 ist aufgetreten". Suchen sie die 
        // TODO: drei passende Exceptions (ArrayIndexOutOfBoundsException, NullPointerException, NumberFormatException, ArithmeticException, IllegalArgumentException).
        
        // TODO: Korregieren sie das code in processArray sodass nur finally augegeben wird.
        finally {
            System.out.println("Ich sollte keine fehler ueber mich haben");
        }
    }

    public static void processArray(int[] array, String str, String[] strArray) { 
        // Fehler 1
        for (int i = 0; i <= array.length; i++) {
            int element = array[i];
        }

        // Fehler 2
        int number = Integer.parseInt(str);

        // Fehler 3
        int length = strArray.length;
        int result = number / length;
    }
}