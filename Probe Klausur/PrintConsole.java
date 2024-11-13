public class PrintConsole {

    public static void main(String[] args) {
        // Beispielaufruf der Methode printConsole mit n = 3
        int n = 3;
        printConsole(n);
    }
    
    /**
     * Gibt alle geraden Zahlen von 0 bis 2*n auf der Konsole aus.
     *
     * @param n Die Zahl, bis zu der die geraden Zahlen (bis 2*n) berechnet und ausgegeben werden.
     */
    public static void printConsole(int n) {
        for (int i = 0; i <= 2 * n; i += 2) {
            System.out.println(i);
        }
    }
}
