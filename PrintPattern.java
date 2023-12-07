public class PrintPattern {

    // Method to print a pattern based on the number of rows
    public static void printPattern(int rows) {
        // Outer loop for the number of rows
        for (int i = 0; i < rows; i++) {
            // Inner loop for printing asterisks in each row
            for (int j = 0; j <= i; j++) {
                System.out.print("4");
            }
            // Move to the next line after each row is printed
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Set the number of rows to 5
        int numberOfRows = 40;

        // Call the method to print the pattern with the specified number of rows
        printPattern(numberOfRows);
    }
}
