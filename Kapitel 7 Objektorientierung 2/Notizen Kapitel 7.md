# Kapitel 7 Objektorientierung 2

## Sichtbarkeit: `public`, `private`, `default`

- **`public`**: Elemente sind von jeder anderen Klasse aus zugänglich, auch aus anderen Paketen.
- **`private`**: Elemente sind nur innerhalb derselben Klasse zugänglich.
- **`default`**: Elemente sind nur innerhalb des Pakets zugänglich, in dem sie deklariert wurden.


## Vererbung
- Vererbung ermöglicht es, dass Unterklassen die Variablen und Methoden ihrer Oberklasse übernehmen.
- Syntax:
```java
public class Car extends Vehicle {
  // Car erbt Eigenschaften und Methoden von Vehicle
}
```


## Konstruktorvererbung
- Wenn die Oberklasse keinen parameterlosen Konstruktor hat, muss die Unterklasse einen Konstruktor implementieren, der mit `super(<Parameter>)` den Konstruktor der Oberklasse aufruft.

### Beispiel:
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
        super(manufacturer, year); // Aufruf des Oberklassenkonstruktors
        this.numberDoors = numberDoors;
        this.isConvertible = isConvertible;
    }
}

// Objekterstellung
Car car = new Car("VW", 2008, 4, false);
```


## Methodensignatur
- Die **Signatur** einer Methode besteht aus:
  - dem Namen der Methode,
  - der Anzahl der Parameter,
  - dem Typ der Parameter,
  - der Reihenfolge der Parameter.


## Methoden überschreiben
- Eine Methode in der Unterklasse überschreibt eine Methode der Oberklasse mit der gleichen Signatur.
- Verwendung des `@Override`-Annotations.

### Beispiel:
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
- Überladen bedeutet, dass in einer Klasse Methoden mit gleichem Namen, aber unterschiedlicher Parameterliste existieren.

### Beispiel:
```java
public class Auto {
    public void setFarbe(String farbe) {
        // Setzt die Farbe
    }

    public void setFarbe(String farbe, boolean metallic) {
        // Setzt die Farbe und ob sie metallic ist
    }
}
```


## `final`
- **`final` Variable/Attribut**: Der Wert kann nach der Initialisierung nicht mehr geändert werden.
    ```java
    final int konstante = 10;
    konstante = 20; // Fehler
    ```
- **`final` Methode**: Kann in abgeleiteten Klassen nicht überschrieben werden.
    ```java
    class A {
        final void methode() {
            System.out.println("Finale Methode");
        }
    }
    ```
- **`final` Klasse**: Kann nicht erweitert werden.
    ```java
    final class FinalKlasse { }
    ```


## `static`
- **`static` Attribute/Methoden**:
  - Gehören zur Klasse, nicht zu einem Objekt.
  - Können direkt mit dem Klassennamen aufgerufen werden.
  ```java
  class MyClass {
      static int myVariable;

      static void myMethod() {
          System.out.println("Static Methode.");
      }
  }
  
  MyClass.myMethod();
  ```
- **Nicht `static`**:
  - Gehören zu einem Objekt und benötigen eine Instanz der Klasse.
  ```java
  MyClass myObj = new MyClass();
  myObj.myMethod();
  ```