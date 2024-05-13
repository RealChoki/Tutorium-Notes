# Kapitel 5 Arrays

## Allgemein Arrays

### Explizit von Arrays:
- Wenn wir ein leeres Array mit 3 freien Plätzen haben:
```java
int[] arrA = new int[3];
```

- können wir jedem freien Platz einen Wert zuweisen:
```java
arrA[0] = 7;
arrA[1] = 8;
arrA[2] = 9;
```

### Implizit von Arrays:
- Aber wir können auch direkt beim Erstellen des Arrays Werte zuweisen:
```java
int[] arrB = {7, 8, 9};
```

### Zugriff auf Array-Elemente von Arrays:

- um auf ein bestimmtes Element in einem Array zuzugreifen, verwenden Sie den Index dieses Elements innerhalb der eckigen Klammern. Zum Beispiel:
  ```java
  int[] arr = {3, 6, 9, 12};
  int value = arr[2]; // Hier wird der Wert 9 abgerufen, da das dritte Element im Array (Index beginnt bei 0) 9 ist.
  ```

- Sie können den Wert eines Elements im Array ändern, indem Sie auf das Element zugreifen und ihm einen neuen Wert zuweisen. Zum Beispiel:
  ```java
  arr[1] = 7; // Ändert das zweite Element des Arrays zu 7.
  ```

## Allgemein mehrdimensionalen Array

### Explizit von mehrdimensionalen Array:
- Wenn wir ein leeres 2D-Array mit 3 Reihen und 2 Spalten haben:
```java
int[][] arr = new int[3][2];
```

- können wir jedem freien Platz einen Wert zuweisen:
```java
arr[0][0] = 1;
arr[0][1] = 2;
arr[1][0] = 3;
arr[1][1] = 4;
arr[2][0] = 5;
arr[2][1] = 6;
```

### Implizit von mehrdimensionalen Array:
- Aber wir können auch direkt beim Erstellen des Arrays Werte zuweisen:
```java
int[][] arr3x2 = {{1, 2}, {2, 3}, {3, 4}};
```
### Zugriff auf Elemente von mehrdimensionalen Arrays:

- Um auf ein bestimmtes Element in einem mehrdimensionalen Array zuzugreifen, verwenden Sie mehrere Indizes entsprechend der Dimension des Arrays. Zum Beispiel:
  ```java
  int[][] arr2D = {{1, 2}, {3, 4}, {5, 6}};
  int value = arr2D[1][0]; // Hier wird der Wert 3 abgerufen, das Element in der zweiten Zeile und ersten Spalte des 2D-Arrays.
  ```

- Sie können den Wert eines Elements in einem mehrdimensionalen Array ändern, indem Sie auf das Element zugreifen und ihm einen neuen Wert zuweisen. Zum Beispiel:
  ```java
  arr2D[2][1] = 10; // Ändert das Element in der dritten Zeile und zweiten Spalte des 2D-Arrays zu 10.
  ```

## Iteration durch ein Array:

### Array-Länge:

- Die Länge eines Arrays kann über das Attribut `length` abgerufen werden. Zum Beispiel:
  ```java
  int[] arr = {1, 2, 3, 4};
  int len = arr.length; // len wird 4 sein, da arr vier Elemente hat.
  ```

### For-Schleife:

- Eine gängige Methode zum Durchlaufen eines Arrays ist die Verwendung einer For-Schleife mit dem Index. Zum Beispiel:
  ```java
  for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i] + " "); // Hier wird 1 2 3 4 ausgegeben.
  }
  ```

### Erweiterte For-Schleife (for-each):

- Java bietet auch eine erweiterte For-Schleife, die für Arrays sehr praktisch ist. Zum Beispiel:
  ```java
  for (int num : arr) {
      System.out.println(num + " "); // Hier wird 1 2 3 4 ausgegeben.
  }
  ```