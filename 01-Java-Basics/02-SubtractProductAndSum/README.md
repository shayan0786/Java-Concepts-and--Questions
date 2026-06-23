# ➖ Subtract Product and Sum of Digits of an Integer

## 📌 Problem Statement

Write a Java program to calculate the difference between the product of the digits of an integer and the sum of its digits.

The result should be:

```text
Product of Digits − Sum of Digits
```

---

## 📖 Definition

Given an integer, calculate:

- Product of all its digits.
- Sum of all its digits.

Finally, subtract the sum from the product.

---

## 💡 Example

### Input

```text
234
```

### Output

```text
15
```

### Explanation

```text
Product = 2 × 3 × 4 = 24

Sum = 2 + 3 + 4 = 9

Answer = 24 − 9 = 15
```

---

## 📝 Java Implementation

```java
import java.util.Scanner;

public class SubtractProductAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int sum = 0;
        int product = 1;

        while (n > 0) {
            int rem = n % 10;
            sum += rem;
            product *= rem;
            n /= 10;
        }

        System.out.println(product - sum);
    }
}
```

---

## ▶️ Sample Run

```text
Enter the number: 234

15
```

---

## ⏱️ Complexity Analysis

| Complexity | Value |
|------------|-------|
| Time Complexity | O(d) |
| Space Complexity | O(1) |

> **d** = Number of digits in the given integer.

---

## 📂 File

```text
SubtractProductAndSum.java
```

---

⭐ Part of the **Java Interview Questions** repository.