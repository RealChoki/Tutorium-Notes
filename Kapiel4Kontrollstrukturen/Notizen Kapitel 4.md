# Kapitel 4 Kontrollstrukturen

## Allgemein Kontrollstrukturen

### Enhanced for-loop:
- `int number`: Hier erstellen wir eine Variable, die jedes Element in unserem Array repräsentiert.
- `numbers`: Hier wählen wir das Array aus, das wir durchlaufen möchten.

```java
int[] numbers = {5, 10, 15};
int sum1 = 0;

for (int number : numbers) {
    sum1 += number;
}
```

### Traditional for-loop:
- `int i = 1`: Dies ist der Startpunkt der Schleife. Die Schleife beginnt bei 1.
- `i < limit`: Dies ist der Endpunkt der Schleife. Die Schleife wird fortgesetzt, solange der Index `i`  kleiner oder gleich dem Limit ist.
- `i++`: Dies ist der Schritt, den die Schleife bei jedem Durchgang macht. Hier wird der Zähler `i` um eins erhöht.

```java
int limit = 5;

for (int i = 1; i <= limit; i++) {
    System.out.println(i);
}
```

In diesem Beispiel wird die Schleife von 1 bis zum `Limit` (5) durchlaufen und gibt die Werte 1, 2, 3, 4 und 5 aus.

### While-Schleife:
- `int i = 1`: Dies ist der Startpunkt der Schleife. Die Schleife beginnt bei 1.
- `i <= limit`: Dies ist die Bedingung für die Schleife. Die Schleife wird fortgesetzt, solange der Zähler `i` kleiner oder gleich dem Limit ist.
- `i++`: Dies ist der Schritt, den die Schleife bei jedem Durchgang macht. Hier wird der Zähler `i` um eins erhöht.

```java
int limit = 5;
int i = 1; 

while (i <= limit) { 
    System.out.println(i); 
    i++; 
}
```

In diesem Beispiel wird die Schleife von 1 bis zum `Limit` (5) durchlaufen und gibt die Werte 1, 2, 3, 4 und 5 aus.

### Do-While-Schleife:
Die Do-While-Schleife führt einen Block von Code mindestens einmal aus und überprüft dann eine Bedingung, um zu entscheiden, ob der Block wiederholt werden soll.

```java
int limit = 5;
int i = 1; 

do {
    System.out.println(i); 
    i++; 
} while (i <= limit); 
```

In diesem Beispiel wird der Block von Code innerhalb der Do-While-Schleife mindestens einmal ausgeführt, bevor die Bedingung `i <= limit` überprüft wird. Wenn die Bedingung wahr ist, wird der Block wiederholt, andernfalls wird die Schleife beendet

### Ternärer Operator:
Der ternäre Operator ist eine kompakte Möglichkeit, eine bedingte Anweisung in einer einzigen Zeile auszudrücken. Es hat die folgende Syntax:

```java
variable = (Bedingung) ? Ausdruck1 : Ausdruck2;
```

Wenn die Bedingung wahr ist, wird Ausdruck1 ausgewertet und der Wert der Variablen wird darauf gesetzt. Andernfalls wird Ausdruck2 ausgewertet und sein Wert wird zugewiesen. Hier ist ein Beispiel:

```java
int alter = 20;
String status = (alter >= 18) ? "Volljährig" : "Minderjährig";
```

In diesem Beispiel wird überprüft, ob die Variable `zahl` gerade oder ungerade ist. Wenn `zahl % 2` (Rest der Division durch 2) gleich 0 ist, wird "gerade" zugewiesen, ansonsten wird "ungerade" zugewiesen.

### If-Else-If-Else-Anweisungen:
If-Else-If-Else-Anweisungen werden verwendet, wenn Sie eine Bedingung prüfen und basierend darauf verschiedene Aktionen ausführen möchten. Hier ist die allgemeine Struktur:

```java
if (Bedingung1) {
    // Code, der ausgeführt wird, wenn Bedingung1 wahr ist
} else if (Bedingung2) {
    // Code, der ausgeführt wird, wenn Bedingung1 falsch und Bedingung2 wahr ist
} else {
    // Code, der ausgeführt wird, wenn keine der Bedingungen wahr ist
}
```

Sie können beliebig viele `else if`-Blöcke haben, aber nur einen `if`-Block und einen optionalen `else`-Block. Hier ist ein Beispiel:

```java
int note = 75;

if (note >= 90) {
    System.out.println("A");
} else if (note >= 80) {
    System.out.println("B");
} else if (note >= 70) {
    System.out.println("C");
} else {
    System.out.println("D");
}
```

In diesem Beispiel wird die Note einer Schülerin überprüft und entsprechend wird ein Buchstabe ausgegeben, der das Leistungsniveau repräsentiert.

### Switch-Case-Anweisungen:
Switch-Case-Anweisungen werden verwendet, wenn Sie eine Variable gegen eine Liste von möglichen Werten überprüfen möchten. Die Syntax sieht folgendermaßen aus:

```java
switch (Ausdruck) {
    case Wert1:
        // Code, der ausgeführt wird, wenn der Ausdruck Wert1 entspricht
        break;
    case Wert2:
        // Code, der ausgeführt wird, wenn der Ausdruck Wert2 entspricht
        break;
    // Weitere cases...
    default:
        // Code, der ausgeführt wird, wenn keiner der Werte übereinstimmt
}
```

Jeder `case`-Block wird mit einem `break` beendet, um sicherzustellen, dass die Switch-Anweisung nach Ausführung des entsprechenden Blocks verlassen wird. Wenn kein `break` verwendet wird, führt die Ausführung fort und kann zu unerwartetem Verhalten führen. Hier ist ein Beispiel:

```java
int tag = 3;

switch (tag) {
    case 1:
        System.out.println("Montag");
        break;
    case 2:
        System.out.println("Dienstag");
        break;
    case 3:
        System.out.println("Mittwoch");
        break;
    // Weitere cases...
    default:
        System.out.println("Kein gültiger Tag");
}
```

In diesem Beispiel wird der Wert der Variable `tag` mit verschiedenen Werten verglichen, und je nach Wert wird der entsprechende Wochentag ausgegeben. Wenn der Wert nicht übereinstimmt, wird "Kein gültiger Tag" ausgegeben.