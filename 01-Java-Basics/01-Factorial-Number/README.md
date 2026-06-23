# 🔢 Factorial Number

## 📌 Problem Statement

Write a Java program to calculate the factorial of a given positive integer.

---

## 📖 Definition

The factorial of a non-negative integer `n` is the product of all positive integers less than or equal to `n`.

**Formula:**

```text
n! = n × (n - 1) × (n - 2) × ... × 2 × 1
```

Special Case:

```text
0! = 1
```

---

## 💡 Example

### Input

```text
5
```

### Output

```text
120
```

### Explanation

```text
5! = 5 × 4 × 3 × 2 × 1 = 120
```

---

## 📝 Java Implementation

```java
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println(fact);
    }
}
```

---

## ▶️ Sample Run

```text
Enter the number: 6
720
```

---

## ⏱️ Complexity Analysis

| Complexity | Value |
|------------|-------|
| Time Complexity | O(n) |
| Space Complexity | O(1) |

---

## 📂 File

```
Factorial.java
```

---

⭐ Part of the **Java Interview Questions** repository.