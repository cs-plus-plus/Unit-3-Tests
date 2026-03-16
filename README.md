# Unit 3: Boolean Expressions and if Statements

AP Computer Science A

## Overview

This project covers **Unit 3: Boolean Expressions and if Statements** concepts including comparison operators, logical operators (`&&`, `||`, `!`), `if-else` statements, and compound Boolean expressions. Implement the 6 methods in `Unit3.java` and run the provided JUnit tests to verify your work.

## Getting Started

### Option 1: GitHub Codespaces (Recommended)

1. Click the green **Code** button on this repository
2. Select the **Codespaces** tab
3. Click **Create codespace on main**
4. Wait for the environment to build (~2 minutes the first time)
5. Start coding in `src/main/java/unit3/Unit3.java`

> **Note:** If the Java extension shows errors on first load, press `Cmd+Shift+P` (Mac) or `Ctrl+Shift+P` (Windows) and run **"Developer: Reload Window"**. This is a one-time setup step.

### Option 2: Local Development

1. Accept the assignment via the GitHub Classroom link
2. Clone the repository using GitHub Desktop
3. Open the project in your IDE (VS Code, IntelliJ, or Eclipse)
4. **Requirements:** Java 17+, Maven 3.x

## Running Tests

### In VS Code / Codespaces

Click the green play button next to any test method in `Unit3Test.java`, or open the **Testing** sidebar (beaker icon).

### Command Line

Run all tests:
```
mvn test
```

Run a single method's tests:
```
mvn -Dtest=Unit3Test#testIsPositive test
```

## Scoring

| # | Method | Points | Concepts |
|---|--------|--------|----------|
| 1 | `isPositive(int number)` | 10 | Comparison operators |
| 2 | `isWithinRange(int, int, int)` | 15 | Compound Boolean (`&&`) |
| 3 | `isLeapYear(int year)` | 20 | Complex conditionals, `%` operator |
| 4 | `areBothSameSign(int, int)` | 15 | Logical operators (`&&`, `||`) |
| 5 | `containsSubstring(String, String)` | 20 | String methods, `&&` operator |
| 6 | `reversePhoneNumber(int)` | 20 | Validation, String/int conversion |
| | **Total** | **100** | |

## Method Details

### 1. `isPositive(int number)` — 10 points
Returns true if the number is greater than 0. Zero is NOT positive.
- `isPositive(5)` → `true`
- `isPositive(-1)` → `false`
- `isPositive(0)` → `false`

### 2. `isWithinRange(int number, int lower, int upper)` — 15 points
Returns true if the number is between lower and upper bounds (inclusive).
- `isWithinRange(5, 1, 10)` → `true`
- `isWithinRange(0, 1, 10)` → `false`
- `isWithinRange(10, 1, 10)` → `true`

### 3. `isLeapYear(int year)` — 20 points
Determines if a year is a leap year: divisible by 4 but not 100, unless also divisible by 400.
- `isLeapYear(2024)` → `true`
- `isLeapYear(1900)` → `false`
- `isLeapYear(2000)` → `true`

### 4. `areBothSameSign(int number1, int number2)` — 15 points
Returns true if both numbers are positive, both negative, or both zero.
- `areBothSameSign(3, 7)` → `true`
- `areBothSameSign(-2, 5)` → `false`

### 5. `containsSubstring(String main, String sub)` — 20 points
Returns true if main contains sub and neither string is empty.
- `containsSubstring("hello world", "world")` → `true`
- `containsSubstring("", "test")` → `false`

### 6. `reversePhoneNumber(int phoneNumber)` — 20 points
Reverses a 7-digit phone number. Returns -1 for invalid input.
- `reversePhoneNumber(1234567)` → `7654321`
- `reversePhoneNumber(123)` → `-1`

## Common Mistakes

- Using `=` (assignment) instead of `==` (comparison) in conditionals
- Ending an `if` statement with a semicolon: `if (x > 5);` — this makes the body empty!
- Using multiple `if` statements when `if-else` would be more appropriate
- Misunderstanding short-circuit evaluation with `&&` and `||`
- Forgetting that `&&` has higher precedence than `||` — use parentheses to be safe
- Not handling edge cases (0, negative numbers, empty strings)

## Autograding

Your code is automatically graded when you push to GitHub. Check the **Actions** tab to see your score. Each method is tested independently — you earn points for each method you complete correctly.

## Contact

For questions, contact [kevin@csplusplus.com](mailto:kevin@csplusplus.com)
