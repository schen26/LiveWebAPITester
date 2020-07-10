package com.sparta.sc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverPOM {
    WebDriver driver = new ChromeDriver();
    SpartaSubmissionPage page = new SpartaSubmissionPage(driver);

    @Test
    public void checkSpartaLogo() {
        Assertions.assertEquals(true, page.checkSpartaLogo());
    }

    @Test
    public void checkWelcome() {
        Assertions.assertEquals("Welcome to Sparta Globa", page.checkWelcome());
    }

    @Test
    public void checkBackgroundColour() {
        Assertions.assertEquals("rgba(61, 11, 55, 1)", page.checkBackgroundColour());
    }

    @Test
    public void checkPageTitle() {
        Assertions.assertEquals("Sparta Global Registration Form", page.checkPageTitle());
    }

    @Test
    public void checkFirstName() {
        Assertions.assertEquals("rgba(73, 80, 87, 1)", page.checkFirstName("First Name"));
    }

    @Test
    public void checkLastName() {
        Assertions.assertEquals("rgba(73, 80, 87, 1)", page.checkLastName("Windsor"));
    }

    @Test
    public void checkAge() {
        Assertions.assertEquals("rgba(73, 80, 87, 1)", page.checkAge());
    }

    @Test
    public void checkDOB() {
        Assertions.assertEquals("rgba(0, 0, 0, 1)", page.checkDOB());
    }

    @Test
    public void checkGender() {
        Assertions.assertEquals("rgba(40, 167, 69, 1)", page.checkGender());
    }

    @Test
    public void checkDegree() {
        Assertions.assertEquals("rgba(73, 80, 87, 1)", page.checkDegree("PhD Java"));
    }

    @Test
    public void checkUni() {
        Assertions.assertEquals("rgba(73, 80, 87, 1)", page.checkUni());
    }

    @Test
    public void checkAddress() {
        Assertions.assertEquals("rgba(73, 80, 87, 1)", page.checkAddress("dd"));
    }

    @Test
    public void checkAddress2() {
        Assertions.assertEquals("rgba(73, 80, 87, 1)", page.checkAddress2("Buckingham Palace"));
    }

    @Test
    public void checkCity() {
        Assertions.assertEquals("rgba(73, 80, 87, 1)", page.checkCity("London"));
    }

    @Test
    public void checkCounty() {
            Assertions.assertEquals("rgba(73, 80, 87, 1)", page.checkCounty());
    }

    @Test
    public void checkPostcode() {
        Assertions.assertEquals("rgba(73, 80, 87, 1)", page.checkPostcode("SW1A 1AA"));
    }

    @Test
    public void checkEmail() {
        Assertions.assertEquals("rgba(73, 80, 87, 1)", page.checkEmail("email@hotmail.co.uk"));
    }

    @Test
    public void checkSkills() {
        Assertions.assertEquals("rgba(73, 80, 87, 1)", page.checkSkills("I'm skilled"));
    }

    @Test
    public void checkPhone() {
        Assertions.assertEquals(true, page.checkPhone().startsWith("rgb"));
    }

    @Test
    public void checkLinkedIn() {
        Assertions.assertEquals("rgba(73, 80, 87, 1)", page.checkLinkedIn("https://linkedin"));
    }

    @Test
    public void checkCV() {
        Assertions.assertEquals("Upload a CV", page.checkCV());
    }

    @Test
    public void checkStream() {
        Assertions.assertEquals("rgba(40, 167, 69, 1)", page.checkStream());
    }

    @Test
    public void checkAgree() {
        Assertions.assertEquals("rgba(220, 53, 69, 1)", page.checkAgree());
    }

    @Test
    public void checkRate() {
        Assertions.assertEquals(true, page.checkRate().matches("\\d{0,3}"));
    }
}
