package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import Tasks.ExpressionParser;

public class ExpressionParserTest {

    // Test case for simple arithmetic operations
    @Test
    public void testAddition() {
        ExpressionParser parser = new ExpressionParser("3 + 5");
        try {
            assertEquals(8.0, parser.evaluateExpression());
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    public void testSubtraction() {
    	ExpressionParser parser = new ExpressionParser("10 - 4");
        try {
            assertEquals(6.0, parser.evaluateExpression());
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    public void testMultiplication() {
    	ExpressionParser parser = new ExpressionParser("2 * 6");
        try {
            assertEquals(12.0, parser.evaluateExpression());
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    public void testDivision() {
    	ExpressionParser parser = new ExpressionParser("8 / 4");
        try {
            assertEquals(2.0, parser.evaluateExpression());
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    // Test case for operator precedence (multiplication before addition)
    @Test
    public void testOperatorPrecedenceMultiplicationBeforeAddition() {
    	ExpressionParser parser = new ExpressionParser("3 + 5 * 2");
        try {
            assertEquals(13.0, parser.evaluateExpression());
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    // Test case for operator precedence (division before addition)
    @Test
    public void testOperatorPrecedenceDivisionBeforeAddition() {
    	ExpressionParser parser = new ExpressionParser("10 + 5 / 2");
        try {
            assertEquals(12.5, parser.evaluateExpression());
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }


    // Test cases for handling parentheses
    @Test
    public void testParentheses() {
    	ExpressionParser parser = new ExpressionParser("(3 + 5) * 2");
        try {
            assertEquals(16.0, parser.evaluateExpression());
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    public void testNestedParentheses() {
    	ExpressionParser parser = new ExpressionParser("(3 + (5 * 2)) * 2");
        try {
            assertEquals(26.0, parser.evaluateExpression());
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    public void testParenthesesWithMultipleOperators() {
    	ExpressionParser parser = new ExpressionParser("(3 + 5 * 2) - 4");
        try {
            assertEquals(9.0, parser.evaluateExpression());
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    // Test cases for floating-point numbers
    @Test
    public void testFloatingPointAddition() {
    	ExpressionParser parser = new ExpressionParser("3.5 + 5.2");
        try {
            assertEquals(8.7, parser.evaluateExpression());
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    public void testFloatingPointDivision() {
    	ExpressionParser parser = new ExpressionParser("9.5 / 2");
        try {
            assertEquals(4.75, parser.evaluateExpression());
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    public void testFloatingPointMultiplication() {
    	ExpressionParser parser = new ExpressionParser("2.5 * 4");
        try {
            assertEquals(10.0, parser.evaluateExpression());
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    // Test case for invalid expression (unexpected character)
    @Test
    public void testInvalidCharacter() {
    	ExpressionParser parser = new ExpressionParser("3 + $ * 5");
        Exception exception = assertThrows(Exception.class, parser::evaluateExpression);
        assertTrue(exception.getMessage().contains("Unexpected character"));
    }

    // Test case for invalid expression (mismatched parentheses)
    @Test
    public void testMismatchedParentheses() {
    	ExpressionParser parser = new ExpressionParser("(3 + 5 * 2");
        Exception exception = assertThrows(Exception.class, parser::evaluateExpression);
        assertTrue(exception.getMessage().contains("Mismatched parentheses"));
    }

    // Test case for invalid number format
    @Test
    public void testInvalidNumberFormat() {
    	ExpressionParser parser = new ExpressionParser("3.5.6 + 2");
        Exception exception = assertThrows(Exception.class, parser::evaluateExpression);
        assertTrue(exception.getMessage().contains("Invalid number format"));
    }

    // Test case for empty expression
    @Test
    public void testEmptyExpression() {
    	ExpressionParser parser = new ExpressionParser("");
        Exception exception = assertThrows(Exception.class, parser::evaluateExpression);
        assertTrue(exception.getMessage().contains("Unexpected end of expression"));
    }
}
