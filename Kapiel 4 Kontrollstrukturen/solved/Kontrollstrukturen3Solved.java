package solved;

public class Kontrollstrukturen3Solved {
    /* 
     * Die Ausgabe kann wie folgt aussehen wenn num = 2:
     * Die Zahl 2 ist gerade.
     * 
     * Die Ausgabe kann wie folgt aussehen wenn n = 3:
     * Die Zahl 3 ist ungerade.
     */
    public static void main(String[] args) {
        // Erstellen Sie eine Variable "num" und weisen Sie ihr den Wert 2 zu.
        int num = 2;

        // Rufen Sie die Methode "checkEvenOdd" auf und übergeben Sie "num" als Parameter. Speichern Sie das Ergebnis in der Variablen "result".
        String result = checkEvenOdd(num);

        // Geben Sie das Ergebnis aus (Letzter Schritt).
        System.out.println("Die Zahl " + num + " ist " + result + ".");
    }

    // Erstellen Sie eine Methode "checkEvenOdd", die einen Parameter "num" erhält.
    // Schreiben Sie sinnvolles JavaDoc für die Methode.
    /**
     * Überprüft, ob eine Zahl gerade oder ungerade ist.
     *
     * @param num Die zu überprüfende Zahl.
     * @return "gerade" wenn die Zahl gerade ist, sonst "ungerade".
     */
    public static String checkEvenOdd(int num) {
        // Verwenden Sie den ternären Operator, um zu überprüfen, ob die Zahl gerade oder ungerade ist. Geben sie das Ergebnis direkt zurück.
        return num % 2 == 0 ? "gerade" : "ungerade";
    }
}