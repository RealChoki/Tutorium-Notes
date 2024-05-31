# Kapitel 6 Klassen

## Einführung in Klassen und Objekte

### Merkmale einer Klasse:
- Eine Klasse ist eine Blaupause für Objekte. Sie definiert die Attribute (Datenfelder) und Methoden (Funktionen), die ein Objekt besitzen kann.
- Klassen in Java werden mit dem Schlüsselwort `class` definiert.
- Eine Klasse kann Attribute (Variablen) und Methoden (Funktionen) enthalten.

### Unterschied zwischen Klasse und Objekt:
- **Klasse**: Eine Klasse ist eine Vorlage oder ein Bauplan, der die Struktur und das Verhalten eines bestimmten Objekttyps definiert. Sie beschreibt die gemeinsamen Merkmale und Fähigkeiten dieser Objekte.
- **Objekt**: Ein Objekt ist eine Instanz einer Klasse. Es repräsentiert ein konkretes Exemplar dieser Klasse und hat spezifische Werte für die Attribute der Klasse.

### Beispiel:
- Klasse: `Auto`
- Objekte: `meinAuto`, `deinAuto`

## Klassen in Java

### Definition einer Klasse:
- Eine Klasse wird mit dem Schlüsselwort `class` definiert, gefolgt vom Klassennamen und einem Klassendefinitionsblock.
```java
public class Auto {
  // Attribute
  String farbe;
  String modell;
  int baujahr;

  // Methoden
  void fahren() {
    System.out.println("Das Auto fährt.");
  }
  
  void bremsen() {
    System.out.println("Das Auto bremst.");
  }
}
```

### Attribute:
- Attribute sind Variablen innerhalb einer Klasse, die den Zustand eines Objekts beschreiben.
- Sie werden innerhalb des Klassendefinitionsblocks, aber außerhalb von Methoden definiert.

### Methoden:
- Methoden sind Funktionen, die das Verhalten eines Objekts definieren.
- Sie werden innerhalb des Klassendefinitionsblocks definiert.

### Beispiel:
```java
public class Auto {
  String farbe; // Attribut
  String modell; // Attribut
  int baujahr; // Attribut

  // Methode
  void fahren() {
    System.out.println("Das Auto fährt.");
  }

  // Methode
  void bremsen() {
    System.out.println("Das Auto bremst.");
  }
}
```

## Encapsulation (Kapselung):
- Kapselung ist ein Prinzip der objektorientierten Programmierung, das darauf abzielt, die Daten (Attribute) einer Klasse vor unberechtigtem Zugriff zu schützen und den Zugriff auf diese Daten nur über definierte Methoden zu erlauben.
- Dazu werden die Attribute in der Regel als `private` deklariert und der Zugriff erfolgt über `public` Methoden (Getter und Setter).

### Beispiel:
```java
public class Auto {
  private String farbe;
  private String modell;
  private int baujahr;

  // Getter-Methode
  public String getFarbe() {
    return farbe;
  }

  // Setter-Methode
  public void setFarbe(String farbe) {
    this.farbe = farbe;
  }

  // Getter-Methode
  public String getModell() {
    return modell;
  }

  // Setter-Methode
  public void setModell(String modell) {
    this.modell = modell;
  }

  // Getter-Methode
  public int getBaujahr() {
    return baujahr;
  }

  // Setter-Methode
  public void setBaujahr(int baujahr) {
    this.baujahr = baujahr;
  }
}
```

## Das Schlüsselwort `this`:
- `this` ist ein spezielles Schlüsselwort in Java, das sich auf das aktuelle Objekt der Klasse bezieht.
- Es wird häufig verwendet, um auf Instanzvariablen zuzugreifen, wenn es eine Namenskonflikt mit Methodenparametern gibt.

### Beispiel:
```java
public class Auto {
  private String farbe;
  private String modell;
  private int baujahr;

  public Auto(String farbe, String modell, int baujahr) {
    this.farbe = farbe; // Verweist auf das Attribut der Klasse
    this.modell = modell; // Verweist auf das Attribut der Klasse
    this.baujahr = baujahr; // Verweist auf das Attribut der Klasse
  }
}
```

## Referenzdatentypen:
- Beim Arbeiten mit Referenzdatentypen (wie Objekte) speichern die Variablen nicht die eigentlichen Werte, sondern Referenzen (Adressen) auf die Speicherorte der Objekte.
- Änderungen an einem Objekt, auf das eine Referenz verweist, wirken sich auf das ursprüngliche Objekt aus.

### Beispiel:
```java
public class Beispiel {
  public static void main(String[] args) {
    Auto auto1 = new Auto("Rot", "BMW", 2020);
    Auto auto2 = auto1;
    
    auto2.setFarbe("Blau");
    
    System.out.println(auto1.getFarbe()); // Ausgabe: Blau
  }
}
```

## Konstruktoren:
- Konstruktoren sind spezielle Methoden, die beim Erstellen eines Objekts aufgerufen werden und das Objekt initialisieren.
- Konstruktoren haben den gleichen Namen wie die Klasse und keinen Rückgabewert.

### Beispiel:
```java
public class Auto {
  private String farbe;
  private String modell;
  private int baujahr;

  // Konstruktor
  public Auto(String farbe, String modell, int baujahr) {
    this.farbe = farbe;
    this.modell = modell;
    this.baujahr = baujahr;
  }

  // Getter-Methoden und andere Methoden hier
}
```

### Objekte mit Konstruktoren erstellen:
```java
public class Beispiel {
  public static void main(String[] args) {
    Auto meinAuto = new Auto("Rot", "BMW", 2020);
    System.out.println("Farbe: " + meinAuto.getFarbe());
    System.out.println("Modell: " + meinAuto.getModell());
    System.out.println("Baujahr: " + meinAuto.getBaujahr());
  }
}
```