public class Kontrollstrukturen5 {
    /**
     * Gibt den Wahrheitswert gemäß der vorgegebenen Wahrheitstabelle zurück.
     * 
     * @param x1 Boolescher Wert
     * @param x2 Boolescher Wert
     * @param x3 Boolescher Wert
     * @return Das Ergebnis gemäß Wahrheitstabelle
     */
    public static boolean evaluateBs(boolean x1, boolean x2, boolean x3) {
        if (!x1 && !x2 && !x3) {
            return false;
        } else if (!x1 && !x2 && x3) {
            return false;
        } else if (!x1 && x2 && !x3) {
            return false;
        } else if (!x1 && x2 && x3) {
            return true;
        } else if (x1 && !x2 && !x3) {
            return true;
        } else if (x1 && !x2 && x3) {
            return true;
        } else if (x1 && x2 && !x3) {
            return false;
        } else { // (x1 && x2 && x3)
            return false;
        }
    }

    public static void main(String[] args) {
        // Beispielaufruf
        boolean x1 = true;
        boolean x2 = true;
        boolean x3 = true;
        boolean ergebnis = evaluateBs(x1, x2, x3);
        System.out.println("Ergebnis für Eingabe " + x1 + ", " + x2 + ", " + x3 + " ist: " + ergebnis);
    }

    
}
