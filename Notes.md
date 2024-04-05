# Java Notizen

## Allgemein Arrays

### Explizit:
```java
int[] arrA = new int[3];
```

### Implizit:
```java
int[] arrB = {7, 8, 9};
```

## Allgemein Mehrdimensionale Arrays
```java
int[][] arr = new int[3][2];
int[][] arr3x2 = {{1, 2}, {2, 3}, {3, 4}};
```

### Declaring an empty multidimensional array
```java
int[][] emptyMultiArray;
```

### Initializing the array with dimensions
```java
emptyMultiArray = new int[3][];  // 3 rows, but columns are not specified yet
```

### Initializing each row with different lengths
```java
emptyMultiArray[0] = new int[3];
emptyMultiArray[1] = new int[3];
emptyMultiArray[2] = new int[2];
```

## Allgemein Loops

```java
int[] array = {2023, 5, 16, -42, 0, -99};
int sum1 = 0;
int sum2 = 0;

// Enhanced for-loop
for (int number : array) {
    sum1 += number;
}

// Traditional for-loop
for (int i = 0; i < arr.length; i++) {
    sum2 += arr[i];
}
```

## Aufgabe
```java
int[][] matrixArr = {
        {9, 2, 5, 1},
        {2, 7, 1, 8},
        {2, 1, 3, 6},
        {1, 8, 5, 0},
};

/*
Gewünschte Ausgabe:
9 2 5 1
2 7 1 8
2 1 3 6
1 8 5 0 
*/

for (int rowI = 0; rowI < matrixArr.length; rowI++) {
    for (int colI = 0; colI < matrixArr[rowI].length; colI++) {
        System.out.print(matrixArr[rowI][colI] + " ");
    }
    System.out.println();
}

for (int[] row : matrixArr) {
    for (int value : row) {
        System.out.print(value + " ");
    }
    System.out.println();
}
```

## Sum of Array
```java
public class SumOfArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int num : array) {
            sum += num;
        }

        System.out.println("Sum of array elements: " + sum);
    }
}
```

## Find Max Value
```java
public class MaxValueInArray {
    public static void main(String[] args) {
        int[] array = {12, 45, 67, 23, 9};
        int max = array[0];

        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Maximum value in array: " + max);
    }
}
```

## Print Even Number
```java
public class EvenNumbers {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        for (int num : array) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}
```

## Print Pattern
```java
public class PrintPattern {
    // Method to print a pattern based on the number of rows
    public static void printPattern(int numberOfRows) {
        // Outer loop for the number of numberOfRows
        for (int i = 0; i < numberOfRows; i++) {
            // Inner loop for printing asterisks in each row
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            // Move to the next line after each row is printed
        }
    }

    public static void main(String[] args) {
        // Set the number of rows to 5
        int numberOfRows = 5;
        
        // Call the method to print the pattern with the specified number of rows
        printPattern(numberOfRows);
    }
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