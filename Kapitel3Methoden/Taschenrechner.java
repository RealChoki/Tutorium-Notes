import java.util.Scanner;

public class Taschenrechner {

    /**
     * Führt die Addition zweier ganzer Zahlen aus.
     * @param zahl1 Die erste Zahl für die Addition.
     * @param zahl2 Die zweite Zahl für die Addition.
     * @return Das Ergebnis der Addition von zahl1 und zahl2.
     */
    public static DATENTYP addiere(...) {
        
    }
    /**
     * Führt die Subtraktion zweier ganzer Zahlen aus.
     * @param zahl1 Die Zahl, von der subtrahiert wird.
     * @param zahl2 Die Zahl, die subtrahiert wird.
     * @return Das Ergebnis der Subtraktion von zahl2 von zahl1.
     */
    public static DATENTYP subtrahiere(...) {
        
    }
    /**
     * Führt die Multiplikation zweier ganzer Zahlen aus.
     * @param zahl1 Der erste Multiplikator.
     * @param zahl2 Der zweite Multiplikator.
     * @return Das Produkt von zahl1 und zahl2.
     */
    public static DATENTYP multipliziere(...) {
        
    }

        /**
     * Führt die Division zweier ganzer Zahlen aus.
     * @param zahl1 Der Dividend.
     * @param zahl2 Der Divisor.
     * @return Das Ergebnis der Division von zahl1 durch zahl2.
     */
    public static DATENTYP dividiere(...) {
    // Methode zur Division zweier Zahlen. 
    // Machen natürliche Zahlen hier Sinn? 
    // Welche Auswirkungen hat das auf den Datentyp? 
    // Was passiert wenn man durch Null teilt? 

    }

    // TODO Implementieren Sie zusätzlich noch eine Methode, welche Sie beim Start des Programmes mit Ihrem Namen begrüßt.
    // Sie dürfen dafür in der main() Methode weder System.out.println() noch System.out.print() verwenden, sowie keine String Variablen in der main() Methode deklarieren.


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO Deklarieren Sie hier die Variablen zahl1, zahl2, operation und ergebnis mit den passenden Datentypen.


        while (true) {
            System.out.println("Geben Sie die erste Zahl ein:");
            zahl1 = scanner.nextInt();
            System.out.println("Geben Sie die zweite Zahl ein:");
            zahl2 = scanner.nextInt();

            System.out.println("Wählen Sie die Operation: 1 - Addieren, 2 - Subtrahieren, 3 - Multiplizieren, 4 - Dividieren, 5 - Beenden");
            operation = scanner.nextInt();

            switch (operation) {
                case 1:
                    ergebnis = addiere(zahl1, zahl2);
                    System.out.println("Ergebnis der Addition: " + ergebnis);
                    break;
                case 2:
                    ergebnis = subtrahiere(zahl1, zahl2);
                    System.out.println("Ergebnis der Subtraktion: " + ergebnis);
                    break;
                case 3:
                    ergebnis = multipliziere(zahl1, zahl2);
                    System.out.println("Ergebnis der Multiplikation: " + ergebnis);
                    break;
                case 4:
                    ergebnis = dividiere(zahl1, zahl2);
                    System.out.println("Ergebnis der Division: " + ergebnis);
                    break;
                case 5:
                    System.out.println("Programm beendet.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Ungültige Eingabe. Bitte wählen Sie eine gültige Operation.");
            }
        }
    }
}
