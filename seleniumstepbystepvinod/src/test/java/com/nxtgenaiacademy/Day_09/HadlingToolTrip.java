package com.nxtgenaiacademy.Day_09;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HadlingToolTrip {

	@Test
	public void hadlingToolTrip() throws Throwable {
		WebDriver driver;
		String url = "https://www.google.com/";

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement googleSearch = driver.findElement(By.name("q"));
		Actions action = new Actions(driver);
		action.moveToElement(googleSearch).perform();

		String actToolTipMsg = googleSearch.getAttribute("title");
		String expToolTipMsg = "Search";

		if (actToolTipMsg.equals(expToolTipMsg)) {
			System.out.println("Both the actual and expected tool tip massages are same");
			System.out.println("The tool tip massage is :: " + actToolTipMsg);
		} else {
			System.out.println("Both the actual and expected too tip massages are NOT same");
			System.out.println("The actual tool tip message is :: " + actToolTipMsg);
			System.out.println("The expeted tool tip message is :: " + expToolTipMsg);
		}

		Thread.sleep(5000);
		driver.quit();
	}
}
