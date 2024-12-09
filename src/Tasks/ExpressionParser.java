package Tasks;

import java.util.*;

public class ExpressionParser {

    private String expression;
    private int index;

    public ExpressionParser(String expression) {
        this.expression = expression.replaceAll("\\s+", ""); // remove spaces
        this.index = 0;
    }

    public double evaluateExpression() throws Exception {
        double result = parseTerm();
        while (index < expression.length()) {
            char operator = expression.charAt(index);
            if (operator == '+' || operator == '-') {
                index++;
                double term = parseTerm();
                result = operator == '+' ? result + term : result - term;
            } else {
                break;
            }
        }
        return result;
    }

    private double parseTerm() throws Exception {
        double result = parseFactor();
        while (index < expression.length()) {
            char operator = expression.charAt(index);
            if (operator == '*' || operator == '/') {
                index++;
                double factor = parseFactor();
                result = operator == '*' ? result * factor : result / factor;
            } else {
                break;
            }
        }
        return result;
    }

    private double parseFactor() throws Exception {
        if (index >= expression.length()) {
            throw new Exception("Unexpected end of expression.");
        }

        char currentChar = expression.charAt(index);
        if (currentChar == '(') {
            index++; // Skip '('
            double result = evaluateExpression(); // Recursively parse inside parentheses
            if (index < expression.length() && expression.charAt(index) == ')') {
                index++; // Skip ')'
                return result;
            } else {
                throw new Exception("Mismatched parentheses.");
            }
        } else if (Character.isDigit(currentChar) || currentChar == '.') {
            return parseNumber();
        } else {
            throw new Exception("Unexpected character: " + currentChar);
        }
    }

    private double parseNumber() throws Exception {
        int start = index;
        while (index < expression.length() && (Character.isDigit(expression.charAt(index)) || expression.charAt(index) == '.')) {
            index++;
        }

        try {
            return Double.parseDouble(expression.substring(start, index));
        } catch (NumberFormatException e) {
            throw new Exception("Invalid number format.");
        }
    }

}
