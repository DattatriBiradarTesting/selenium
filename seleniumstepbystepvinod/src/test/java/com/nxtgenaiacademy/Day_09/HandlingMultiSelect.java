package com.nxtgenaiacademy.Day_09;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMultiSelect {

	@Test
	public void handlingMultiSelect() throws Throwable {
		WebDriver driver;
		String url = "https://nxtgenaiacademy.com/webtable/";

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement programming = driver.findElement(By.name("programming"));
		if (programming.isDisplayed()) {
			js.executeScript("window.scrollBy(0,250)", "programming");

			Select languages = new Select(programming);
			languages.selectByVisibleText("Python");
			Thread.sleep(3000);
			languages.selectByVisibleText("Ruby");
			Thread.sleep(3000);
			languages.selectByValue("PHP");
			Thread.sleep(3000);
			languages.selectByIndex(5);
			Thread.sleep(3000);
			languages.deselectByValue("PHP");
			Thread.sleep(3000);
			languages.deselectAll();
			Thread.sleep(3000);

			System.out.println("Programming Knowledge is displayed: " + programming);
		} else {
			System.out.println("Programming Knowledge is NOT displayed: " + programming);
		}
		driver.quit();
	}
}
