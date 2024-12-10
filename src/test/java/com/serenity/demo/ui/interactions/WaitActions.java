package com.serenity.demo.ui.interactions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

public class WaitActions extends UIInteractions {

    public void checkVisibilityOfElement(String locator) {
        $(locator).waitUntilVisible();
    }


}
