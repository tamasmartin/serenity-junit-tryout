package com.tmartin.steps;

import net.thucydides.core.annotations.Step;

public class TestSteps {

    @Step("Step 1")
    public void doSomething() {
        System.out.println("Step 1");
    }

    @Step("Step 2")
    public void doSomethingElse() {
        System.out.println("Step 2");
    }
}
