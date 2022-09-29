package com.nxtgenaiacademy.Day_07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HadlingTheTextBox_4 {

	@Test
	public void HadlingTheTextBox() throws Throwable {
		WebDriver driver;
		String url = "https://nxtgenaiacademy.com/demo-site/";
		String Frsitname = "vinayak";
		String lastName = "Biradar";

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.id("vfb-5"));
		WebElement element1 = driver.findElement(By.id("vfb-7"));
		element.sendKeys(Frsitname);
		Thread.sleep(3000);
		element1.sendKeys(lastName);
		Thread.sleep(3000);
		element.clear();
		System.out.println("The clear of Frsitname");
		Thread.sleep(3000);
		element1.clear();
		System.out.println("The clear of lastName");
		Thread.sleep(3000);

		if (element.isDisplayed()) {
			System.out.println("Fisrt Name is  Diplayed");
		} else {
			System.out.println("First name is not displayed");
		}
		if (element.isEnabled()) {
			System.out.println("Frist name is enabled");
		} else {
			System.out.println("Frist name is not  enabled");
		}
		driver.quit();
	}
}
