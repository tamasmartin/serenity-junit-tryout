package com.tmartin.tests;

import com.tmartin.steps.TestSteps;
import net.serenitybdd.junit.runners.SerenityRunner;

import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class CalcTest {

    @Steps
    private TestSteps testSteps;

    @Test
    public void testThis() {
        testSteps.doSomething();
        testSteps.doSomethingElse();
    }
}
