package pizza;

public class Main {
    public static void main(String[] args) {
        String[] margheritaZutaten = {"Tomatensauce", "Mozzarella"};
        Margherita margherita = new Margherita("Margherita", 7.5, margheritaZutaten);

        String[] pepperoniZutaten = {"Tomatensauce", "Mozzarella", "Pepperoni"};
        Pepperoni pepperoni = new Pepperoni("Pepperoni", 8.5, pepperoniZutaten);

        System.out.println("Erste Pizza:");
        margherita.infoAnzeigen();

        margherita.addZutate("Basilikum"); // Add a new ingredient to the Margherita pizza
        System.out.println("\nNach dem Hinzufügen / nicht Hinzufügen");
        margherita.infoAnzeigen();


        

        System.out.println("\nZweite Pizza:");
        pepperoni.infoAnzeigen();

        pepperoni.addZutate("Oliven"); // Add a new ingredient to the Pepperoni pizza
        System.out.println("\nNach dem Hinzufügen / nicht Hinzufügen");
        pepperoni.infoAnzeigen();

        int anzahlpizzas = Pizza.anzahlPizzas;
        System.out.println("\nGesamtanzahl der Pizzas: " + anzahlpizzas);
    }
}