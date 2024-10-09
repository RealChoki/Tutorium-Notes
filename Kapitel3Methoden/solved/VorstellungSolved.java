package solved;

public class VorstellungSolved {
    /* Die Ausgabe kann wie folgt aussehen:
     *
     * Mein Name ist Rafaat Choki, ich bin 21 Jahre alt und bin in Deutschland geboren.
     */
    public static void main(String[] args) {
        // Erstellen Sie eine Variable namens "myFirstname" und weisen Sie Ihren Vornamen zu.
        String myFirstname = "Rafaat";

        // Erstellen Sie eine Variable namens "myLastname" und weisen Sie Ihren Nachnamen zu.
        String myLastname = "Choki";

        // Erstellen Sie eine Variable namens "age" und weisen Sie Ihr Alter zu.
        int age = 21;
        
        // Erstellen Sie eine Variable namens "birthCountry" und weisen Sie Ihr Geburtsland zu.
        String birthCountry = "Deutschland";
        
        // Rufen Sie die Methode "printIntroduction" auf und übergeben Sie Ihren Vor- und Nachnamen, Alter und Geburtsland als Parameter.
        printIntroduction(myFirstname, myLastname, age, birthCountry);
    }

    // Erstellen Sie die Methode "printIntroduction" und fügen Sie die Parameter hinzu, die den Vornamen, Nachnamen, Alter und Geburtsland enthalten.
    // Schreiben Sie sinnvolles JavaDoc für die Methode.
    /**
     * Gibt eine Vorstellung des Benutzers aus.
     * @param vorname Der Vorname des Benutzers.
     * @param nachname Der Nachname des Benutzers.
     * @param alter Das Alter des Benutzers.
     * @param birthCountry Das Geburtsland des Benutzers.
     */
    public static void printIntroduction(String vorname, String nachname, int alter, String birthCountry) {
        // Geben Sie ein Satz aus indem Sie Ihren Vor- und Nachnamen, Alter und Geburtsland angeben.
        System.out.println("Mein Name ist " + vorname + " " + nachname + ", ich bin " + alter + " Jahre alt und bin in " + birthCountry + " geboren.");
    }
}