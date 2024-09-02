
# Unit 3 Java Programming Project

This project is designed for Mr. Hare's APCS-A, focusing on Unit 3 concepts such as conditional statements, Boolean expressions, and logical operators. The project includes a set of methods that students need to implement, along with unit tests to verify their functionality.

## Project Structure

- **`Unit3.java`**: Contains method headers and task descriptions. Students are required to implement the method bodies.
- **`Unit3Test.java`**: JUnit test cases for each method in `Unit3.java`. These tests validate the correctness of the implemented methods.
- **`pom.xml`**: Maven configuration file that manages dependencies and plugins required to build and run the project.

## Prerequisites

- Java 17 (or compatible version)
- Maven 3.x

## Getting Started

### Accept the Project

Use link found in Google Classroom to accept in GitHub Classroom

### Clone the Repository

Clone this repository to your local machine using GitHub Desktop.


### Run Tests

Run the JUnit tests to verify your implementations


## Method Descriptions

Students need to implement the following methods in `Unit3.java`:

1. **`isPositive(int number)`**: Returns `true` if the number is positive, otherwise `false`.
2. **`isWithinRange(int number, int lower, int upper)`**: Returns `true` if the number is within the specified range (inclusive).
3. **`isLeapYear(int year)`**: Determines if a year is a leap year based on given rules.
4. **`areBothSameSign(int number1, int number2)`**: Checks if both numbers have the same sign (either positive or negative).
5. **`containsSubstring(String main, String sub)`**: Returns `true` if the main string contains the substring and both are not empty.
6. **`reversePhoneNumber(int phoneNumber)`**: Reverses the given phone number using modulo operations.

## Common Mistakes to Avoid

- Using `=` instead of `==` in conditionals.
- Ending `if` statements with a semicolon (`;`).
- Using multiple `if` statements when `if-else` would be more appropriate.
- Misunderstanding the use of logical operators (`&&`, `||`).
- Failing to apply short-circuit evaluation correctly.

## Contributing

Feel free to submit issues or pull requests if you find bugs or have suggestions for improvement.


## Contact

For any questions, please contact [Mr. Hare](mailto:kevin.hare@sduhsd.net).
