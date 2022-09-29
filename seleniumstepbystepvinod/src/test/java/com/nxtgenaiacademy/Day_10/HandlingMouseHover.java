package com.nxtgenaiacademy.Day_10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMouseHover {
	@Test
	public void handlingMouseHover() throws Throwable {
		WebDriver driver;
		String url = "https://nxtgenaiacademy.com/";

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Actions action = new Actions(driver);

		WebElement QAAutomation = driver.findElement(By.xpath("//span[normalize-space()='QA Automation']"));
		action.moveToElement(QAAutomation).perform();
		Thread.sleep(3000);
		
		WebElement PracticeAutomation = driver.findElement(By.linkText("Practice Automation"));
		action.moveToElement(PracticeAutomation).perform();
		Thread.sleep(3000);
		
		WebElement RegistrationForm = driver.findElement(By.partialLinkText("Registration Form"));
		RegistrationForm.click();

		Thread.sleep(5000);
		driver.quit();
	}
}
