package exceptions;

public class ExceptionErsteAufgabe {
    public static void main(String[] args) {
        // TODO: Erstellen Sie ein Array mit drei Elementen (z.B. zahlen)
        int[] array = {1, 2, 3};

        try {
            // TODO: Versuchen Sie, auf das nicht existierende vierte Element des Arrays zuzugreifen
            int outOfBounds = array[3];
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: Fangen Sie die Ausnahme ab und geben Sie eine Fehlermeldung aus die ansagt, dass das vierte Element nicht existiert
            System.out.println("Es existiert kein viertes Element");
        } finally {
            // TODO: Geben Sie eine Nachricht aus, die immer angezeigt wird, unabhängig davon, ob eine Ausnahme aufgetreten ist oder nicht die "blub" ausgibt
            System.out.println("blub");
        }
    }

}
