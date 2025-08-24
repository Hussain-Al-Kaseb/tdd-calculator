package tdd;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    Calculator calc = new Calculator();
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }
   /* @Test
    void add() {
        int actual = calc.calcAdd(2,2);
        int expected = 4;
        assertEquals(expected, actual);

    }*/
    @Test
    void addString() {
        int actual = calc.calcAdd("1,2,3");
        int expected = 6;
        assertEquals(expected, actual);

    }
    @Test
    void addArray(){
        int actual = calc.calcAdd(new int[]{1, 2, 3});
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void sub() {
        int actual = calc.calcSub(2,2);
        int expected = 0;
        assertEquals(expected, actual);

    }
    @Test
    void multiply() {
        int actual = calc.calcMultiply(2,2);
        int expected = 4;
        assertEquals(expected, actual);

    }
    @Test
    void divide() {
        int actual = calc.calcDivide(2,2);
        int expected = 1;
        assertEquals(expected, actual);

    }


}