package solved;

public class Kontrollstrukturen2Solved {
    /* 
     * Die Ausgabe kann wie folgt aussehen wenn n = 5:
     * Die Summe der Zahlen von 1 bis 5 ist 15.
     * 
     * Die Ausgabe kann wie folgt aussehen wenn n = 3:
     * Die Summe der Zahlen von 1 bis 3 ist 6.
     */
    public static void main(String[] args) {
        // Erstellen Sie eine Variable "n" und weisen Sie ihr den Wert 5 zu.
        int n = 5;

        // Rufen Sie die Methode "calculateSum" auf und übergeben Sie "n" als Parameter. Speichern Sie das Ergebnis in der Variable "sum".
        int sum = calculateSum(n);

        // Geben Sie die Summe aus (Letzter Schritt).
        System.out.println("Die Summe der Zahlen von 1 bis " + n + " ist: " + sum);
    }

    // Erstellen Sie eine Methode "calcualteSum", die einen Parameter "n" erhält.
    // Schreiben Sie sinnvolles JavaDoc für die Methode.
    /**
     * Berechnet die Summe der Zahlen von 1 bis n.
     *
     * @param n Die obere Grenze der Zahlenreihe.
     * @return Die Summe der Zahlen von 1 bis n.
     */
    public static int calculateSum(int n) {
        // Erstellen Sie eine Variable "sum" und initialisieren Sie sie mit 0.
        int sum = 0;

        // Schreiben Sie eine for-Schleife, die die Zahlen von 1 bis n durchläuft.
        for (int i = 1; i <= n; i++) {
            // Addieren Sie jede Zahl zur Summe hinzu.
            sum += i;
        }

        // Geben Sie die Summe zurück.
        return sum;
    }
}