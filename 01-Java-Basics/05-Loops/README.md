# 🔁 Loops in Java

## 📌 Problem Statement

Understand and implement different types of loops in Java:
- **For Loop**: Used when the number of iterations is known.
- **While Loop**: Used when the number of iterations is unknown.
- **Do-While Loop**: Executes the statement at least once before checking the condition.

---

## 📖 Loop Types

### 1️⃣ For Loop

**Syntax:**
```java
for(initialization; condition; increment/decrement) {
    // body
}
```

**Use Case:** When you know the exact number of iterations.

### 2️⃣ While Loop

**Syntax:**
```java
while(condition) {
    // code to be executed
    // increment/decrement
}
```

**Use Case:** When the number of iterations is unknown.

### 3️⃣ Do-While Loop

**Syntax:**
```java
do {
    // code to be executed
} while(condition);
```

**Use Case:** When you need to execute the body at least once.

---

## 💡 Example

### Print Numbers 1 to 5

#### Using For Loop

```text
1
2
3
4
5
```

#### Using While Loop

```text
1
2
3
4
5
```

#### Using Do-While Loop

```text
1
2
3
4
5
```

---

## 📝 Java Implementation

```java
public class Loops {
    public static void main(String[] args) {
        // For Loop - Print 1 to 5
        System.out.println("For Loop:");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        
        // While Loop - Print 1 to 5
        System.out.println("\nWhile Loop:");
        int num = 1;
        while (num <= 5) {
            System.out.println(num);
            num++;
        }
        
        // Do-While Loop - Print 1 to 5
        System.out.println("\nDo-While Loop:");
        int n = 1;
        do {
            System.out.println(n);
            n++;
        } while(n <= 5);
    }
}
```

---

## ▶️ Sample Run

```text
For Loop:
1
2
3
4
5

While Loop:
1
2
3
4
5

Do-While Loop:
1
2
3
4
5
```

---

## 📊 Comparison

| Feature | For Loop | While Loop | Do-While Loop |
|---------|----------|-----------|---------------|
| **Use Case** | Known iterations | Unknown iterations | At least one execution |
| **Type** | Entry-controlled | Entry-controlled | Exit-controlled |
| **Minimum Executions** | 0 | 0 | 1 |

---

## 📂 File

```text
Loops.java
```

---

⭐ Part of the **Java Interview Questions** repository.
