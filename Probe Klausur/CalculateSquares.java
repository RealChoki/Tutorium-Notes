public class CalculateSquares {
    public static void main(String[] args) {
        // Beispiel-Array mit nichtnegativen ganzen Zahlen
        int[] values = {2, 3, 5, 7};

        // Aufruf der Methode calculateSquares und Ausgabe der Quadrate auf der Konsole
        calculateSquares(values);
    }

    /**
     * Berechnet die Quadrate der Elemente in einem Array von nichtnegativen ganzen Zahlen
     * und gibt die Ergebnisse auf der Konsole aus.
     *
     * @param numbers Ein Array von nichtnegativen ganzen Zahlen.
     */
    public static void calculateSquares(int[] numbers) {
        for (int number : numbers) {
            int square = number * number;
            System.out.println(square);
        }
    }
}