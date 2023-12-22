package pizza;

public class Main {
    public static void main(String[] args) {
        String[] margheritaZutaten = {"Tomatensauce", "Mozzarella"};
        Margherita margherita = new Margherita("Margherita", 7.5, margheritaZutaten);

        String[] pepperoniZutaten = {"Tomatensauce", "Mozzarella", "Pepperoni"};
        Pepperoni pepperoni = new Pepperoni("Pepperoni", 8.5, pepperoniZutaten);

        System.out.println("Erste Pizza:");
        margherita.infoAnzeigen();

        System.out.println("\nZweite Pizza:");
        pepperoni.infoAnzeigen();

        System.out.println("\nGesamtanzahl der Pizzas: " + Pizza.getAnzahlPizzas());
    }
}
