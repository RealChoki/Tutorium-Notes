# Kapitel 8 Exceptions

In Java gibt es zwei Haupttypen von Exceptions: Checked und Unchecked Exceptions.

## Checked Exceptions

Diese sind die Ausnahmen, die während der Kompilierzeit erkannt werden. Sie müssen entweder in einem `try-catch-Block` behandelt oder mit `throws` in der Methodensignatur deklariert werden. Beispiele für Checked Exceptions sind `IOException`, `ClassNotFoundException`, etc.

## Unchecked Exceptions

Diese sind die Ausnahmen, die während der Laufzeit auftreten. Sie müssen nicht explizit in der Methodensignatur mit `throws` deklariert werden. Unchecked Exceptions sind in der Regel das Ergebnis von Programmierfehlern. Beispiele für Unchecked Exceptions sind `NullPointerException`, `ArrayIndexOutOfBoundsException`, `ArithmeticException`, etc.

## Try, Catch, Finally

'try' ist ein Schlüsselwort, das einen Block von Code umschließt, in dem eine Ausnahme auftreten könnte.

'catch' ist ein Schlüsselwort, das verwendet wird, um die Ausnahme zu fangen und zu behandeln, die im try-Block aufgetreten ist.

'finally' ist ein Schlüsselwort, das einen Block von Code umschließt, der immer ausgeführt wird, unabhängig davon, ob eine Ausnahme aufgetreten ist oder nicht.

## Beispiel

```java
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
```