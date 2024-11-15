public class ComputeSum { 
    public static void main(String[] args) {
        // Beispiele zur Demonstration der computeSum-Methode
        int result1 = computeSum(6);
        System.out.println("Summe für n = 6: " + result1); // Ausgabe: 21
        
        int result2 = computeSum(10);
        System.out.println("Summe für n = 10: " + result2); // Ausgabe: 55
    }

    /**
     * Berechnet die Summe der ganzen Zahlen von 0 bis n.
     *
     * @param n Eine natürliche Zahl, bis zu der die Summe berechnet werden soll.
     * @return Die berechnete Summe von 0 bis n.
     */
    public static int computeSum(int n) {
        int sum = 0;
        for (int i = n; i > 0; i--) {
            sum += i;
        }
        return sum;
    }
}




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




public class CountTrueBooleans {
    
    public static void main(String[] args) {
        // Beispiel-Array mit true- und false-Werten
        boolean[] values = { true, false, false, true, true };
        
        // Aufruf der Methode countTrueBooleans und Ausgabe des Ergebnisses
        int result = countTrueBooleans(values);
        System.out.println("Anzahl der true-Werte: " + result); // Erwartete Ausgabe: 3
    }
    
    /**
     * Zählt die Anzahl der `true`-Werte in einem Array von booleschen Werten.
     *
     * @param booleans Ein Array von boolean-Werten.
     * @return Die Anzahl der `true`-Werte im Array.
     */
    public static int countTrueBooleans(boolean[] booleans) {
        int count = 0;
        for (boolean b : booleans) {
            if (b) {
                count++;
            }
        }
        return count;
    }
}




public class TransposeMatrix {
    public static void main(String[] args) {
        // Beispiel-Matrix zur Demonstration
        int[][] matrix = {
            {1, 4, 7},
            {2, 5, 8},
            {3, 6, 9}
        };

        // Aufruf der Methode transposeAndPrintMatrix und direkte Ausgabe der transponierten Matrix
        System.out.println("Transponierte Matrix:");
        transposeAndPrintMatrix(matrix);
    }

    /**
     * Transponiert eine gegebene zweidimensionale Matrix und gibt die transponierte Form direkt auf der Konsole aus.
     *
     * @param matrix Die zweidimensionale Matrix (int[][]), deren Transponierte ausgegeben werden soll.
     */
    public static void transposeAndPrintMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println(); // Zeilenumbruch nach jeder Zeile der transponierten Matrix
        }
    }

}
