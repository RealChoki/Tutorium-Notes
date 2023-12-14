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

            // TODO: Zeige die Informationen der erstellten Fahrzeuge an "infoAnzeigen" mit Uberschriften "Erstes Fahrzeug:" und "Zweites Fahrzeug:".

            // TODO: Zeige die Gesamtanzahl der erstellten Fahrzeuge an "anzahlFahrzeuge".

            // TODO: Rufe die Methode "starten" für beide Fahrzeuge auf.

            // TODO: Versuche die Methode "starten" für beide Fahrzeuge zu überschreiben. Was passiert? und warum?
            
            
}



