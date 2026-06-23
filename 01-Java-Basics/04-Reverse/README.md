# 🔄 Reverse a Number

## 📌 Problem Statement

Write a Java program to reverse a given integer number.

---

## 📖 Definition

Given an integer, reverse its digits and display the reversed number.

---

## 💡 Example

### Input

```text
787875
```

### Output

```text
578787
```

### Explanation

```text
Original number: 787875
Reversed number: 578787
```

---

## 📝 Java Implementation

```java
public class Reverse {
    public static void main(String[] args) {
        int n = 787875;
        int rev = 0;
        
        while (n > 0) {
            int rem = n % 10;
            rev = (rev * 10) + rem;
            n = n / 10;
        }
        
        System.out.println(rev);
    }
}
```

---

## 🔍 Algorithm Explanation

1. Initialize `rev = 0` to store the reversed number.
2. Extract the last digit using `n % 10`.
3. Add the digit to the reversed number: `rev = (rev * 10) + rem`.
4. Remove the last digit from the original number: `n = n / 10`.
5. Repeat until `n` becomes 0.
6. Print the reversed number.

---

## ▶️ Sample Run

```text
Output: 578787
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
Reverse.java
```

---

⭐ Part of the **Java Interview Questions** repository.
