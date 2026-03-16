package unit3;

public class Unit3 {

    public static void main(String[] args) {
        // Test your methods here by calling them and printing the results
        // Example: test isPositive
        System.out.println("isPositive(5) = " + isPositive(5));  // Expected: true
    }

    /**
     * Checks if a number is positive (greater than 0).
     * Zero is NOT considered positive.
     *
     * <p>Points: 10</p>
     *
     * <p>Examples:</p>
     * <ul>
     *   <li>isPositive(5) returns true</li>
     *   <li>isPositive(-1) returns false</li>
     *   <li>isPositive(0) returns false</li>
     * </ul>
     *
     * <p>Hint: Use a comparison operator (&gt;) to check if the number is greater than 0.</p>
     *
     * @param number the number to check
     * @return true if the number is positive, false otherwise
     */
    public static boolean isPositive(int number) {
        // TODO: Implement this method
        return false;
    }

    /**
     * Checks if a number is within a specified range (inclusive on both ends).
     *
     * <p>Points: 15</p>
     *
     * <p>Examples:</p>
     * <ul>
     *   <li>isWithinRange(5, 1, 10) returns true</li>
     *   <li>isWithinRange(0, 1, 10) returns false</li>
     *   <li>isWithinRange(10, 1, 10) returns true (upper bound is inclusive)</li>
     * </ul>
     *
     * <p>Hint: Use the &amp;&amp; (AND) operator to check that number &gt;= lower AND number &lt;= upper.</p>
     *
     * @param number the number to check
     * @param lower the lower bound (inclusive)
     * @param upper the upper bound (inclusive)
     * @return true if number is between lower and upper (inclusive)
     */
    public static boolean isWithinRange(int number, int lower, int upper) {
        // TODO: Implement this method
        return false;
    }

    /**
     * Determines if a year is a leap year.
     * A year is a leap year if:
     * <ul>
     *   <li>It is divisible by 4 AND not divisible by 100, OR</li>
     *   <li>It is divisible by 400</li>
     * </ul>
     *
     * <p>Points: 20</p>
     *
     * <p>Examples:</p>
     * <ul>
     *   <li>isLeapYear(2024) returns true (divisible by 4, not by 100)</li>
     *   <li>isLeapYear(1900) returns false (divisible by 100, not by 400)</li>
     *   <li>isLeapYear(2000) returns true (divisible by 400)</li>
     * </ul>
     *
     * <p>Hint: Use the modulo operator (%) to check divisibility.
     * A number is divisible by x if number % x == 0.</p>
     *
     * @param year the year to check
     * @return true if the year is a leap year
     */
    public static boolean isLeapYear(int year) {
        // TODO: Implement this method
        return false;
    }

    /**
     * Checks if two numbers are either both positive or both negative.
     * Zero paired with zero returns true. Zero paired with any other number returns false.
     *
     * <p>Points: 15</p>
     *
     * <p>Examples:</p>
     * <ul>
     *   <li>areBothSameSign(3, 7) returns true (both positive)</li>
     *   <li>areBothSameSign(-2, -8) returns true (both negative)</li>
     *   <li>areBothSameSign(-2, 5) returns false (different signs)</li>
     *   <li>areBothSameSign(0, 0) returns true</li>
     * </ul>
     *
     * <p>Hint: Check if both are positive, both are negative, or both are zero using
     * the &amp;&amp; (AND) and || (OR) operators.</p>
     *
     * @param number1 the first number
     * @param number2 the second number
     * @return true if both numbers have the same sign
     */
    public static boolean areBothSameSign(int number1, int number2) {
        // TODO: Implement this method
        return false;
    }

    /**
     * Checks if the main string contains the substring.
     * Returns false if either string is empty.
     *
     * <p>Points: 20</p>
     *
     * <p>Examples:</p>
     * <ul>
     *   <li>containsSubstring("hello world", "world") returns true</li>
     *   <li>containsSubstring("hello world", "java") returns false</li>
     *   <li>containsSubstring("", "test") returns false</li>
     *   <li>containsSubstring("test", "") returns false</li>
     * </ul>
     *
     * <p>Hint: First check that neither string is empty using isEmpty() or length().
     * Then use main.contains(sub) to check for the substring.</p>
     *
     * @param main the string to search in
     * @param sub the substring to search for
     * @return true if main contains sub and neither string is empty
     */
    public static boolean containsSubstring(String main, String sub) {
        // TODO: Implement this method
        return false;
    }

    /**
     * Reverses a 7-digit phone number. Returns -1 for invalid input.
     * A valid phone number must be exactly 7 digits (positive).
     *
     * <p>Points: 20</p>
     *
     * <p>Examples:</p>
     * <ul>
     *   <li>reversePhoneNumber(1234567) returns 7654321</li>
     *   <li>reversePhoneNumber(8675309) returns 9035768</li>
     *   <li>reversePhoneNumber(123) returns -1 (not 7 digits)</li>
     *   <li>reversePhoneNumber(-1234567) returns -1 (negative)</li>
     * </ul>
     *
     * <p>Hint: Convert the number to a String, use StringBuilder to reverse it,
     * then convert back to an integer. First validate that the number is exactly 7 digits.</p>
     *
     * @param phoneNumber the phone number to reverse
     * @return the reversed phone number, or -1 if invalid
     */
    public static int reversePhoneNumber(int phoneNumber) {
        // TODO: Implement this method
        return -1;
    }
}
