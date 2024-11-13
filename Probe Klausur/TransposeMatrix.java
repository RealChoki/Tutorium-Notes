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
