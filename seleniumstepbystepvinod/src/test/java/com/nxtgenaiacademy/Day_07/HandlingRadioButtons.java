package com.nxtgenaiacademy.Day_07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingRadioButtons {
	@Test
	public void RadioButtons() throws Throwable {
		WebDriver driver;
		String url = "https://nxtgenaiacademy.com/demo-site/";

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement femaleradio = driver.findElement(By.id("vfb-8-2"));

		if (femaleradio.isDisplayed()) {
			System.out.println("Female Radio Button is displayed");
		} else {
			System.out.println("Female Radio Button is not dispayed");
		}
		if (femaleradio.isEnabled()) {

			System.out.println("Female Radio Button is enabled");
		} else {

			System.out.println("Female Radio Bttuon is not displayed");
		}
		if (femaleradio.isSelected()) {
			System.out.println("Female radio button is selected");
		} else {
			System.out.println("Female Radio button is not selected");
		}
		femaleradio.click();
		System.out.println("Female Radio Button is clicked:" + femaleradio);
		driver.quit();
	}

}
