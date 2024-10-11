package solved;

public class MehrdimensionaleArrayAufgabenSolved {
    /* Die Ausgaben können wie folgt aussehen, wenn matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}} ist:
     *
     * Die Anzahl der Zeilen im 2D-Array ist: 3
     * Die Anzahl der Spalten im 2D-Array ist: 3
     * Das 2D-Array:
     * 1 2 3 
     * 4 5 6 
     * 7 8 9 
     * Die Summe der Elemente im 2D-Array ist: 45
     * Die größte Zahl im 2D-Array ist: 9
     */
    public static void main(String[] args) {
        // Erstellen Sie ein 2D-Array "matrix" mit 3 Zeilen und 3 Spalten und initialisieren Sie es mit den Zahlen 1 bis 9.
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Erstellen Sie eine Methode "getRowCount", die die Anzahl der Zeilen im 2D-Array zurückgibt.
        // Schreiben Sie sinnvolles JavaDoc für die Methode.
        int rowCount = getRowCount(matrix);
        System.out.println("Die Anzahl der Zeilen im 2D-Array ist: " + rowCount);
        
        // Erstellen Sie eine Methode "getColumnCount", die die Anzahl der Spalten im 2D-Array zurückgibt.
        // Schreiben Sie sinnvolles JavaDoc für die Methode.
        int columnCount = getColumnCount(matrix);
        System.out.println("Die Anzahl der Spalten im 2D-Array ist: " + columnCount);
        
        // Erstellen Sie eine Methode "print2DArray", die die Elemente des 2D-Arrays ausgibt.
        // Schreiben Sie sinnvolles JavaDoc für die Methode.
        System.out.println("Das 2D-Array:");
        print2DArray(matrix);
        
        // Erstellen Sie eine Methode "sum2DArray", die die Summe der Elemente im 2D-Array berechnet und ausgibt.
        // Schreiben Sie sinnvolles JavaDoc für die Methode.
        int sum = sum2DArray(matrix);
        System.out.println("Die Summe der Elemente im 2D-Array ist: " + sum);

        // Erstellen Sie eine Methode "findMaxIn2DArray", die die größte Zahl im 2D-Array findet und zurückgibt.
        // Schreiben Sie sinnvolles JavaDoc für die Methode.
        int max = findMaxIn2DArray(matrix);
        System.out.println("Die größte Zahl im 2D-Array ist: " + max);
    }

    /**
     * Gibt die Anzahl der Zeilen im gegebenen 2D-Array zurück.
     *
     * @param arr das 2D-Array
     * @return die Anzahl der Zeilen im 2D-Array
     */
    public static int getRowCount(int[][] arr) {
        return arr.length;
    }

    /**
     * Gibt die Anzahl der Spalten im gegebenen 2D-Array zurück.
     *
     * @param arr das 2D-Array
     * @return die Anzahl der Spalten im 2D-Array
     */
    public static int getColumnCount(int[][] arr) {
        return arr[0].length;
    }

    /**
     * Gibt die Elemente des gegebenen 2D-Arrays aus.
     *
     * @param arr das 2D-Array, das ausgegeben werden soll
     */
    public static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Berechnet die Summe der Elemente im gegebenen 2D-Array.
     *
     * @param arr das 2D-Array, dessen Elemente summiert werden sollen
     * @return die Summe der Elemente im 2D-Array
     */
    public static int sum2DArray(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    /**
     * Findet das größte Element im gegebenen 2D-Array.
     *
     * @param arr das 2D-Array, das durchsucht werden soll
     * @return das größte Element im 2D-Array
     */
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
