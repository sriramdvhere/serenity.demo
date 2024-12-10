package com.serenity.demo.ui.interactions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class SearchActions extends UIInteractions {

    private String searchbox_xpath = "#searchbox_input";

    @Step("Search for '{0}'")
    public void byKeyword(String keyword) {
        $(searchbox_xpath).sendKeys(keyword, Keys.ENTER);
    }

    public String getPageTitle() {
        return getDriver().getTitle();
    }

    public void waitForSearch() throws InterruptedException {
        waitABit(5000);
    }

}
