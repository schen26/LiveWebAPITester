package com.sparta.sc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Arrays;

public class WebDriverPOM {
//    public WebDriverPOM() {
//        //System.setProperty("webdriver.chrome.driver", "D:chromedriver.exe")
//    }

    private DriverManager driverManager;
    WebDriver driver = new ChromeDriver();
    SpartaSubmissionPage page = new SpartaSubmissionPage(driver);
    CommonChecker common = new CommonChecker(driver);
    colour popUp;

    @Test
    public void checkSpartaLogo() {
        Assertions.assertEquals(true, page.checkSpartaLogo());
        driver.quit();
    }

    @Test
    public void checkWelcome() {
        Assertions.assertEquals("Welcome to Sparta Global", page.checkWelcome());
        driver.quit();
    }

    @Test
    public void checkBackgroundColour() {
        Assertions.assertEquals("rgba(61, 11, 55, 1)", page.checkBackgroundColour());
        driver.quit();
    }

    @Test
    public void checkPageTitle() {
        Assertions.assertEquals("Sparta Global Registration Form", page.checkPageTitle());
        driver.quit();
    }

    @Test
    public void checkFirstName() {
        try {
            Assertions.assertEquals("First Name", page.checkFirstName("First Name"));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

    @Test
    public void checkLastName() {
        Assertions.assertEquals("Windsor", page.checkLastName("Windsor"));
        driver.quit();
    }

    @Test
    public void checkAge() {
        Assertions.assertEquals("1", page.checkAge());
        driver.quit();
    }

    @Test
    public void checkDOB() {
        Assertions.assertEquals("01/08/2020",page.checkDOB());
        driver.quit();
    }

    @Test
    public void checkGender() {
        Assertions.assertEquals("01/08/2020",page.checkGender());
        driver.quit();

    }

    @Test
    public void checkDegree() {
        Assertions.assertEquals("PhD Java", page.checkDegree("PhD Java"));
        driver.quit();
    }

    @Test
    public void checkUni() {
        Assertions.assertEquals(false, page.checkUni());
        driver.quit();
    }

    @Test
    public void checkAddress() { //inputAddress
//        driver.findElement(new By.ById("inputAddress")).getText();
//        driver.findElement(new By.ById("inputAddress")).
//                findElement(new By.ByClassName("invalid-feedback")).getText().contains("Please Enter");
//        driver.findElement(By.xpath("//a[@href='products/']")).getCssValue("color");
        //popUp= new colour();
        Assertions.assertEquals("dd", page.checkAddress("dd"));
        driver.quit();
    }

    @Test
    public void checkAddress2() {
        Assertions.assertEquals("Buckingham Palace", page.checkAddress2("Buckingham Palace"));
        driver.quit();
    }

    @Test
    public void checkCity() {
        Assertions.assertEquals("London", page.checkCity("London"));
        driver.quit();
    }

    @Test
    public void checkCounty() {
        try {
            Assertions.assertEquals("", page.checkCounty());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

    @Test
    public void checkPostcode() {
        Assertions.assertEquals("SW1A 1AA", page.checkPostcode("SW1A 1AA"));
        driver.quit();
    }

    @Test
    public void checkEmail() {
        Assertions.assertEquals("email@hotmail.co.uk", page.checkEmail("email@hotmail.co.uk"));
        driver.quit();
    }

    @Test
    public void checkSkills() {
        Assertions.assertEquals("I'm skilled", page.checkSkills("I'm skilled"));
        driver.quit();
    }

    @Test
    public void checkPhone() {
        Assertions.assertEquals("rgb(106, 185, 130)", page.checkPhone());
        //System.out.println(page.checkPhone()); //rgb(139, 194, 158)
        driver.quit();
    }

    @Test
    public void checkLinkedIn() {
        Assertions.assertEquals("https://", page.checkLinkedIn("https://"));
        driver.quit();
    }

    @Test
    public void checkCV() {
        Assertions.assertEquals(true, page.checkCV());
        driver.quit();
    }

    @Test
    public void checkStream() {
        Assertions.assertEquals(true, page.checkStream());
        driver.quit();
    }

    @Test
    public void checkAgree() {
        try {
            Assertions.assertEquals(true, page.checkAgree());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

    @Test
    public void checkRate() {
        System.out.println(page.checkRate());
        Assertions.assertEquals(true, page.checkRate().matches("\\d{0,3}"));
        driver.quit();
    }

    @Test
    public void checkSubtitle() {
        System.out.println(common.checkSubtitle());
        String[] ArrayOfLabels = new String[common.checkSubtitle().size()];
        for (int i = 0; i < common.checkSubtitle().size(); i++) {
            System.out.println(common.checkSubtitle().get(i).getText());
            ArrayOfLabels[i] = common.checkSubtitle().get(i).getText();
        }
        //common.checkSubtitle().forEach(System.out::println);
        driver.quit();
    }

}
