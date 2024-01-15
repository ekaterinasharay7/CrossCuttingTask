import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @org.junit.jupiter.api.Test
    void testIsOperatorPl() {
        char operator = '+';
        boolean toProof = ExecuteMain.isOperator(operator);
        assertTrue(toProof);
    }

    @org.junit.jupiter.api.Test
    void testIsOperatorMn() {
        char operator = '-';
        boolean toProof = ExecuteMain.isOperator(operator);
        assertTrue(toProof);
    }
    @org.junit.jupiter.api.Test

    void testIsOperatorMl() {
        char operator = '*';
        boolean toProof = ExecuteMain.isOperator(operator);
        assertTrue(toProof);
    }
    @org.junit.jupiter.api.Test
    void testIsOperatorDev() {
        char operator = '/';
        boolean toProof = ExecuteMain.isOperator(operator);
        assertTrue(toProof);
    }
    @org.junit.jupiter.api.Test
    void testIsNotOperator() {
        char operator = '!';
        boolean toProof = ExecuteMain.isOperator(operator);
        assertFalse(toProof);
    }

    @org.junit.jupiter.api.Test
    public void testValidExpression() {
        String expression = "(3 + 4) * (2 - 1)";
        boolean result = ExecuteMain.isValidExpression(expression);
        assertTrue(result);
    }
    @org.junit.jupiter.api.Test
    public void testInvalidExpression() {
        String expression = "((3 + 4) * (2 - 1)";
        boolean result = ExecuteMain.isValidExpression(expression);
        assertFalse(result);
    }

    @org.junit.jupiter.api.Test
    public void testEmptyExpression() {
        String expression = "";
        boolean result = ExecuteMain.isValidExpression(expression);
        assertTrue(result);
    }

    @org.junit.jupiter.api.Test
    public void testExpressionWithNoBrackets() {
        String expression = "3 + 4 * 2 - 1";
        boolean result = ExecuteMain.isValidExpression(expression);
        assertTrue(result);
    }
    @org.junit.jupiter.api.Test
    public void testNestedBrackets() {
        String expression = "((3 + 4) * (2 - 1))";
        boolean result = ExecuteMain.isValidExpression(expression);
        assertTrue(result);
    }

    @org.junit.jupiter.api.Test
    public void testMismatchedBrackets() {
        String expression = "(3 + 4) * (2 - 1))";
        boolean result = ExecuteMain.isValidExpression(expression);
        assertFalse(result);
    }

    @org.junit.jupiter.api.Test
    public void testAddition() {
        char operator = '+';
        double operand1 = 3.5;
        double operand2 = 2.5;
        double expected = 6.0;
        double result = ExecuteMain.performOperation(operator, operand1, operand2);
        assertEquals(expected, result, 0.0001);
    }

    @org.junit.jupiter.api.Test
    public void testSubtraction() {
        char operator = '-';
        double operand1 = 5.0;
        double operand2 = 2.0;
        double expected = 3.0;
        double result = ExecuteMain.performOperation(operator, operand1, operand2);
        assertEquals(expected, result, 0.0001);
    }
    @org.junit.jupiter.api.Test
    public void testMultiplication() {
        char operator = '*';
        double operand1 = 2.0;
        double operand2 = 3.5;
        double expected = 7.0;
        double result = ExecuteMain.performOperation(operator, operand1, operand2);
        assertEquals(expected, result, 0.0001);
    }

    @org.junit.jupiter.api.Test
    public void testDivision() {
        char operator = '/';
        double operand1 = 10.0;
        double operand2 = 2.0;
        double expected = 5.0;
        double result = ExecuteMain.performOperation(operator, operand1, operand2);
        assertEquals(expected, result, 0.0001);
    }

    @org.junit.jupiter.api.Test
    public void testNegation() {
        char operator = '~';
        double operand = 3.0;
        double expected = -3.0;
        double result = ExecuteMain.performOperation(operator, operand, 0);
        assertEquals(expected, result, 0.0001);
    }

    @org.junit.jupiter.api.Test
    public void testMultiplicationPriority() {
        char operator = '*';
        int expected = 2;
        int result = ExecuteMain.getPriority(operator);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    public void testDivisionPriority() {
        char operator = '/';
        int expected = 2;
        int result = ExecuteMain.getPriority(operator);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    public void testAdditionPriority() {
        char operator = '+';
        int expected = 1;
        int result = ExecuteMain.getPriority(operator);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    public void testSubtractionPriority() {
        char operator = '-';
        int expected = 1;
        int result = ExecuteMain.getPriority(operator);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    public void testNegationPriority() {
        char operator = '~';
        int expected = 3;
        int result = ExecuteMain.getPriority(operator);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    public void testUnknownOperatorPriority1() {
        char operator = '#';
        int expected = 0;
        int result = ExecuteMain.getPriority(operator);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    public void testUnknownOperatorPriority2() {
        char operator = '=';
        int expected = 0;
        int result = ExecuteMain.getPriority(operator);
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    public void testUnknownOperatorPriority3() {
        char operator = ':';
        int expected = 0;
        int result = ExecuteMain.getPriority(operator);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    public void testSimpleExpression() {
        String expression = "2 + 3 * 4";
        double expected = 14.0;
        double result = ExecuteMain.evaluateExpression(expression);
        assertEquals(expected, result, 0.0001);
    }

    @org.junit.jupiter.api.Test
    public void testSimpleExpression1() {
        String expression = "2 + 3 * 4";
        double expected = 14.0;
        double result = ExecuteMain.evaluateExpression(expression);
        assertEquals(expected, result, 0.0001);
    }

    @org.junit.jupiter.api.Test
    public void testExpressionWithParentheses() {
        String expression = "(2 + 3) * 4";
        double expected = 20.0;
        double result = ExecuteMain.evaluateExpression(expression);
        assertEquals(expected, result, 0.0001);
    }

    @org.junit.jupiter.api.Test
    public void testExpressionWithParentheses1() {
        String expression = "2 * (3 + 4)";
        double expected = 14.0;
        double result = ExecuteMain.evaluateExpression(expression);
        assertEquals(expected, result, 0.0001);
    }

    @org.junit.jupiter.api.Test
    public void testExpressionWithDecimalNumbers() {
        String expression = "1.5 * 2.5";
        double expected = 3.75;
        double result = ExecuteMain.evaluateExpression(expression);
        assertEquals(expected, result, 0.0001);
    }
    @org.junit.jupiter.api.Test
    public void testExpressionWithDecimalNumbers1() {
        String expression = "3 * 2.5";
        double expected =7.5;
        double result = ExecuteMain.evaluateExpression(expression);
        assertEquals(expected, result, 0.0001);
    }

    @org.junit.jupiter.api.Test
    public void testComplexExpression() {
        String expression = "5 + (6 - 2) * 8 / 4";
        double expected = 13.0;
        double result = ExecuteMain.evaluateExpression(expression);
        assertEquals(expected, result, 0.0001);
    }
    @org.junit.jupiter.api.Test
    public void testComplexExpression1() {
        String expression = "9 + (6 - 2) * 8 / 4";
        double expected = 17.0;
        double result = ExecuteMain.evaluateExpression(expression);
        assertEquals(expected, result, 0.0001);
    }

}