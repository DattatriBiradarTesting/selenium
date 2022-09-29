package com.nxtgenaiacademy.Day_11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConfrimAlertBox {
	@Test
	public void confrimAlertBox() throws Throwable {
		WebDriver driver;
		String url = "https://nxtgenaiacademy.com/alertandpopup/";

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement confirmalertbox = driver.findElement(By.name("confirmalertbox"));
		Thread.sleep(3000);
		confirmalertbox.click();
		Thread.sleep(3000);
		String confirmalertBOX = driver.switchTo().alert().getText();
		System.out.println(confirmalertBOX);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		confirmalertbox.click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();

		Thread.sleep(9000);
		driver.quit();

	}
}
