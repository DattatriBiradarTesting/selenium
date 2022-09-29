package com.nxtgenaiacademy.Day_10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HadlingRightClick {

	@Test
	public void handLingDoubleClick() throws Throwable {
		WebDriver driver;
		String url = "http://demo.guru99.com/test/simple_context_menu.html";

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement rightClick = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		WebElement deletedOption = driver.findElement(By.xpath("//span[contains(text(),'Delete')]"));

		Actions action = new Actions(driver);
		action.contextClick(rightClick).pause(3000).click(deletedOption).perform();

		driver.switchTo().alert().accept();

		Thread.sleep(5000);
		driver.quit();
	}
}
