package com.serenity.demo.tests;


import com.serenity.demo.ui.interactions.*;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
public class BasicTest {


    @Managed(driver = "edge")
    WebDriver driver;

    NavigateActions navigate;
    SearchActions search;
    WebElementActions webElementActions;


    @Test
    void openDuckDuckGoWebSite() throws InterruptedException {
        navigate.toHomePage();
        search.byKeyword("cucumber");
        search.waitForSearch();
        Serenity.reportThat("The keyword should appear in the title",
                () -> assertThat(search.getPageTitle()).contains("cucumber")
        );
    }

    @Test
    void openHerokuApp() {
        navigate.openHerokuApp();
        webElementActions.validate(webElementActions.getheading());
    }


}
