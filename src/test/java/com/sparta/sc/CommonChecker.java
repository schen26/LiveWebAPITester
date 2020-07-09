package com.sparta.sc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

public class CommonChecker {
    WebDriver driver;

    public CommonChecker(WebDriver driver) {
        this.driver = driver;
    }

    public void checkIfEmpty() {

    }

    public void checkIfGreen() {

    }

    public void checkIfRed() {

    }

    public void checkErrorMessage() {
        driver.findElement(new By.ById("last name")).findElement(new By.ByClassName("invalid-feedback")).getText();

        String[] ArrayOfLabels = new String[checkSubtitle().size()];
        for (int i=0; i<checkSubtitle().size();i++){
            System.out.println(checkSubtitle().get(i).getText());
//            if (checkSubtitle().get(i).getText().endsWith("*")) { //invalid-feedback
//
//                driver.findElement(new By.tagName()).findElement(new By.ByClassName("invalid-feedback")).getText();
//            }
            ArrayOfLabels[i] = checkSubtitle().get(i).getText();
        }

        List<WebElement> listOfInvalidElements = driver.findElements(new By.ByClassName("invalid-feedback"));

//        if (listOfLabelElements.size()!=listOfInvalidElements.size()) {
//
//        }
    }

    public /*String*/List<WebElement> checkSubtitle() {
        List<WebElement> listOfLabelElements = driver.findElements(By.xpath("//label"));

        return listOfLabelElements;//Arrays.toString(listOfLabelElements.toArray());
    }

    public void check() {

    }
}
