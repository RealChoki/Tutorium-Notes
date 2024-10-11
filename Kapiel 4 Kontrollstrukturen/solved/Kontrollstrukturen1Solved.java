package solved;
public class Kontrollstrukturen1Solved {
    /* 
     * Die Ausgabe kann wie folgt aussehen wenn num1 = 20 und num2 = 10:
     * 20 ist größer als 10.
     * 
     * Die Ausgabe kann wie folgt aussehen wenn num1 = 10 und num2 = 20:
     * 10 ist kleiner als 20.
     * 
     * Die Ausgabe kann wie folgt aussehen wenn num1 = 10 und num2 = 10:
     * 10 und 20 sind gleich.
     */
    public static void main(String[] args) {
        // Erstellen Sie zwei Variablen "num1" und "num2" und weisen Sie ihnen unterschiedliche Zahlenwerte zu.
        int num1 = 10;
        int num2 = 20;

        // Rufen Sie die Methode "compareNumbers" auf und übergeben Sie "num1" und "num2" als Parameter.
        compareNumbers(num1, num2);
    }

    // Erstellen Sie eine Methode "compareNumbers", die zwei Parameter "a" und "b" erhält.
    // Schreiben Sie sinnvolles JavaDoc für die Methode.
    /**
     * Vergleicht zwei Zahlen und gibt eine entsprechende Nachricht aus.
     *
     * @param a Die erste Zahl.
     * @param b Die zweite Zahl.
     */
    public static void compareNumbers(int a, int b) {
        // Überprüfen Sie, ob "a" größer ist als "b" und geben Sie eine entsprechende Nachricht aus.
        if (a > b) {
            System.out.println(a + " ist größer als " + b + ".");
        }
        // Überprüfen Sie, ob "a" kleienr ist als "b" und geben Sie eine entsprechende Nachricht aus.
        else if (a < b) {
            System.out.println(a + " ist kleiner als " + b + ".");
        }
        // Falls weder "a" noch "b" größer ist, geben Sie aus, dass sie gleich sind.
        else {
            System.out.println(a + " und " + b + " sind gleich.");
        }
    }
}

