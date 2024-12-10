package com.serenity.demo.ui.interactions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

public class AddRemoveElementActions extends UIInteractions {
    private String heading = "//h3";
    private String addElement = "//*[text()='Add Element']";
    private String deleteBtn = "//*[@class='added-manually']";

    public String getHeading() {
        return $(heading).getText();
    }

    @Step("Clicking on the Add Button")
    public void addElement() {
        $(addElement).click();
    }

    public int getSizeOfDeleteBtn() {
        return $(deleteBtn).thenFindAll(deleteBtn).size();
    }

}
