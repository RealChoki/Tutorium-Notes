public class Pcü {

    /**
     * countBooleans zählt die Anzahl der Vorkommen von true und false im Eingabearray.
     * Arrays der Größe 0 werden nicht betrachtet,
     * 
     * @param inputArray Der Eingabearray bestehend aus booleschen Werte.
     * @return Der Ergebnisarray der Länge 2. An Indexstelle 0 steht die Anzahl der true-Vorkommen. An Indexstelle 1 steht die Anzahl der false-Vorkommen.
     */
    public static int[] countBooleans(boolean[] inputArray) {
        int[] result = new int[2];
        
        for (boolean value : inputArray) {
            if (value) {
                result[0]++;
            } else {
                result[1]++;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        boolean[] inputArray = {true, false, true, true, false, false, true};
        int[] result = countBooleans(inputArray);
        
        System.out.println("Number of true values: " + result[0]);
        System.out.println("Number of false values: " + result[1]);
    }
}
