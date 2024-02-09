package com.blueyonder.day9.Calculator.test;

import com.blueyonder.day9.Calculator.main.Calculator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator=new Calculator();

    @Before
    public void inputValues()
    {

    }

    @After
    public void checking()
    {
        System.out.println("Finished checking");
    }

    @Test
    public void findFactorial() {
        assertEquals(1,calculator.findFactorial((0)));
        assertEquals(2,calculator.findFactorial((2)));
        assertEquals(6,calculator.findFactorial((3)));
    }

    @Test
    public void sum()
    {
        assertEquals(5,calculator.add(2,3));
        assertEquals(1999999998,calculator.add(999999999,999999999));
    }

    @Test
    public void showDevice() {
    }
}