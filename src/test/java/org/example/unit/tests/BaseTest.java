package org.example.unit.tests;

import org.example.Calculator;
import org.example.CalculatorService;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected CalculatorService calculator;

    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
    }

}
