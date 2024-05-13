public class ArrayAufgaben {
    /* Die Ausgabe kann wie folgt aussehen:
     *
     * Die Zahlen im Array sind: 1 2 3 4 5 
     * Die Summe der Zahlen im Array ist: 15
     * Die größte Zahl im Array ist: 5 
     */
    public static void main(String[] args) {
        // TODO: Erstellen Sie ein Array "numbers" und initialisieren Sie es mit den Zahlen 1 bis 5.
        int[] numbers = {1, 2, 3, 4, 5};

        // TODO: Erstellen Sie eine Methode "printArray", die die Zahlen aus dem Array "numbers" ausgibt.
        System.out.print("Die Zahlen im Array sind: ");
        printArray(numbers);

        // TODO: Erstellen Sie eine Methode "calculateSum", die die Summe der Zahlen im Array "numbers" berechnet und ausgibt.
        int sum = calculateSum(numbers);
        System.out.println("Die Summe der Zahlen im Array ist: " + sum);

        // TODO: Erstellen Sie eine Methode "findMax", die die größte Zahl im Array "numbers" ausgibt.
        int max = findMax(numbers);
        System.out.println("Die größte Zahl im Array ist: " + max);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

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