public class Aufgabe2 {
    //! KLASSE PIZZA
    // TODO: package bestimmen

    // TODO: Definiere eine Basisklasse namens "Pizza" mit den folgenden Objekt Attributen (name, preis) und einen klassen attribut (static) "anzahlPizzas".

        // TODO: Implementiere einen Konstruktor für die Klasse "Pizza", der die Object Attribute initialisiert.
            // TODO: Erhöhe "anzahlPizzas" jedes Mal, wenn eine neue Instanz "Pizza" erstellt wird.

        // TODO: Implementiere eine Getter methode für 'name'.

        // TODO: Implementiere Getter methode für 'preis'.

        // TODO: Implementiere eine Methode "infoAnzeigen()", die die Informationen der Pizza ausgibt (Name, Preis).


    //! KLASSE MARGHERITA
    // TODO: package bestimmen

    // TODO: Erstelle eine abgeleitete Klasse namens "Margherita", die von der Klasse "Pizza" erbt.
    // TODO: Füge der Klasse "Margherita" ein zusätzliches Objekt Attribut "zutaten" als eine erweiterung hinzu. Dieses Attribut sollte ein Array von Strings sein.

        // TODO: Implementiere einen Konstruktor für die Klasse "Margherita", der sowohl die Object Attribute der Basisklasse als auch das neue Attribut "zutaten" initialisiert.
            // TODO: Rufe den Konstruktor der Basisklasse auf mit "super()"

        // TODO: Überschreibe "Override" die Methode "infoAnzeigen()" in der Klasse "Margherita", um auch die Zutaten auszugeben. Verwende die Methode "String.join()" um die Zutaten in einer einzigen Zeichenkette mit Kommas dazwischen zu verbinden.
        // TODO: Verwende getName() und getPreis() um die werte zu bekommen.


    //! KLASSE PEPPERONI
    // TODO: package bestimmen

    // TODO: Erstelle eine weitere abgeleitete Klasse namens "Pepperoni", die ebenfalls von der Klasse "Pizza" erbt. 
    // TODO: Füge der Klasse "Pepperoni" ein zusätzliches Attribut "zutaten" als eine erweiterung hinzu. Dieses Attribut sollte ein Array von Strings sein.

        // TODO: Implementiere einen Konstruktor für die Klasse "Pepperoni", der sowohl die Object Attribute der Basisklasse als auch das neue Attribut "zutaten" initialisiert.
            // TODO: Rufe den Konstruktor der Basisklasse auf mit "super()"
        
        // TODO: Überschreibe die Methode "infoAnzeigen()" in der Klasse "Pepperoni", um auch die Zutaten auszugeben. Verwende die Methode "String.join()" um die Zutaten in einer einzigen Zeichenkette mit Kommas dazwischen zu verbinden.
        // TODO: Verwende die Methode "infoAnzeigen()" der Oberklasse mit "super.infoAnzeigen()" um die werte (Name, Preis) zu bekommen.


    //! KLASSE MAIN
    // TODO: package bestimmen

    // TODO: Definiere eine Basisklasse namens "Main".
  
        // TODO: Definiere eine "main" Methode.
            // TODO: In der "main" Methode, erstelle Instanzen von "Margherita" und "Pepperoni". Die Zutaten sollten als Arrays von Strings übergeben werden.
            // Margherita Bsp -> Name = "Margherita", Preis = 7.5, Zutaten = {"Tomatensauce", "Mozzarella"}
            // Pepperoni Bsp -> Name = "Pepperoni", Preis = 8.5, Zutaten = {"Tomatensauce", "Mozzarella", "Pepperoni"}

            // TODO: Zeige die Informationen der erstellten Pizzas an "infoAnzeigen" mit Uberschriften "Erste Pizza:" und "Zweite Pizza:".

            // TODO: Zeige die Gesamtanzahl der erstellten Pizzas an "anzahlPizzas".

    //? End ausgabe beispiel:
    /*
    Erste Pizza:
    Name: Margherita
    Preis: 7.5
    Zutaten: Tomatensauce, Mozzarella

    Zweite Pizza:
    Name: Pepperoni
    Preis: 8.5
    Zutaten: Tomatensauce, Mozzarella, Pepperoni

    Gesamtanzahl der Pizzas: 2
    */
}