package com.serenity.demo.ui.interactions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.steps.UIInteractions;
import static org.assertj.core.api.Assertions.assertThat;

public class WebElementActions extends UIInteractions {


    @Step("get heading of home page")
    public String getheading() {
        return $("//*[@class='heading']").getText();
    }

    @Step("validate the field '{0}'")
    public void validate(String heading) {
        Serenity.reportThat("The keyword should appear in the page",
                () -> assertThat(heading).isEqualTo("Welcome to the-internet")
        );
    }
}
