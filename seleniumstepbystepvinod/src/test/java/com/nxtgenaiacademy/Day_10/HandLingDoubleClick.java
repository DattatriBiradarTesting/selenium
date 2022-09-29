package com.nxtgenaiacademy.Day_10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HandLingDoubleClick {

	@Test
	public void handLingDoubleClick() throws Throwable {
		WebDriver driver;
		String url = "https://demoqa.com/buttons";

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));
		Actions action = new Actions(driver);

		action.doubleClick(doubleClickBtn).perform();
		System.out.println("Button is clicked");
		 

		Thread.sleep(5000);
		driver.quit();
	}
}
