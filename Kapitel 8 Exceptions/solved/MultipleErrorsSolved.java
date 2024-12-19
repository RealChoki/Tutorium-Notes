package exceptions;

public class MultipleErrorsSolved {
    /* Die Ausgabe kann wie folgt am ende aussehen:

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