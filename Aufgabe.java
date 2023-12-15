public class Aufgabe {


    //! KLASSE FAHRZEUG
    // TODO: package bestimmen

    // TODO: Definiere eine Basisklasse namens "Fahrzeug" mit den folgenden Objekt Attributen (marke, baujahr) und einen klassen attribut (static) "anzahlFahrzeuge".

        // TODO: Implementiere einen Konstruktor für die Klasse "Fahrzeug", der die Object Attribute initialisiert.
            // TODO: Erhöhe "anzahlFahrzeuge" jedes Mal, wenn eine neue Instanz "Fahrzeug" erstellt wird.

        // TODO: Implementiere eine Getter methode für 'marke'.

        // TODO: Implementiere Getter methode für 'baujahr'.

        // TODO: Implementiere eine Methode "infoAnzeigen()", die die Informationen des Fahrzeugs ausgibt (Marke, Baujahr).

        // TODO: Füge eine "final" Methode "starten" hinzu, die eine Meldung ausgibt, dass das Fahrzeug gestartet wurde.

   
    //! KLASSE AUTO
    // TODO: package bestimmen

    // TODO: Erstelle eine abgeleitete Klasse namens "Auto", die von der Klasse "Fahrzeug" erbt.
    // TODO: Füge der Klasse "Auto" ein zusätzliches Objekt Attribut "anzahlTueren" als eine erweiterung hinzu.

        // TODO: Implementiere einen Konstruktor für die Klasse "Auto", der sowohl die Object Attribute der Basisklasse als auch das neue Attribut "anzahlTueren" initialisiert.
            // TODO: Rufe den Konstruktor der Basisklasse auf mit "super()"
        

        // TODO: Überschreibe "Override" die Methode "infoAnzeigen()" in der Klasse "Auto", um auch die Anzahl der Türen auszugeben.
        // TODO: Verwende getMarke() und getBaujahr() um die werte zu bekommen.
    

    //! KLASSE LKW
    // TODO: package bestimmen

    // TODO: Erstelle eine weitere abgeleitete Klasse namens "Lkw", die ebenfalls von der Klasse "Fahrzeug" erbt. 
    // TODO: Füge der Klasse "Lkw" ein zusätzliches Attribut "ladung" als eine erweiterung hinzu.

        // TODO: Implementiere einen Konstruktor für die Klasse "Lkw", der sowohl die Object Attribute der Basisklasse als auch das neue Attribut "ladung" initialisiert.
            // TODO: Rufe den Konstruktor der Basisklasse auf mit "super()"
        
        // TODO: Überschreibe die Methode "infoAnzeigen()" in der Klasse "Lkw", um auch die Ladung auszugeben.
        // TODO: Verwende die Methode "infoAnzeigen()" der Oberklasse mit "super.infoAnzeigen()" um die werte (Marke, Baujahr) zu bekommen.
    

    //! KLASSE MAIN
    // TODO: package bestimmen

    // TODO: Definiere eine Basisklasse namens "Main".
  
        // TODO: Definiere eine "main" Methode.
            // TODO: In der "main" Methode, erstelle Instanzen von "Auto" und "Lkw".
            // Auto Bsp -> Marke = "VW", Baujar = 2022, Anzahltüren = 4
            // Lkw Bsp -> Marke = "Mercedes", Baujar = 2021, Ladung = 10.5

            // TODO: Zeige die Informationen der erstellten Fahrzeuge an "infoAnzeigen" mit Uberschriften "Erstes Fahrzeug:" und "Zweites Fahrzeug:".

            // TODO: Zeige die Gesamtanzahl der erstellten Fahrzeuge an "anzahlFahrzeuge".

            // TODO: Rufe die Methode "starten" für beide Fahrzeuge auf.

            // TODO: Versuche die Methode "starten" für beide Fahrzeuge zu überschreiben. Was passiert? und warum?
            

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////7
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////7
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////7
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////7
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////7
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////7
    

    //! Vererbung
    // Vererbung basiert auf der Idee, dass "Obereklassen" ihren Untereklassen Variablen und Methoden vererben.
    // public class Car extends Vehicle

    //! Konstruktor Vererbung
    // Sofern kein parameterloser Konstruktor für eine Oberklasse
    // existiert, benötigt die Unterklasse einen Konstruktor, in dem
    // explizit auch mit super(<Parameter>) der Konstruktor der
    // Oberklasse aufgerufen wird

    // Oft beinhaltet der Konstruktor der Unterklasse somit alle
    // Attribute der Oberklasse sowie die eigenen
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

    //! Methoden Signatur
    // Name der Methode. Anzahl, Typ und Typreihenfolge der Parameter

    //! Methoden überschreiben
    // Bereitstellen verschiedener Funktionalitäten durch gleichnamige Methoden in Ober- und Unterklasse
    // Mit @Override kommentieren um Fehler zu vermeiden und verständlicher zu machen
    // Bedingung: gleiche Signatur + Rückgabetyp
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

    //! Methoden überladen
    // Bereitstellen gleicher/ähnlicher Funktionalität durch gleichnamige Methoden mit verschiedenen Parameterlisten
    // Bedingung: unterschiedliche Parameter bei selbem Methodennamen
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


    //! final
    // final Variable/Attribut: Der Wert ist nicht mehr veränderbar
    final int blub = 10;
    blub = 20; // Fehler

    // final Methode: Methode kann in abgeleiteten Klassen nicht überschrieben werden
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

    // final Klasse: Die Klasse kann keine Kindklasse/Subklasse haben
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

    //! static
    // Mit static gekennzeichnete Attribute/Methoden gehören zu einer Klasse anstatt zu einem Objekt.
    // werden mit dem Klassennamen aufgerufen
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


    //! Nicht static
    // Nicht static gekennzeichnete Attribute/Methoden gehören zu einem Objekt anstatt zu einer Klasse.
    // werden mit dem Objektnamen aufgerufen
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
}



