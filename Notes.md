# Java Notizen

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

## Allgemein Arrays

### Explizit:
- Wenn wir ein leeres Array mit 3 freien Plätzen haben:
```java
int[] arrA = new int[3];
```

- können wir jedem freien Platz einen Wert zuweisen:
```java
arrA[0] = 7;
arrA[1] = 8;
arrA[2] = 9;
```

### Implizit:
- Aber wir können auch direkt beim Erstellen des Arrays Werte zuweisen:
```java
int[] arrB = {7, 8, 9};
```

## Allgemein mehrdimensionalen Array

### Explizit:
- Wenn wir ein leeres 2D-Array mit 3 Reihen und 2 Spalten haben:
```java
int[][] arr = new int[3][2];
```

- können wir jedem freien Platz einen Wert zuweisen:
```java
arr[0][0] = 1;
arr[0][1] = 2;
arr[1][0] = 3;
arr[1][1] = 4;
arr[2][0] = 5;
arr[2][1] = 6;
```

### Implizit:
- Aber wir können auch direkt beim Erstellen des Arrays Werte zuweisen:
```java
int[][] arr3x2 = {{1, 2}, {2, 3}, {3, 4}};
```

## Allgemein Loops

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
- `int i = 0`: Dies ist der Startpunkt der Schleife. Die Schleife beginnt beim Index 0 des Arrays.
- `i < numbers.length`: Dies ist der Endpunkt der Schleife. Die Schleife wird fortgesetzt, solange der Index `i` kleiner ist als die Länge des Arrays. `numbers.length` gibt 3 zurück.
- `i++`: Dies ist der Schritt, den die Schleife bei jedem Durchgang macht. Hier wird der Zähler `i` um eins erhöht.
```java
int[] numbers = {5, 10, 15};
int sum2 = 0;

for (int i = 0; i < numbers.length; i++) {
    sum2 += numbers[i];
}
```

## Sichtbarkeit public, private, default
(public) Elemente sind von jeder anderen Klasse aus zugänglich auch andere Pakete.
(private) Private Elemente sind nur innerhalb derselben Klasse zugänglich.
(default) Elemente sind nur innerhalb des Pakets zugänglich, in dem sie deklariert wurden.

## Vererbung
Vererbung basiert auf der Idee, dass "Obereklassen" ihren Untereklassen Variablen und Methoden vererben.
```java
public class Car extends Vehicle
```

## Konstruktor Vererbung
Sofern kein parameterloser Konstruktor für eine Oberklasse existiert, benötigt die Unterklasse einen Konstruktor, in dem explizit auch mit super(<Parameter>) der Konstruktor der Oberklasse aufgerufen wird.

Oft beinhaltet der Konstruktor der Unterklasse somit alle Attribute der Oberklasse sowie die eigenen.

```java
public class Vehicle {
    private String manufacturer;
    private int year;

    public Vehicle(String manufacturer, int year) {
        this.manufacturer = manufacturer;
        this.year = year;
    }
}

public class Car extends Vehicle {
    private int numberDoors;
    private boolean isConvertible;
    
    public Car(String manufacturer, int year, int numberDoors, boolean isConvertible) {
        super(manufacturer, year);
        this.numberDoors = numberDoors;
        this.isConvertible = isConvertible;
    }
}

Car car = new Car("VW", 2008, 4, false);
```

## Methoden Signatur
Name der Methode. Anzahl, Typ und Typreihenfolge der Parameter.

## Methoden überschreiben
Bereitstellen verschiedener Funktionalitäten durch gleichnamige Methoden in Ober- und Unterklasse
```java
public class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}
```

## Methoden überladen
Bereitstellen gleicher/ähnlicher Funktionalität durch gleichnamige Methoden mit verschiedenen Parameterlisten
```java
public class Auto{
    private String marke;
    private String farbe;
    private int geschwindigkeit;

    public Auto(String marke, String farbe, int geschwindigkeit) {
        this.marke = marke;
        this.farbe = farbe;
        this.geschwindigkeit = geschwindigkeit;
    }

    public Auto() {
        
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public void setGeschwindigkeit(int geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public static void main(String[] args) {
        Auto meinAuto = new Auto("Volkswagen", "Blau", 0);
        
        Auto meinAuto2 = new Auto();
        meinAuto2.setMarke("Volkswagen");
        meinAuto2.setFarbe("Blau");
        meinAuto2.setGeschwindigkeit(0);
    }
}
```

## final
final Variable/Attribut: Der Wert ist nicht mehr veränderbar
```java
final int blub = 10;
blub = 20; // Fehler
```

final Methode: Methode kann in abgeleiteten Klassen nicht überschrieben werden
```java
class A {
    final void blub() {
        System.out.println("blub in A");
    }
}

class B extends A {
    @Override
    void blub() {
        System.out.println("blub in B");
    }
}
```

final Klasse: Die Klasse kann keine Kindklasse/Subklasse haben
```java
final class FinalKlasse {
    void blub() {
        System.out.println("blub in FinalKlasse");
    }
}

class Unterklasse extends FinalKlasse {
    @Override
    void blub() {
        System.out.println("blub in Unterklasse");
    }
}
```

## static
Mit static gekennzeichnete Attribute/Methoden gehören zu einer Klasse anstatt zu einem Objekt.
```java
class MyClass {
    static int myVariable;

    static void myMethod() {
        System.out.println("This is a static method.");
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass.myVariable = 10;
        System.out.println(MyClass.myVariable); // Ausgabe: 10

        MyClass.myMethod(); // Ausgabe: This is a static method.
    }
}
```

## Nicht static
Nicht static gekennzeichnete Attribute/Methoden gehören zu einem Objekt anstatt zu einer Klasse.
```java
class MyClass2 {
    private int myVariable2; 

    void myMethod2() { 
        System.out.println("This is a non-static method.");
    }

    public void setMyVariable2(int myVariable2) {
        this.myVariable2 = myVariable2;
    }

    public int getMyVariable2() {
        return myVariable2;
    }
}

public class Main2 {
    public static void main(String[] args) {
        MyClass2 myObject = new MyClass2();

        myObject.setMyVariable2(10);
        System.out.println(myObject.getMyVariable2()); // Ausgabe: 10

        myObject.myMethod2(); // Ausgabe: This is a non-static method.
    }
}
```

## Mehrere Klassen in einer Datei
Nur eine Klasse darf public sein und muss den Dateinamen tragen.
```java
// Top-level public class
public class MyClass {
    public void myClassMethod() {
        System.out.println("Method in MyClass");
    }
}

// Non-public class in the same file
class AnotherClass {
    public void anotherClassMethod(MyClass myClassInstance) {
        myClassInstance.myClassMethod(); // Accessing method in MyClass
        System.out.println("Method in AnotherClass");
    }
}
```

## Geschachtelte Klassen in einer Datei
Nur eine Klasse darf public sein und muss den Dateinamen tragen.
```java
public class OuterClass {
    private int myVar = 10;

    // Inner class
    class InnerClass {
        public void accessOuter() {
            System.out.println("Value from outer class: " + myVar);
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.accessOuter();
    }
}
```