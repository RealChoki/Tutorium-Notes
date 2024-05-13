public class MehrdimensionaleArrayAufgaben {
    /* Die Ausgabe kann wie folgt aussehen:
     *
     * Das 2D-Array:
     * 1 2 3 
     * 4 5 6 
     * 7 8 9 
     * 
     * Die Summe der Elemente im 2D-Array ist: 45
     * Die Anzahl der Zeilen im 2D-Array ist: 3
     * Die Anzahl der Spalten im 2D-Array ist: 3
     * Die größte Zahl im 2D-Array ist: 9
     */
    public static void main(String[] args) {
        // TODO: Erstellen Sie ein 2D-Array "matrix" mit 3 Zeilen und 3 Spalten und initialisieren Sie es mit zahlen 1 bis 9.
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // TODO: Erstellen Sie eine Methode "print2DArray", die das 2D-Array ausgibt.
        System.out.println("Das 2D-Array:");
        print2DArray(matrix);

        // TODO: Erstellen Sie eine Methode "sum2DArray", die die Summe aller Elemente im 2D-Array berechnet und ausgibt.
        int sum = sum2DArray(matrix);
        System.out.println("Die Summe der Elemente im 2D-Array ist: " + sum);

        // TODO: Erstellen Sie eine Methode "getRowCount", die die Anzahl der Zeilen im 2D-Array zurückgibt.
        int rowCount = getRowCount(matrix);
        System.out.println("Die Anzahl der Zeilen im 2D-Array ist: " + rowCount);

        // TODO: Erstellen Sie eine Methode "getColumnCount", die die Anzahl der Spalten im 2D-Array zurückgibt.
        int columnCount = getColumnCount(matrix);
        System.out.println("Die Anzahl der Spalten im 2D-Array ist: " + columnCount);

        // TODO: Erstellen Sie eine Methode "findMaxIn2DArray", die die größte Zahl im 2D-Array zurückgibt.
        int max = findMaxIn2DArray(matrix);
        System.out.println("Die größte Zahl im 2D-Array ist: " + max);
    }

    public static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int sum2DArray(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    public static int getRowCount(int[][] arr) {
        return arr.length;
    }

    public static int getColumnCount(int[][] arr) {
        return arr[0].length;
    }

    public static int findMaxIn2DArray(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
