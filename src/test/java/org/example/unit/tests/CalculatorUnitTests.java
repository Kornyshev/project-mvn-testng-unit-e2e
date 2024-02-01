package org.example.unit.tests;

import org.example.unit.listeners.UnitTestListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(UnitTestListener.class)
public class CalculatorUnitTests extends BaseTest {

    @Test
    public void testSum() {
        Assert.assertEquals(calculator.sum(2, 3), 5);
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(calculator.subtract(5, 3), 2);
    }

    @Test
    public void testMultiple() {
        Assert.assertEquals(calculator.multiple(3, 4), 12);
    }

    @Test
    public void testDivideWithFloor() {
        Assert.assertEquals(calculator.divideWithFloor(5, 2), 2.0);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivideByZero() {
        calculator.divideWithFloor(5, 0);
    }

    @Test
    public void testIsOdd() {
        Assert.assertTrue(calculator.isOdd(3));
        Assert.assertFalse(calculator.isOdd(4));
    }

}
