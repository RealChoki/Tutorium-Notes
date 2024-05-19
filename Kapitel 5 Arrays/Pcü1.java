public class Pcü1 {
    /**
     * Die Methode liefert den Index des zweidimensionalen Arrays, an dem inputValue steht.
     * Im zweidimensionalen Array (Eingabe) kommt kein Wert doppelt vor.
     * Wir der gesuchte Wert im zweidimensionalen Array nicht gefunden, so liefert die Methode einen leeren String.
     * 
     * @param inputArray Der zweidimensionale Array (Eingabe)
     * @param inputValue Der Wert nach dem gesucht wird
     * @return der Index an dem der gesuchte Wert steht (falls existent), ein leerer String andernfalls. 
     */
        public static void main (String[] args){
        int[][] array = {{1,2,5,8},{11,5,7,10},{111,110,-5}};
        int input = 11;
        
        String result = findIndex(array, input);
        System.out.println(result);
        }
        
        public static String findIndex(int[][] arr, int n){
            for (int i = 0; i < arr.length; i++){
                for (int j = 0; j < arr[i].length; j++){
                    if (arr[i][j] == n){
                    return i + "." + j;
                    }
                }
            }
            return "";
        } 
}
