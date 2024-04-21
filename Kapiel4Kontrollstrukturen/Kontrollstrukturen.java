public class Kontrollstrukturen {
    public static void main(String[] args) {
        //TODO: Erstellen Sie zwei Variablen "num1" und "num2" und weisen Sie ihnen unterschiedliche Zahlenwerte zu.
        int num1 = 5;
        int num2 = 5;

        //TODO: Rufen Sie die Methode "compareNumbers" auf und übergeben Sie "num1" und "num2" als Parameter.
        compareNumbers(num1, num2);
    }

    //TODO: Erstellen Sie eine Methode "compareNumbers", die zwei Parameter "a" und "b" erhält.
    public static void compareNumbers(int a, int b) {
        //TODO: Überprüfen Sie, ob "a" größer ist als "b" und geben Sie eine entsprechende Nachricht aus.
        if (a > b) {
            System.out.println(a + " ist größer als " + b);
        }
        //TODO: Überprüfen Sie, ob "b" größer ist als "a" und geben Sie eine entsprechende Nachricht aus.
        else if (b > a) {
            System.out.println(b + " ist größer als " + a);
        }
        //TODO: Falls weder "a" noch "b" größer ist, geben Sie aus, dass sie gleich sind.
        else {
            System.out.println(a + " und " + b + " sind gleich.");
        }
    }
}

