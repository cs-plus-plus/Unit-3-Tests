package unit3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Unit3Test {

    // Test isPositive
    @Test
    public void testIsPositive() {
        assertTrue(Unit3.isPositive(5), "5 is positive");
        assertFalse(Unit3.isPositive(-1), "-1 is not positive");
        assertFalse(Unit3.isPositive(0), "0 is not positive");
        assertTrue(Unit3.isPositive(Integer.MAX_VALUE), "Integer.MAX_VALUE is positive");
        assertFalse(Unit3.isPositive(Integer.MIN_VALUE), "Integer.MIN_VALUE is not positive");
    }

    // Test isWithinRange
    @Test
    public void testIsWithinRange() {
        assertTrue(Unit3.isWithinRange(5, 1, 10), "5 is within range 1 to 10");
        assertFalse(Unit3.isWithinRange(0, 1, 10), "0 is not within range 1 to 10");
        assertTrue(Unit3.isWithinRange(10, 1, 10), "10 is within range 1 to 10");
        assertFalse(Unit3.isWithinRange(-5, 0, 10), "-5 is not within range 0 to 10");
        assertTrue(Unit3.isWithinRange(1, 1, 1), "1 is within range 1 to 1 (edge case)");
    }

    // Test isLeapYear
    @Test
    public void testIsLeapYear() {
        assertTrue(Unit3.isLeapYear(2024), "2024 is a leap year");
        assertFalse(Unit3.isLeapYear(1900), "1900 is not a leap year");
        assertTrue(Unit3.isLeapYear(2000), "2000 is a leap year");
        assertFalse(Unit3.isLeapYear(2023), "2023 is not a leap year");
        assertTrue(Unit3.isLeapYear(1600), "1600 is a leap year (multiple of 400)");
        assertFalse(Unit3.isLeapYear(2100), "2100 is not a leap year (multiple of 100 but not 400)");
    }

    // Test areBothSameSign
    @Test
    public void testAreBothSameSign() {
        assertTrue(Unit3.areBothSameSign(3, 7), "Both 3 and 7 are positive");
        assertTrue(Unit3.areBothSameSign(-2, -8), "Both -2 and -8 are negative");
        assertFalse(Unit3.areBothSameSign(-2, 5), "-2 is negative and 5 is positive");
        assertTrue(Unit3.areBothSameSign(0, 0), "Both are zero (edge case)");
        assertFalse(Unit3.areBothSameSign(0, -1), "0 is neutral and -1 is negative");
    }

    // Test containsSubstring
    @Test
    public void testContainsSubstring() {
        assertTrue(Unit3.containsSubstring("hello world", "world"), "Main string contains substring 'world'");
        assertFalse(Unit3.containsSubstring("hello world", "java"), "Main string does not contain substring 'java'");
        assertFalse(Unit3.containsSubstring("", "test"), "Main string is empty");
        assertFalse(Unit3.containsSubstring("test", ""), "Substring is empty");
        assertFalse(Unit3.containsSubstring("", ""), "Both strings are empty");
        assertTrue(Unit3.containsSubstring("abc", "abc"), "Exact match of main string and substring");
    }

    // Test reversePhoneNumber
    @Test
    public void testReversePhoneNumber() {
        assertEquals(7654321, Unit3.reversePhoneNumber(1234567), "1234567 reversed is 7654321");
        assertEquals(1000000, Unit3.reversePhoneNumber(1), "Reversing 1 should return 1000000 as per 7 digits validation");
        assertEquals(-1, Unit3.reversePhoneNumber(123456), "123456 is not a 7-digit number");
        assertEquals(-1, Unit3.reversePhoneNumber(12345678), "12345678 is not a 7-digit number");
        assertEquals(-1, Unit3.reversePhoneNumber(0), "0 is not a valid 7-digit number");
        assertEquals(-1, Unit3.reversePhoneNumber(-1234567), "Negative numbers are not valid phone numbers");
    }
}
