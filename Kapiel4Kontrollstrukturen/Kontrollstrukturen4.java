public class Kontrollstrukturen4 {

    public static String antwort(int input) {
        if (input % 3 == 0 && input % 7 == 0) {
            return "42";
        } else if (input % 3 == 0) {
            return "bar";
        } else if (input % 7 == 0) {
            return "foo";
        } else {
            return String.valueOf(input);
        }
    }

    public static void main(String[] args) {
        // Beispielaufruf
        int eingabe = 21;
        String ergebnis = antwort(eingabe);
        System.out.println("Ergebnis für Eingabe " + eingabe + ": " + ergebnis);
    }
}
