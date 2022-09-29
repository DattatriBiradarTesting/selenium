package com.nxtgenaiacademy.Day_11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDragDrop {

	@Test
	public void handLingDoubleClick() throws Throwable {
		WebDriver driver;
		String url = "https://nxtgenaiacademy.com/alertandpopup/";

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement alertbox = driver.findElement(By.name("alertbox"));
		alertbox.click();
		Thread.sleep(3000);

		String alertboxMsg = driver.switchTo().alert().getText();
		System.out.println(alertboxMsg);
		driver.switchTo().alert().accept();

		Thread.sleep(9000);
		driver.quit();

	}

}
