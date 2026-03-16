package unit3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class Unit3Test {

    // ── Method 1: isPositive (10 points) ────────────────────────────────────

    @Test
    @DisplayName("isPositive: Check if a number is positive (10 points)")
    public void testIsPositive() {
        assertAll("isPositive",
            () -> assertTrue(Unit3.isPositive(5),
                "isPositive(5) should return true (5 is positive)"),
            () -> assertFalse(Unit3.isPositive(-1),
                "isPositive(-1) should return false (-1 is negative)"),
            () -> assertFalse(Unit3.isPositive(0),
                "isPositive(0) should return false (0 is NOT positive)"),
            () -> assertTrue(Unit3.isPositive(Integer.MAX_VALUE),
                "isPositive(Integer.MAX_VALUE) should return true"),
            () -> assertFalse(Unit3.isPositive(Integer.MIN_VALUE),
                "isPositive(Integer.MIN_VALUE) should return false")
        );
    }

    // ── Method 2: isWithinRange (15 points) ─────────────────────────────────

    @Test
    @DisplayName("isWithinRange: Check if number is between bounds inclusive (15 points)")
    public void testIsWithinRange() {
        assertAll("isWithinRange",
            () -> assertTrue(Unit3.isWithinRange(5, 1, 10),
                "isWithinRange(5, 1, 10) should return true (5 is between 1 and 10)"),
            () -> assertFalse(Unit3.isWithinRange(0, 1, 10),
                "isWithinRange(0, 1, 10) should return false (0 is below the range)"),
            () -> assertTrue(Unit3.isWithinRange(10, 1, 10),
                "isWithinRange(10, 1, 10) should return true (10 is the upper bound — inclusive)"),
            () -> assertFalse(Unit3.isWithinRange(-5, 0, 10),
                "isWithinRange(-5, 0, 10) should return false"),
            () -> assertTrue(Unit3.isWithinRange(1, 1, 1),
                "isWithinRange(1, 1, 1) should return true (edge case: single-value range)")
        );
    }

    // ── Method 3: isLeapYear (20 points) ────────────────────────────────────

    @Test
    @DisplayName("isLeapYear: Determine if a year is a leap year (20 points)")
    public void testIsLeapYear() {
        assertAll("isLeapYear",
            () -> assertTrue(Unit3.isLeapYear(2024),
                "isLeapYear(2024) should return true (divisible by 4, not by 100)"),
            () -> assertFalse(Unit3.isLeapYear(1900),
                "isLeapYear(1900) should return false (divisible by 100 but NOT by 400)"),
            () -> assertTrue(Unit3.isLeapYear(2000),
                "isLeapYear(2000) should return true (divisible by 400)"),
            () -> assertFalse(Unit3.isLeapYear(2023),
                "isLeapYear(2023) should return false (not divisible by 4)"),
            () -> assertTrue(Unit3.isLeapYear(1600),
                "isLeapYear(1600) should return true (divisible by 400)"),
            () -> assertFalse(Unit3.isLeapYear(2100),
                "isLeapYear(2100) should return false (divisible by 100 but not 400)")
        );
    }

    // ── Method 4: areBothSameSign (15 points) ───────────────────────────────

    @Test
    @DisplayName("areBothSameSign: Check if two numbers share the same sign (15 points)")
    public void testAreBothSameSign() {
        assertAll("areBothSameSign",
            () -> assertTrue(Unit3.areBothSameSign(3, 7),
                "areBothSameSign(3, 7) should return true (both positive)"),
            () -> assertTrue(Unit3.areBothSameSign(-2, -8),
                "areBothSameSign(-2, -8) should return true (both negative)"),
            () -> assertFalse(Unit3.areBothSameSign(-2, 5),
                "areBothSameSign(-2, 5) should return false (different signs)"),
            () -> assertTrue(Unit3.areBothSameSign(0, 0),
                "areBothSameSign(0, 0) should return true (both zero)"),
            () -> assertFalse(Unit3.areBothSameSign(0, -1),
                "areBothSameSign(0, -1) should return false (0 and negative)")
        );
    }

    // ── Method 5: containsSubstring (20 points) ─────────────────────────────

    @Test
    @DisplayName("containsSubstring: Check if main string contains substring (20 points)")
    public void testContainsSubstring() {
        assertAll("containsSubstring",
            () -> assertTrue(Unit3.containsSubstring("hello world", "world"),
                "containsSubstring(\"hello world\", \"world\") should return true"),
            () -> assertFalse(Unit3.containsSubstring("hello world", "java"),
                "containsSubstring(\"hello world\", \"java\") should return false (not found)"),
            () -> assertFalse(Unit3.containsSubstring("", "test"),
                "containsSubstring(\"\", \"test\") should return false (main string is empty)"),
            () -> assertFalse(Unit3.containsSubstring("test", ""),
                "containsSubstring(\"test\", \"\") should return false (substring is empty)"),
            () -> assertFalse(Unit3.containsSubstring("", ""),
                "containsSubstring(\"\", \"\") should return false (both strings are empty)"),
            () -> assertTrue(Unit3.containsSubstring("abc", "abc"),
                "containsSubstring(\"abc\", \"abc\") should return true (exact match)")
        );
    }

    // ── Method 6: reversePhoneNumber (20 points) ────────────────────────────

    @Test
    @DisplayName("reversePhoneNumber: Reverse a 7-digit phone number (20 points)")
    public void testReversePhoneNumber() {
        assertAll("reversePhoneNumber",
            () -> assertEquals(7654321, Unit3.reversePhoneNumber(1234567),
                "reversePhoneNumber(1234567) should return 7654321"),
            () -> assertEquals(9035768, Unit3.reversePhoneNumber(8675309),
                "reversePhoneNumber(8675309) should return 9035768"),
            () -> assertEquals(-1, Unit3.reversePhoneNumber(1),
                "reversePhoneNumber(1) should return -1 (not 7 digits)"),
            () -> assertEquals(-1, Unit3.reversePhoneNumber(123456),
                "reversePhoneNumber(123456) should return -1 (only 6 digits)"),
            () -> assertEquals(-1, Unit3.reversePhoneNumber(12345678),
                "reversePhoneNumber(12345678) should return -1 (8 digits — too many)"),
            () -> assertEquals(-1, Unit3.reversePhoneNumber(0),
                "reversePhoneNumber(0) should return -1 (not a valid 7-digit number)"),
            () -> assertEquals(-1, Unit3.reversePhoneNumber(-1234567),
                "reversePhoneNumber(-1234567) should return -1 (negative numbers are invalid)")
        );
    }
}
