package com.nxtgenaiacademy.Day_07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingButtons_5 {

	@Test
	public void HandlingButtons() throws Throwable {
		WebDriver driver;
		String url = "https://nxtgenaiacademy.com/demo-site/";

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement sumitBtn = driver.findElement(By.id("vfb-4"));

		if (sumitBtn.isDisplayed()) {
			System.out.println("Sumit button is dispalyed");
		} else {
			System.out.println("Sumit button is not dispalyed");
		}
		if (sumitBtn.isEnabled()) {
			System.out.println("Subimt button is enabled");

			sumitBtn.click();
			System.out.println("Sumit button is clicked");

		} else {
			System.out.println("Submit button is not enabled");
		}
		driver.quit();

	}
}
