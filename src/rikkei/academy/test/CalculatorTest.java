package rikkei.academy.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import rikkei.academy.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    @DisplayName("Testing addition")
    void testCalculateAdd(){
        int a=1;
        int b=1;
        char o = '+';
        int expected =2;

        int result = Calculator.calculate(a,b,o);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing sub")
    void testCalculateSub(){
        int a=2;
        int b=1;
        char o = '-';
        int expected =1;

        int result = Calculator.calculate(a,b,o);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing mul")
    void testCalculateMul(){
        int a=2;
        int b=2;
        char o = '*';
        int expected =4;

        int result = Calculator.calculate(a,b,o);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing divi")
    void testCalculateDivi(){
        int a=6;
        int b=3;
        char o = '/';
        int expected =2;

        int result = Calculator.calculate(a,b,o);
        assertEquals(expected, result);
    }
}
