# 🔝 Find the Largest Number Among Three

## 📌 Problem Statement

Write a Java program to find the largest number among three given integers.

---

## 📖 Definition

Given three integers, compare them and determine which one is the largest.

---

## 💡 Example

### Input

```text
10 20 15
```

### Output

```text
20
```

### Explanation

```text
Among 10, 20, and 15, the largest number is 20.
```

---

## 📝 Java Implementation

```java
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        // Method 1: Using nested if-else statements
        // int max = a;
        // if(max < b) {
        //     max = b;
        // }
        // if(max < c) {
        //     max = c;
        // }
        
        // Method 2: Using Math.max()
        int max = Math.max(c, Math.max(a, b));
        
        System.out.println(max);
    }
}
```

---

## 🔍 Algorithm Explanation

### Method 1: Using If-Else Statements

1. Assume the first number is the largest.
2. Compare with the second number and update if needed.
3. Compare with the third number and update if needed.
4. Print the maximum number.

### Method 2: Using Math.max() (Optimized)

Use the built-in `Math.max()` function to find the maximum efficiently.

---

## ▶️ Sample Run

```text
Enter three numbers:
10 20 15

Output: 20
```

---

## ⏱️ Complexity Analysis

| Complexity | Value |
|------------|-------|
| Time Complexity | O(1) |
| Space Complexity | O(1) |

> **Constant time** since we only compare three numbers.

---

## 📂 File

```text
LargestNumber.java
```

---

⭐ Part of the **Java Interview Questions** repository.
