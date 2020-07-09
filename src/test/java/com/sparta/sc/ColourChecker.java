package com.sparta.sc;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ColourChecker {
    WebDriver driver;
    WebElement element;

    public ColourChecker(WebDriver driver) {
        this.driver = driver;
        driver.get("http://localhost:9292/");
    }

    public String checkFirstNameColour() {
        return driver.findElement(By.tagName("form")).findElement(By.tagName("label")).getText();

    }

    public void checkLastNameColour() {

    }

    public void checkAgeColour() {

    }

    public String checkGenderColour() {
//customRadioInline1 male
        //driver.findElement(new By.ByTagName("button")).click();
        //String colour;
        driver.findElement(new By.ByTagName("button")).click();
        try {

            Thread.sleep(1000);


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String colour = driver.findElement(new By.ById("customRadioInline1")).getCssValue("color");
        return colour;
        //String colour = driver.findElement(new By.ById("customRadioInline1")).getCssValue("color");

        //customRadioInline2 female
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        //driver.findElement(By.cssSelector("#")
//        driver.getClass().getName().
    }

    public String  checkDegreeColour() {
        String degree = "PhD Java SDET";
        element = driver.findElement(new By.ByXPath("/html/body/div[1]/form/div[7]/div/input"));
        element.sendKeys(degree + Keys.ENTER);///html/body/div[1]/form/div[7]/div/input
        return element.getText();
    }

    public String checkUniColour() {
//inputUni
        element = driver.findElement(new By.ById("inputUni"));
//        System.out.println(element.getText().isEmpty());
//        element.click();
        Select uni = new Select(element);
        uni.selectByIndex(2);


//        element.findElement(new By.ByXPath("//*[@id=\"inputUni\"]/option[2]")).click();
//        element.click();
        //element.findElement(new By.ByTagName("option[2]"));
        //String uni = element.getText();
        return element.getText();
    }

    public void checkAdressColour() {

    }

    public void checkAddress2Colour() {

    }

    public void checkCityColour() {

    }

    public void checkCountyColour() {

    }

    public void checkPostcodeColour() {

    }

    public void checkEmailColour() {

    }

    public void checkSkillsColour() {

    }

    public String checkPhoneColour() {
        WebElement phone = driver.findElement(new By.ById("exampleFormControlInput1"));
        phone.sendKeys("java" + Keys.ENTER);
        phone.getText().isEmpty();

        if (phone.getText().contains("*")) {
            try {
                String subMessage = phone.findElement(new By.ByClassName("invalid-feedback")).getText();
//                if (subMessage.contains("Please enter"))
                return  subMessage;

            } catch(Exception e){
                System.out.println("Missing displace error message!");
            }

        }



        String phoneBorderColour = driver/*.findElement(new By.ById("terms"))*/
                .findElement(new By.ById("exampleFormControlInput1")).getCssValue("border-color");
//exampleFormControlInput1
        return phoneBorderColour;
    }

    public void checkLinkedInColour() {

    }

    public boolean checkStreamColour() {
        WebElement sdet = driver.findElement(By.id("streamRadioInline1"));
        WebElement devops = driver.findElement(By.id("streamRadioInline2"));

        //Radio Button1 is selected
        sdet.click();
        System.out.println("Radio Button Option 1 Selected");

        //Radio Button1 is de-selected and Radio Button2 is selected
        devops.click();

        String colourSDET = driver/*.findElement(new By.ById("terms"))*/
                .findElement(new By.ById("streamRadioInline1")).findElement(new By.ByClassName("custom-control-label"))
                .getCssValue("color");

        String wordSDET = driver/*.findElement(new By.ById("terms"))*/
                .findElement(new By.ById("streamRadioInline1")).findElement(new By.ByClassName("custom-control-label"))
                .getText();

        String colourDevOps = driver/*.findElement(new By.ById("terms"))*/
                .findElement(new By.ById("streamRadioInline2")).findElement(new By.ByClassName("custom-control-label"))
                .getCssValue("color");

        String wordDevOps = driver/*.findElement(new By.ById("terms"))*/
                .findElement(new By.ById("streamRadioInline2")).findElement(new By.ByClassName("custom-control-label"))
                .getText();

        return sdet.isSelected() ^ devops.isSelected();


    }

    public String checkAgreeColour() throws InterruptedException {
        WebElement button = driver.findElement(new By.ByTagName("button"));
        button.isSelected();
        button.click();
        button.isSelected();
//        try {
//
        Thread.sleep(1000);
//
//
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        //form-check-label
        //form-check-label
        String colour = driver/*.findElement(new By.ById("terms"))*/
                .findElement(new By.ByClassName("form-check-label")).getCssValue("color");
        System.out.println(driver/*.findElement(new By.ById("terms"))*/
                .findElement(new By.ByClassName("form-check-label")).getText());
        return colour;

    }
}
