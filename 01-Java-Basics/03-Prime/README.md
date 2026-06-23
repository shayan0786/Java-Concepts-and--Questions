# 🔢 Check if a Number is Prime

## 📌 Problem Statement

Write a Java program to check whether a given integer is a prime number or not.

A **prime number** is a natural number greater than 1 that has no positive divisors other than 1 and itself.

---

## 📖 Definition

A prime number is an integer greater than 1 that:

- Is only divisible by 1 and itself.
- Has exactly two factors.

---

## 💡 Example

### Example 1

#### Input

```text
7
```

#### Output

```text
Prime...
```

#### Explanation

```text
7 is only divisible by 1 and 7, so it is a prime number.
```

### Example 2

#### Input

```text
10
```

#### Output

```text
Not Prime
```

#### Explanation

```text
10 is divisible by 2 and 5, so it is not a prime number.
```

---

## 📝 Java Implementation

```java
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                System.out.println("Not Prime");
                break;
            }
            c = c + 1;
        }
        
        if (c * c > n) {
            System.out.println("Prime...");
        }
    }
}
```

---

## ▶️ Sample Run

### Run 1

```text
Enter the number: 7

Prime...
```

### Run 2

```text
Enter the number: 10

Not Prime
```

---

## ⏱️ Complexity Analysis

| Complexity | Value |
|------------|-------|
| Time Complexity | O(√n) |
| Space Complexity | O(1) |

> **n** = The given integer.

---

## 📂 File

```text
Prime.java
```

---

⭐ Part of the **Java Interview Questions** repository.
