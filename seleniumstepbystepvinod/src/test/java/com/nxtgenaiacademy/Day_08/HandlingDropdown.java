package com.nxtgenaiacademy.Day_08;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropdown {

	@Test
	public void handlingDropdown() throws Throwable {
		WebDriver driver;
		String url = "https://nxtgenaiacademy.com/demo-site/";

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement CountryDropDown = driver.findElement(By.id("vfb-13-country"));
		String countryName = "Afghanistan";
		String countryNameI = "India";

		js.executeScript("arguments[0].scrollIntoView();", CountryDropDown);
		System.out.println("JavascriptExecutor is the scrol down :" + CountryDropDown);

		if (CountryDropDown.isDisplayed()) {
			System.out.println("Country dropdown is displyed");

			Select country = new Select(CountryDropDown);
			country.selectByVisibleText(countryName);

			country.selectByVisibleText(countryNameI);
			country.selectByIndex(9);

		} else {
			System.out.println("Country dropdown is not displyed");
		}
		Thread.sleep(5000);
		driver.quit();
	}
}
