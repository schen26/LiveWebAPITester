package com.sparta.sc;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class SpartaSubmissionPage {
    WebDriver driver;
    WebElement element;
    String subtitle;
    String output;

    public SpartaSubmissionPage(WebDriver driver) {
        this.driver = driver;
        driver.get("http://localhost:9292/");
    }

    public boolean checkSpartaLogo() {
        return driver.findElement(new By.ByTagName("img")).isDisplayed();
    }

    public String checkWelcome() {

        return driver.findElement(new By.ByClassName("navbar-right")).findElement(new By.ByTagName("p")).getText();
    }

    public String checkBackgroundColour() {
        String colour = driver.findElement(new By.ByTagName("nav")).getCssValue("background-color");
        return colour;
    }

    public String checkPageTitle() {
        return driver.findElement(By.tagName("h1")).getText();
    }
    //Sparta Global Registration Form

    public boolean checkFirstName(String firstName) throws InterruptedException { ///html/body/div[1]/form/div[1]/div/label
        //subtitle=driver.findElement(By.tagName("form")).findElement(By.tagName("label")).getText();
        element = driver.findElement(new By.ById("firstName"));
        element.sendKeys(firstName+Keys.ENTER);
        Thread.sleep(1000);
        boolean output=element.getText().isEmpty();
        return output;



    }

    public String checkLastName(String lastName) { ///html/body/div[1]/form/div[2]/div/label
        subtitle=driver.findElement(By.tagName("form")).findElement(By.tagName("label")).getText();
        driver.findElement(new By.ById("lastName")).sendKeys(lastName+Keys.ENTER);
        output=driver.findElement(new By.ById("lastName")).getText();
        return output;
    }

    public String checkAge() {
        driver.findElement(By.xpath("//input[@placeholder='Enter Age']")).sendKeys(Keys.ARROW_UP);//.getAttribute("placeholder");
        String age = driver.findElement(By.xpath("//input[@placeholder='Enter Age']")).getText();
//        driver.executeScript("document.getElementById('#numtext').setAttribute('value', 123)");
//        driver.
        return age;
    }

    public String checkDOB() {
        element = driver.findElement(new ByIdOrName("dob"));
        element.sendKeys("01082020");
        return element.getText();

    }

    public String checkGender() {
//customRadioInline1 male
        //driver.findElement(new By.ByTagName("button")).click();
        //String colour;
        driver.findElement(new By.ByXPath("/html/body/div[1]/form/button")).click();
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

    public String  checkDegree(String degree) {

        element = driver.findElement(new By.ByXPath("/html/body/div[1]/form/div[7]/div/input"));
        element.sendKeys(degree + Keys.ENTER);///html/body/div[1]/form/div[7]/div/input
        return element.getText();
    }

    public boolean checkUni() {
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
        return element.getText().isEmpty();
    }

    public String checkAddress(String address) {
        element = driver.findElement(new ByIdOrName("inputAddress"));
        element.sendKeys(address+Keys.ENTER);
        return element.getText();
    }

    public String checkAddress2(String address2) {
        element = driver.findElement(new ByIdOrName("inputAddress2"));
        element.sendKeys(address2+Keys.ENTER);
        return element.getText();

    }

    public String checkCity(String city) {
        element = driver.findElement(new ByIdOrName("inputCity"));
        element.sendKeys(city+Keys.ENTER);
        return element.getText();
    }

    public String checkCounty() throws InterruptedException {
        element = driver.findElement(new ByIdOrName("inputCounty"));
        element.click();
//        Select uni = new Select(element);
//
//
//        uni.selectByIndex(2);

        element.findElement(new By.ByXPath("//*[@id=\"inputCounty\"]/option[2]")).click();
        Thread.sleep(1000);
//        element.click();
        return element.getText();
    }

    public String checkPostcode(String postcode) {
        element = driver.findElement(new ByIdOrName("inputPostcode"));
        element.sendKeys(postcode+Keys.ENTER);
        return element.getText();
    }

    public String checkEmail(String email) {
        element = driver.findElement(new ByIdOrName("inputemailaddress"));
        element.sendKeys(email+Keys.ENTER);
        return element.getText();

    }

    public String checkSkills(String skills) {
        element = driver.findElement(new ByIdOrName("exampleFormControlTextarea1"));
        element.sendKeys(skills+Keys.ENTER);
        String paragraph = element.getText();
        return paragraph;
    }

    public String checkPhone() {
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

    public String checkLinkedIn(String url) {
        element = driver.findElement(By.xpath("//input[@placeholder='Enter LinkedIn  url']"));//.sendKeys(Keys.ARROW_UP);
        element.sendKeys(url+Keys.ENTER);
        return element.getText();
    }

    public String checkCV() {
        driver.findElement(By.name("cv")).click();
        driver.findElement(By.name("cv"));
        driver.switchTo().alert().dismiss();
        //Alert alert = wait.(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().sendKeys("Selenium");
//Type your message

        String text = driver.switchTo().alert().getText();

//Press the OK button
        driver.switchTo().alert().accept();
        return text;


//        ExpectedConditions.alertIsPresent();
//        //Alert alert=driver.switchTo().alert();
//
//
//        driver.switchTo().alert().dismiss();
    }

    public boolean checkStream() {
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

        return sdet.isSelected() || devops.isSelected();


    }

    public String checkAgree() throws InterruptedException {
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

    public String checkRate() {
        element = driver.findElement(new By.ByClassName("slidecontainer"));
        element.findElement(new ByIdOrName("experienceSlider")).sendKeys(Keys.ARROW_LEFT);

        String rating = element.findElement(new ByIdOrName("value_for_slider")).getText();



        return rating;


    }
}
