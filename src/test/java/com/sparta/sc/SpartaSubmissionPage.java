package com.sparta.sc;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ByIdOrName;

public class SpartaSubmissionPage {
    WebDriver driver;
    WebElement element;
    String title;
    String colour;

    public SpartaSubmissionPage(WebDriver driver) {
        this.driver = driver;
        driver.get("http://localhost:9292/");
    }

    public boolean checkSpartaLogo() {
        boolean isDisplayed = driver.findElement(new By.ByTagName("img")).isDisplayed();
        driver.close();
        return isDisplayed;
    }

    public String checkWelcome() {
        title = driver.findElement(new By.ByClassName("navbar-right")).findElement(new By.ByTagName("p")).getText();
        driver.close();
        return title;
    }

    public String checkBackgroundColour() {
        colour = driver.findElement(new By.ByTagName("nav")).getCssValue("background-color");
        driver.close();
        return colour;
    }

    public String checkPageTitle() {
        title = driver.findElement(By.tagName("h1")).getText();
        driver.close();
        return title;
    }

    public String checkFirstName(String firstName) {
        element = driver.findElement(new By.ById("firstName"));
        element.sendKeys(firstName + Keys.ENTER);
        clickSubmit();
        colour = element.getCssValue("color");
        driver.close();
        return colour;
    }

    public String checkLastName(String lastName) {
        title = driver.findElement(By.tagName("form")).findElement(By.tagName("label")).getText();
        element =driver.findElement(new By.ById("lastName"));
        element.sendKeys(lastName + Keys.ENTER);
        clickSubmit();
        colour = element.getCssValue("color");
        driver.close();
        return colour;
    }

    public String checkAge() {
        element= driver.findElement(By.xpath("//input[@placeholder='Enter Age']"));
        element.sendKeys(Keys.ARROW_UP);
        clickSubmit();
        colour = element.getCssValue("color");
        driver.close();
        return colour;
    }

    public String checkDOB() {
        element = driver.findElement(new ByIdOrName("dob"));
        element.sendKeys("01082020");
        clickSubmit();
        colour = element.getCssValue("color");
        driver.close();
        return colour;
    }

    public String checkGender() {
        element = driver.findElement(new By.ByXPath("/html/body/div[1]/form/div[5]/label"));
        element.click();
        clickSubmit();
        colour = element.getCssValue("color");
        driver.close();
        return colour;
    }

    public String checkDegree(String degree) {
        element = driver.findElement(new By.ByXPath("/html/body/div[1]/form/div[7]/div/input"));
        element.sendKeys(degree + Keys.ENTER);
        clickSubmit();
        colour = element.getCssValue("color");
        driver.close();
        return colour;
    }

    public String checkUni() {
        element = driver.findElement(new By.ById("inputUni"));
        element.findElement(new By.ByXPath("//*[@id=\"inputUni\"]/option[2]")).click();
        clickSubmit();
        colour = element.getCssValue("color");
        driver.close();
        return colour;
    }

    public String checkAddress(String address) {
        element = driver.findElement(new ByIdOrName("inputAddress"));
        element.sendKeys(address + Keys.ENTER);
        clickSubmit();
        colour = element.getCssValue("color");
        driver.close();
        return colour;
    }

    public String checkAddress2(String address2) {
        element = driver.findElement(new ByIdOrName("inputAddress2"));
        element.sendKeys(address2 + Keys.ENTER);
        clickSubmit();
        colour = element.getCssValue("color");
        driver.close();
        return colour;

    }

    public String checkCity(String city) {
        element = driver.findElement(new ByIdOrName("inputCity"));
        element.sendKeys(city + Keys.ENTER);
        clickSubmit();
        colour = element.getCssValue("color");
        driver.close();
        return colour;
    }

    public String checkCounty() {
        element = driver.findElement(new ByIdOrName("inputCounty"));
        element.click();
        element.findElement(new By.ByXPath("//*[@id=\"inputCounty\"]/option[2]")).click();
        clickSubmit();
        colour = element.getCssValue("color");
        driver.close();
        return colour;
    }

    public String checkPostcode(String postcode) {
        element = driver.findElement(new ByIdOrName("inputPostcode"));
        element.sendKeys(postcode + Keys.ENTER);
        clickSubmit();
        colour = element.getCssValue("color");
        driver.close();
        return colour;
    }

    public String checkEmail(String email) {
        element = driver.findElement(new ByIdOrName("inputemailaddress"));
        element.sendKeys(email + Keys.ENTER);
        clickSubmit();
        colour = element.getCssValue("color");
        driver.close();
        return colour;

    }

    public String checkSkills(String skills) {
        element = driver.findElement(new ByIdOrName("exampleFormControlTextarea1"));
        element.sendKeys(skills + Keys.ENTER);
        clickSubmit();
        colour = element.getCssValue("color");
        driver.close();
        return colour;
    }

    public String checkPhone() {
        WebElement phone = driver.findElement(new By.ById("exampleFormControlInput1"));
        phone.sendKeys("java" + Keys.ENTER);
        String phoneBorderColour = driver.findElement(new By.ById("exampleFormControlInput1")).getCssValue("border-color");
        System.out.println(driver.findElement(new By.ByXPath("/html/body/div[1]/form/div[16]/div/label")).getText());
        driver.close();
        return phoneBorderColour;
    }

    public String checkLinkedIn(String url) {
        element = driver.findElement(By.xpath("//input[@placeholder='Enter LinkedIn  url']"));
        element.sendKeys(url+Keys.ARROW_UP);
        clickSubmit();
        colour = element.getCssValue("color");
        System.out.println(element.getText());
        driver.close();
        return colour;
    }

    public String checkCV() {
        title = driver.findElement(new By.ByXPath("/html/body/div[1]/form/div[18]/div/label")).getText();
        driver.close();
        return title;
    }

    public String checkStream() {
        WebElement sdet = driver.findElement(new By.ByXPath("/html/body/div[1]/form/div[20]/div[1]/label"));
        sdet.click();
        clickSubmit();
        colour = sdet.getCssValue("color");
        System.out.println(driver.findElement(new By.ByXPath("/html/body/div[1]/form/div[19]/p")).getText());
        driver.close();
        return colour;
    }

    public String checkAgree() {
        WebElement button = driver.findElement(new By.ByTagName("button"));
        button.click();
        colour = driver.findElement(new By.ByClassName("form-check-label")).getCssValue("color");
        System.out.println(driver.findElement(new By.ByClassName("form-check-label")).getText());
        driver.close();
        return colour;
    }

    public String checkRate() {
        element = driver.findElement(new By.ByClassName("slidecontainer"));
        element.findElement(new ByIdOrName("experienceSlider")).sendKeys(Keys.ARROW_LEFT);
        String rating = element.findElement(new ByIdOrName("value_for_slider")).getText();
        System.out.println(element.findElement(new By.ByXPath("/html/body/div[1]/form/div[22]/p")).getText());
        driver.close();
        return rating;
    }

    public void clickSubmit() {
        WebElement button = driver.findElement(new By.ByTagName("button"));
        button.click();
    }
}
