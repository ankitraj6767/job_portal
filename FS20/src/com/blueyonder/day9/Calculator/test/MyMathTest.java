package com.blueyonder.day9.Calculator.test;

import com.blueyonder.day9.Calculator.main.MyMath;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MyMathTest {

    MyMath myMath = new MyMath();

    @org.junit.jupiter.api.Test
    void add() {
        assertEquals(64, myMath.add(42, 22));
        assertEquals(1999999998, myMath.add(999999999, 999999999));
    }

    @Test
    void divide() {
//        assertEquals(7, myMath.divide(42,6));
        assertThrows(ArithmeticException.class, () -> myMath.divide(1, 0), "Divide by zero error");
    }
}