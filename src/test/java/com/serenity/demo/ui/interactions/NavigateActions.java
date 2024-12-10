package com.serenity.demo.ui.interactions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

public class NavigateActions extends UIInteractions {

    @Step("Navigate to the home page")
    public void toHomePage() {
        openUrl("https://duckduckgo.com/");
    }

    @Step("open heroku home page")
    public void openHerokuApp() {
        openUrl("https://the-internet.herokuapp.com/");
    }
}