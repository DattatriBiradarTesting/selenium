package com.nxtgenaiacademy.Day_10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDragDrop {

	@Test
	public void handLingDoubleClick() throws Throwable {
		WebDriver driver;
		String url = "https://demo.guru99.com/test/drag_drop.html";

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement amountfive = driver.findElement(By.xpath("//section[@id='g-container-main']//li[2]//a[1]"));
		WebElement amount = driver.findElement(By.xpath("//ol[@id='amt7']//li[@class='placeholder']"));
		Actions action = new Actions(driver);
		action.dragAndDrop(amountfive, amount).perform();

	}

}
