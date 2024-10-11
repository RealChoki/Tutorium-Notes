package solved;

public class ArrayAufgabenSolved {
    /* Die Ausgaben können wie folgt aussehen wenn numbers = {1, 2, 3, 4, 5} ist:
     *
     * Die Zahlen im Array sind: 1 2 3 4 5 
     * Die Summe der Zahlen im Array ist: 15
     * Die größte Zahl im Array ist: 5 
     */
    public static void main(String[] args) {
        // Erstellen Sie ein Array "numbers" und initialisieren Sie es mit den Zahlen 1 bis 5.
        int[] numbers = {1, 2, 3, 4, 5};

        // Erstellen Sie eine Methode "printArray", die die Zahlen aus dem Array "numbers" ausgibt. 
        // Verwenden Sie hierfür die erweiterte for-Schleife. Das Array "numbers" sollte an die Methode übergeben werden.
        // Schreiben Sie sinnvolles JavaDoc für die Methode.
        System.out.print("Die Zahlen im Array sind: ");
        printArray(numbers);

        // Erstellen Sie eine Methode "calculateSum", die die Summe der Zahlen im Array "numbers" berechnet und ausgibt. 
        // Verwenden Sie hierfür eine While-Schleife. Das Array "numbers" sollte an die Methode übergeben werden.
        // Schreiben Sie sinnvolles JavaDoc für die Methode.
        int sum = calculateSum(numbers);
        System.out.println("Die Summe der Zahlen im Array ist: " + sum);

        // Erstellen Sie eine Methode "findMax", die die größte Zahl im Array "numbers" ausgibt. 
        // Verwenden Sie hierfür eine traditionele for-Schleife. Das Array "numbers" sollte an die Methode übergeben werden.
        // Schreiben Sie sinnvolles JavaDoc für die Methode.
        int max = findMax(numbers);
        System.out.println("Die größte Zahl im Array ist: " + max);
    }

    /**
     * Prints the elements of the given array.
     *
     * @param arr the array to be printed
     */
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    /**
     * Calculates the sum of the elements in the given array.
     *
     * @param arr the array whose elements are to be summed
     * @return the sum of the elements in the array
     */
    public static int calculateSum(int[] arr) {
        int sum = 0;
        int i = 0;
        while (i < arr.length) {
            sum += arr[i];
            i++;
        }
        return sum;
    }

    /**
     * Finds the maximum element in the given array.
     *
     * @param arr the array to be searched
     * @return the maximum element in the array
     */
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}