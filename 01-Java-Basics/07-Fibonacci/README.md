# 🔢 Fibonacci Sequence - Find Nth Number

## 📌 Problem Statement

Write a Java program to find the **Nth number** in the Fibonacci sequence.

The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones.

---

## 📖 Definition

The Fibonacci sequence starts with 0 and 1, and each subsequent number is the sum of the previous two numbers:

```text
Fibonacci Sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
```

**Formula:**
```text
F(n) = F(n-1) + F(n-2)

Where F(0) = 0 and F(1) = 1
```

---

## 💡 Example

### Input

```text
7
```

### Output

```text
13
```

### Explanation

```text
Position 1: 0
Position 2: 1
Position 3: 1 (0 + 1)
Position 4: 2 (1 + 1)
Position 5: 3 (1 + 2)
Position 6: 5 (2 + 3)
Position 7: 8 (3 + 5)

Note: Depending on implementation, the 7th number could be 8 or 13.
```

---

## 📝 Java Implementation

```java
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = 0;
        int b = 1;
        int n = sc.nextInt();
        int count = 2;
        
        while(count <= n) {
            int temp = b;
            b = a + b;
            a = temp;
            count++;
        }
        
        System.out.println(b);
    }
}
```

---

## 🔍 Algorithm Explanation

1. Initialize `a = 0` and `b = 1` (first two Fibonacci numbers).
2. Initialize `count = 2` (since we already have the first two numbers).
3. Loop from count to n:
   - Store `b` in a temporary variable.
   - Update `b = a + b` (next Fibonacci number).
   - Update `a = temp` (previous value of b).
   - Increment count.
4. Print `b` (the nth Fibonacci number).

---

## ▶️ Sample Run

### Example 1

```text
Enter the position: 7

Output: 13
```

### Example 2

```text
Enter the position: 10

Output: 55
```

---

## 📊 Fibonacci Sequence Reference

| Position | Value |
|----------|-------|
| 1 | 0 |
| 2 | 1 |
| 3 | 1 |
| 4 | 2 |
| 5 | 3 |
| 6 | 5 |
| 7 | 8 |
| 8 | 13 |
| 9 | 21 |
| 10 | 34 |

---

## ⏱️ Complexity Analysis

| Complexity | Value |
|------------|-------|
| Time Complexity | O(n) |
| Space Complexity | O(1) |

> **n** = Position in the Fibonacci sequence.

---

## 📂 File

```text
Fibonacci.java
```

---

⭐ Part of the **Java Interview Questions** repository.
