# Kapitel 3 Methoden

## Allgemein Methoden

### Was ist eine Methode?
Eine Methode in Java ist eine Sammlung von Anweisungen, die eine bestimmte Aufgabe ausführen. Sie können Code in Methoden organisieren, um ihn wiederzuverwenden und zu strukturieren.
- **Sichtbarkeit** (`public`): Gibt an, von wo aus die Methode aufgerufen werden kann.
- **Rückgabetyp** (`int`): Bestimmt den Typ des Werts, den die Methode zurückgibt. Wenn die Methode nichts zurückgibt schrieben wir `void`.
- **Methodenname** (`berechneSumme`): Der Name, der verwendet wird, um die Methode aufzurufen.
- **Parameterliste** (`int zahl1, int zahl2`): Die Liste der Parameter, die die Methode erwartet.
```java
public int berechneSumme(int zahl1, int zahl2) {
    int summe = zahl1 + zahl2;
    return summe;
}
```

### Wie definiere ich eine Methode mit/ohne Parameter(n)?
Um eine Methode ohne Parameter zu definieren, verwendest du die folgende Syntax:
```java
public void meineMethode() {
    // Code hier
}
```
Und um eine Methode mit Parametern zu definieren, gibst du die Parameter in den Klammern nach dem Methodennamen an:
```java
public void meineMethode(int param1, String param2) {
    // Code hier
}
```

### Wie funktioniert ein Methodenaufruf?
Um eine Methode aufzurufen, verwendest du einfach den Namen der Methode gefolgt von Klammern, in denen du gegebenenfalls die Argumente für die Parameter angibst. Zum Beispiel:
```java
meineMethode();
meineMethode(42, "Hallo");
```

### Welche Kommentar-Typen gibt es in Java?
In Java gibt es zwei Haupttypen von Kommentaren:
- Einzeilige Kommentare mit `//`, die nur für eine Zeile gelten.
- Mehrzeilige Kommentare zwischen `/*` und `*/`, die für mehrere Zeilen gelten.
- Javadoc Diese Kommentare beginnen mit `/**` und enden mit `*/`. Javadoc verwendet spezielle Tags die mit `@` anfangen.
```java
// Dies ist ein einzeiliger Kommentar.

/*
Dies ist ein mehrzeiliger Kommentar.
Er erstreckt sich über mehrere Zeilen.
*/

/**
 * Dies ist ein Javadoc-Kommentar für die Methode.
 * Es gibt detaillierte Informationen über die Methode,
 * einschließlich ihrer Parameter und Rückgabewerte.
 * 
 * @param param1 Eine Beschreibung des ersten Parameters
 * @param param2 Eine Beschreibung des zweiten Parameters
 * @return Eine Beschreibung des Rückgabewerts
 */
public int meineMethode(int param1, String param2) {
    // Code hier
    return 42;
}
```