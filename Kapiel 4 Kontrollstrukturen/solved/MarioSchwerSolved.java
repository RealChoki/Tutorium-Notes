package solved;

public class MarioSchwerSolved {
    /* Die Ausgabe kann wie folgt aussehen wenn numberOfRows = 4:
     *
     *   #  # 
     *  ##  ##
     * ###  ###
     *####  ####
     */
    public static void main(String[] args) {
        // Erstellen Sie eine Variable namens "numberOfRows" und weisen Sie die Zahl 4 zu.
        int numberOfRows = 4;

        // Rufen Sie die Methode "printPattern" auf und übergeben Sie "numberOfRows" als Parameter (Letzter Schritt).
        printPattern(numberOfRows);
    }

    // Erstellen Sie eine Methode "printPattern", die einen Parameter "numberOfRows" erhält.
    // Schreiben Sie sinnvolles JavaDoc für die Methode.
    /**
     * Gibt ein Muster aus, das aus "#" besteht und eine bestimmte Anzahl von Zeilen hat.
     *
     * @param numberOfRows Die Anzahl der Zeilen im Muster.
     */
    public static void printPattern(int numberOfRows) {
        for (int i = 1; i <= numberOfRows; i++) {
            // Druckt Leerzeichen für die linke Seite der Pyramide
            for (int j = 0; j < numberOfRows - i; j++) {
                System.out.print(" ");
            }
            // Druckt die "#" für die linke Pyramide
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            System.out.print("  "); // Abstand zwischen den beiden Pyramiden
            // Druckt die "#" für die rechte Pyramide
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            System.out.println(); // Neue Zeile nach jeder Reihe
        }
    }
}
