package exceptions;
public class ExceptionExample {
    // In Java gibt es zwei Haupttypen von Exceptions: Checked und Unchecked Exceptions.

    // Checked Exceptions sind Ausnahmen, die während der Kompilierzeit erkannt werden. 
    // Sie erfordern eine explizite Behandlung in Ihrem Code, entweder durch try-catch-Block oder durch die Weitergabe der Ausnahme an die aufrufende Methode (mit 'throws').

    // Unchecked Exceptions sind Ausnahmen, die während der Laufzeit auftreten. 
    // Sie sind in der Regel das Ergebnis von Programmierfehlern, wie z.B. NullPointer Exceptions oder Division durch Null.

    // 'try' ist ein Schlüsselwort, das einen Block von Code umschließt, in dem eine Ausnahme auftreten könnte.
    // 'catch' ist ein Schlüsselwort, das verwendet wird, um die Ausnahme zu fangen und zu behandeln, die im try-Block aufgetreten ist.
    // 'finally' ist ein Schlüsselwort, das einen Block von Code umschließt, der immer ausgeführt wird, unabhängig davon, ob eine Ausnahme aufgetreten ist oder nicht.

    // Hier ist ein einfaches Beispiel:
    public static void main(String[] args) {
        try {
            // Versuchen Sie, eine Operation durchzuführen, die eine Ausnahme auslösen könnte
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            // Fangen und behandeln Sie die Ausnahme
            System.out.println("Ein Fehler ist aufgetreten: " + e.getMessage());
        } finally {
            // Dieser Code wird immer ausgeführt
            System.out.println("Das ist der finally Block");
        }

        try {
            myMethod();
        } catch (ArithmeticException e) {
            System.out.println("Ein Fehler ist in myMethod aufgetreten: " + e.getMessage());
        }
    }

    public static void myMethod() throws ArithmeticException {
        // Wenn eine ArithmeticException auftritt, wird sie an die aufrufende Methode weitergegeben
        int result = 10 / 0;
    }
}
