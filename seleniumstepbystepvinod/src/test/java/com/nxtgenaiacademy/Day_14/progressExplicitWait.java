package com.nxtgenaiacademy.Day_14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class progressExplicitWait {
	WebDriver driver;
	String url = "https://demoqa.com/progress-bar";

	@Test
	public void ProgressExplicitWait() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);

		WebElement start = driver.findElement(By.id("startStopButton"));
		start.click();
		System.out.println("start click: " + start);
		
		WebElement reset;
		WebDriverWait wait = new WebDriverWait(driver, 30);
		reset = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("resetButton")));
		reset.click();
		System.out.println("Resent button is clicked");

		driver.quit();
	}
}
