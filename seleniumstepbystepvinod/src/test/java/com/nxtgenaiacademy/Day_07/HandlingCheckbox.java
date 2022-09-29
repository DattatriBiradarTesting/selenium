package com.nxtgenaiacademy.Day_07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingCheckbox {

	@Test
	public void Checkbox() throws Throwable {
		WebDriver driver;
		String url = "https://nxtgenaiacademy.com/demo-site/";

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement uft = driver.findElement(By.id("vfb-20-1"));

		if (uft.isDisplayed()) {
			System.out.println("UFT is displayed");
		} else {
			System.out.println("UFT is not dislayed");
		}
		if (uft.isEnabled()) {
			System.out.println("UFT is enabled");
		} else {
			System.out.println("UFT is not enabled");
		}
		if (uft.isSelected()) {
			System.out.println("UFT is selected");
			uft.click();
			System.out.println("Its Selected " + uft);
		} else {
			System.out.println("UFT is not selected");
		}
		uft.click();
		System.out.println("Its unselected " + uft);
		driver.quit();
	}
}
