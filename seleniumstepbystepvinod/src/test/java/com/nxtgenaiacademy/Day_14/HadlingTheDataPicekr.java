package com.nxtgenaiacademy.Day_14;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HadlingTheDataPicekr {
	WebDriver driver;
	String url = "https://www.goibibo.com/";
	String Year = "2022";
	String Month = "October";
	String Date = "1";

	@Test
	public void hadlingTheDataPicekr() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(url);

		driver.findElement(By.xpath("//span[contains(text(),'Departure')]")).click();
		WebElement NextMonth = driver.findElement(By.xpath("//SPAN[@aria-label='Next Month']"));
		WebElement date = driver.findElement(By.className("DayPicker-Caption"));

		String CurrentYear = date.getText();
		System.out.println(CurrentYear);

		if (!CurrentYear.contains(Year)) {
			do {
				NextMonth.click();
			} while (!date.getText().contains(Year));
			System.out.println("The Year Selected  :: " + Year);
		}

		String currentMonth = date.getText();
		if (!currentMonth.contains(Month)) {
			do {
				NextMonth.click();
			} while (!date.getText().contains(Month));
			System.out.println("The Month Selected  :: " + Month);
		}

		WebElement selectDate = driver.findElement(By.xpath("//p[contains(text(),'" + Date + "')]"));
		selectDate.click();
		System.out.println("The selectDate Selected  :: " + Date);

		Thread.sleep(6000);
		driver.quit();
	}
}
