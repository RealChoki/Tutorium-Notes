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
