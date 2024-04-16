## Aufgabe
```java
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
```

## Sum of Array
```java
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
```

## Find Max Value
```java
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
```

## Print Even Number
```java
public class EvenNumbers {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        for (int num : array) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}
```

## Print Pattern
```java
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
```