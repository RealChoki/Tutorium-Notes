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
