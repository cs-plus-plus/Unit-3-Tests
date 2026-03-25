# CS++ Java — Unit 3: Boolean Expressions and if Statements

> **Unit 3** | 100 Points | 6 Autograded Tests

In this assignment you will write conditional logic using comparison operators, logical operators (`&&`, `||`, `!`), and if-else statements. You will also reverse a phone number using arithmetic.

---

## Table of Contents

1. [Concepts You Need](#concepts-you-need)
2. [Project Overview](#project-overview)
3. [Methods to Implement](#methods-to-implement)
4. [File Structure](#file-structure)
5. [Autograding](#autograding)
6. [Try It Yourself — Practice Examples](#try-it-yourself--practice-examples)
7. [Tips for Success](#tips-for-success)
8. [FAQ](#faq)

---

## Concepts You Need

### Comparison Operators

```java
a == b    // equal to
a != b    // not equal to
a > b     // greater than
a < b     // less than
a >= b    // greater than or equal to
a <= b    // less than or equal to
```

These return `true` or `false`.

### Logical Operators

```java
// AND — both must be true
if (age >= 16 && hasPermit) { ... }

// OR — at least one must be true
if (temp > 100 || temp < 0) { ... }

// NOT — flips the value
if (!isRaining) { ... }
```

### If-Else Statements

```java
if (score >= 90) {
    return "A";
} else if (score >= 80) {
    return "B";
} else {
    return "C";
}
```

### Checking a Range

To check if a number is between two values (inclusive):

```java
public static boolean isWithinRange(int num, int lower, int upper) {
    return num >= lower && num <= upper;
}
```

### Leap Year Rules

A year is a leap year if:
1. It is divisible by 4, **AND**
2. It is NOT divisible by 100, **UNLESS**
3. It is also divisible by 400

```java
// 2024 → leap (divisible by 4, not by 100)
// 1900 → NOT leap (divisible by 100, not by 400)
// 2000 → leap (divisible by 400)
```

### String Contains

Check if one string contains another:

```java
String main = "Hello World";
boolean result = main.contains("World");  // true
boolean empty = "".contains("anything");  // false
```

### Reversing a Number with Arithmetic

You can reverse the digits of a number using `%` and `/`:

```java
int num = 1234;
int reversed = 0;
while (num > 0) {
    int digit = num % 10;       // get last digit
    reversed = reversed * 10 + digit;  // append it
    num = num / 10;             // remove last digit
}
// reversed is now 4321
```

---

## Project Overview

You will implement six methods in `Unit3.java`. Each method practices a different aspect of boolean logic and conditional statements.

---

## Methods to Implement

### 1. isPositive(int number)
Return `true` if the number is greater than 0, `false` otherwise.

```java
isPositive(5)    // returns true
isPositive(0)    // returns false
isPositive(-3)   // returns false
```

### 2. isWithinRange(int number, int lower, int upper)
Return `true` if `number` is between `lower` and `upper` (inclusive on both ends).

```java
isWithinRange(5, 1, 10)    // returns true
isWithinRange(1, 1, 10)    // returns true (inclusive)
isWithinRange(10, 1, 10)   // returns true (inclusive)
isWithinRange(0, 1, 10)    // returns false
```

### 3. isLeapYear(int year)
Return `true` if the year is a leap year. A year is a leap year if it is divisible by 4, except years divisible by 100 are NOT leap years, unless they are also divisible by 400.

```java
isLeapYear(2024)   // returns true
isLeapYear(1900)   // returns false
isLeapYear(2000)   // returns true
isLeapYear(2023)   // returns false
```

### 4. areBothSameSign(int number1, int number2)
Return `true` if both numbers have the same sign (both positive, both negative, or both zero).

```java
areBothSameSign(3, 7)     // returns true (both positive)
areBothSameSign(-2, -5)   // returns true (both negative)
areBothSameSign(0, 0)     // returns true (both zero)
areBothSameSign(3, -1)    // returns false
areBothSameSign(0, 5)     // returns false
```

### 5. containsSubstring(String main, String sub)
Return `true` if `main` contains `sub`. Return `false` if either string is null or empty.

```java
containsSubstring("Hello World", "World")   // returns true
containsSubstring("Hello", "xyz")           // returns false
containsSubstring("", "test")               // returns false
containsSubstring("Hello", "")              // returns false
```

### 6. reversePhoneNumber(int phoneNumber)
Reverse the digits of a 7-digit phone number and return the result. If the phone number is not exactly 7 digits, return `-1`.

```java
reversePhoneNumber(1234567)   // returns 7654321
reversePhoneNumber(5551234)   // returns 4321555
reversePhoneNumber(123)       // returns -1 (not 7 digits)
reversePhoneNumber(12345678)  // returns -1 (not 7 digits)
```

---

## File Structure

```
Unit-3-Tests/
├── pom.xml                                <-- Maven config (DO NOT MODIFY)
├── src/
│   ├── main/java/unit3/
│   │   └── Unit3.java                     <-- YOUR CODE GOES HERE
│   └── test/java/unit3/
│       └── Unit3Test.java                 <-- Tests (DO NOT MODIFY)
└── .github/
    └── workflows/
        └── classroom.yml                  <-- Autograding (DO NOT MODIFY)
```

**Edit only `Unit3.java`.**

---

## Autograding

| Test | What It Checks | Points |
|------|---------------|--------|
| testIsPositive | Returns true for positive, false for zero/negative | 10 |
| testIsWithinRange | Checks inclusive boundaries | 15 |
| testIsLeapYear | Handles 4/100/400 rules correctly | 20 |
| testAreBothSameSign | Checks positive/negative/zero combinations | 15 |
| testContainsSubstring | Uses `.contains()`, handles null/empty | 20 |
| testReversePhoneNumber | Reverses 7-digit number, -1 for invalid | 20 |

**Total: 100 points**

---

## Try It Yourself — Practice Examples

Create `Practice.java` in the same directory and run it with `javac Practice.java && java Practice`.

**Example 1 — Comparison operators:**
```java
// Practice.java
public class Practice {
    public static void main(String[] args) {
        int x = 15;
        System.out.println(x > 10);          // true
        System.out.println(x == 15);          // true
        System.out.println(x != 15);          // false
        System.out.println(x >= 15);          // true
        System.out.println(x > 10 && x < 20); // true (AND)
        System.out.println(x > 20 || x < 5);  // false (OR)
    }
}
```

**Example 2 — Leap year logic:**
```java
// Practice.java
public class Practice {
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) return true;
        if (year % 100 == 0) return false;
        if (year % 4 == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println("2024: " + isLeapYear(2024));  // true
        System.out.println("1900: " + isLeapYear(1900));  // false
        System.out.println("2000: " + isLeapYear(2000));  // true
        System.out.println("2023: " + isLeapYear(2023));  // false
    }
}
```

**Example 3 — Reversing digits:**
```java
// Practice.java
public class Practice {
    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        System.out.println(reverseNumber(1234));    // 4321
        System.out.println(reverseNumber(5551234)); // 4321555
        System.out.println(reverseNumber(100));     // 1
    }
}
```

---

## Tips for Success

1. For `isLeapYear`, check divisibility by 400 first, then 100, then 4 — the order matters
2. For `areBothSameSign`, consider zero as its own category. Both being zero should return `true`
3. For `containsSubstring`, check for null and empty strings before calling `.contains()`
4. For `reversePhoneNumber`, a 7-digit number is between 1000000 and 9999999
5. Use `%` to get the last digit and `/` to remove the last digit when reversing
6. Run `mvn test` after each method

---

## FAQ

**Q: For `areBothSameSign`, is zero positive or negative?**
Neither. Zero is its own case. Two zeros are the same sign (`true`), but zero and a positive number are not the same sign (`false`).

**Q: For `containsSubstring`, should I check for `null`?**
Yes. If either `main` or `sub` is `null`, return `false`. Also return `false` if either is empty.

**Q: How do I check if a phone number has exactly 7 digits?**
Check if it is between 1000000 and 9999999 (inclusive). Numbers outside this range have fewer or more than 7 digits.

**Q: Can I use `String.valueOf()` to reverse the phone number?**
The tests check for the arithmetic approach (using `%` and `/`). Use the modulo method shown in the concepts section.

---

View all assignments and scoring breakdowns at [csplusplus.com/maven-tests](https://csplusplus.com/maven-tests)

*CS++ — AP Computer Science A — [csplusplus.com](https://csplusplus.com)*
