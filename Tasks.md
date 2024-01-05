# Java Exceptions

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

## Erste Aufgabe
TODO: Erstellen sie eine Klasse z.B. `ErsteAufgabe` die eine main Methode entaehlt.
TODO: Erstellen Sie ein Array mit drei Elementen (z.B. zahlen).
TODO: Versuchen `try` Sie, auf das nicht existierende vierte Element des Arrays zuzugreifen.
TODO: Fangen `catch` Sie die Ausnahme ab und geben Sie eine Fehlermeldung aus die ansagt, dass das vierte Element nicht existiert.
TODO: Geben Sie eine Nachricht aus, die immer angezeigt wird, unabhängig davon, ob eine Ausnahme aufgetreten ist oder nicht `finally` die `blub` ausgibt

## Zweite Aufgabe

``` java
public class MultipleErrors {
    public static void main(String[] args) {
        try {
            processArray(new int[]{1, 2, 3}, "abc", new String[]{});
        } 
        // TODO: Schreiben Sie drei catch-Blöcke für die drei Fehler, die in der Methode processArray auftreten. Jeder catch-Block sollte seine Fehler Nummer ausgeben z.B. "Fehler 1 ist aufgetreten". Suchen sie die drei ricthige Exceptions (ArrayIndexOutOfBoundsException, NullPointerException, NumberFormatException, ArithmeticException, IllegalArgumentException).
        // TODO: Korregieren sie das code sodass nur finally augegeben wird.
        finally {
            System.out.println("Ich sollte keine fehler ueber mich haben");
        }
    }

    public static void processArray(int[] array, String str, String[] strArray) { 
        // Fehler 1
        for (int i = 0; i <= array.length; i++) {
            int element = array[i];
        }

        // Fehler 2
        int number = Integer.parseInt(str);

        // Fehler 3
        int length = strArray.length;
        int result = number / length;
    }
}
```

## Dritte Aufgabe

```java
public class Throw {
    public static void main(String[] args) {
        Throw main = new Throw();
        main.calculate(10, 0);
    }

    private void calculate(int dividend, int divisor) {
        // TODO: Die Methode "calculate" sollte versuchen die Methode "divide" aufzurufen und dabei einen "ArithmeticException" abfangen. Wenn eine "ArithmeticException" auftritt, sollte sie "Ooops..." ausgeben.
    }

    private void divide(int dividend, int divisor) throws ArithmeticException {
       // TODO: Die Methode "divide" sollte die Methode "validate" aufrufen und den "divisor" geben und dabei eine "ArithmeticException" werfen. Es sollte auch eine variable beeinhalten "result" die das wert vom dividieren des "dividend" und "divisor" besitzt. Dieses Wert sollte augegeben werden z.B. "Result: __".
    }

    private void validate(int divisor) throws ArithmeticException {
        // TODO: Die Methode "validate" sollte eine "ArithmeticException" direkt werfen, wenn der übergebene Divisor 0 ist"
    }
    // TODO: Korregieren sie das code sodass die Antwort "result" ausgegeben wird.
}
```