public class Notes {

    //! ALLGEMEIN ARRAYS
    // Explizit:
    int[] arrA = new int[3];
    // Implizit:
    int[] arrB = {7, 8, 9};



    //! ALLGEMEIN MEHRDIMENSIONALE ARRAYS
    int[][] arr = new int[3][2];
    int[][] arr3x2 = {{1, 2}, {2, 3}, {3, 4}};

    // Declaring an empty multidimensional array
    int[][] emptyMultiArray;

    // Initializing the array with dimensions
    emptyMultiArray = new int[3][];  // 3 rows, but columns are not specified yet

    // Initializing each row with different lengths
    emptyMultiArray[0] = new int[3];
    emptyMultiArray[1] = new int[3];
    emptyMultiArray[2] = new int[2];



    //! ALLEGEMEIN LOOPS
    int[] arr = {2023, 5, 16, -42, 0, -99};
    int sum1 = 0;
    int sum2 = 0;

    // Enhanced for-loop
    for (int nr : arr) {
        sum1 += nr;
        
    }
    // Traditional for-loop
    for (int i = 0; i < arr.length; i++) {
        sum2 += arr[i];
    }



    //! AUFGABE
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


    //! SUM OF ARRAY
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


    //! FIND MAX VALUE
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


    //! PRINT EVEN NUMBER
    public class EvenNumbers {
        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            
            for (int num : array) {
                if (num % 2 == 0) {
                    System.out.println(num);
                }
                if (num % 2 == 0) {
                    System.out.println(num);
                }
                if (num % 2 == 0) {
                    System.out.println(num);
                }
                if (num % 2 == 0) {
                    System.out.println(num);
                }
                if (num % 2 == 0) {
                    System.out.println(num);
                }
            }
        }
    }


    //! PRINT PATTERN
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

    //! Sichtbarkeit public, private, default
    // (public) Elemente sind von jeder anderen Klasse aus zugänglich auch andere pakete.
    // (private) Private Elemente sind nur innerhalb derselben Klasse zugänglich. 
    // (default) Elemente sind nur innerhalb des Pakets zugänglich, in dem sie deklariert wurden.



    

    //!
    
    // CTRl + F --> Code suchen
    // CTRl + D --> Wort an mehrere stellen gleichzeitig andern
    // CTRL + Z --> Rückgängig machen
    // CTRL + Y --> Wiederholen
    // CTRL + pfeiltaste links / rechts --> Wort für Wort springen
    
    // ALT + Links click --> In verschiednen Stellen im Code gleichzeitg schreiben
    // ALT + pfeiltaste oben / unten --> Code Nach oben / unten verschieben
    // ALT + Shift + Pfeiltaste oben / unten --> Code Duplizieren
    
    // pos1 --> Anfang der Zeile
    // Ende --> Ende der Zeile

    // tab --> Einrücken
    // Shift + tab --> Einrückung entfernen

    //! Vererbung
    //Vererbung basiert auf der Idee, dass "Obereklassen" ihren Untereklassen Variablen und Methoden vererben.

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

    //! final
    // final Variable/Attribut: Der Wert ist nicht mehr veränderbar
    // final Methode: Methode kann in abgeleiteten Klassen nicht überschrieben werden
    // final Klasse: Die Klasse kann keine Kindklasse/Subklasse haben

    //! static
    // Mit static gekennzeichnete Attribute/Methoden gehören zu einer Klasse anstatt zu einem Objekt.
    // werden mit dem Klassennamen aufgerufen
    // static int variableName;
    // ClassName.variableName;


    //! Nicht static
    // Nicht static gekennzeichnete Attribute/Methoden gehören zu einem Objekt anstatt zu einer Klasse.
    // werden mit dem Objektnamen aufgerufen
    // int attribute;
    // objectName.attribute;




}
