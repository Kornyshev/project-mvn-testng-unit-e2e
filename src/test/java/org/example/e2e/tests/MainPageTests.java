package org.example.e2e.tests;

import org.example.e2e.tests.listeners.E2ETestListener;
import org.example.e2e.ui.steps.MainPageSteps;
import org.testng.annotations.*;

@Listeners(E2ETestListener.class)
public class MainPageTests extends BaseTest {

    private MainPageSteps mainPageSteps;

    @BeforeClass
    public void setUp() {
        // Initialization of MainPageSteps - this might involve setting up a WebDriver instance
        mainPageSteps = new MainPageSteps();
    }

    @Test
    public void testMainPageAction() {
        // Use the MainPageSteps class to perform actions
        mainPageSteps.doSomething();
        // Add assertions or further steps as necessary
    }

}
