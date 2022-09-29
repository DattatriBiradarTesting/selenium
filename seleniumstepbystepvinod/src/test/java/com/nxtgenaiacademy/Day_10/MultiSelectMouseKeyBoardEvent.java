package com.nxtgenaiacademy.Day_10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelectMouseKeyBoardEvent {
	@Test
	public void MultiSelectMouseKeyBoard() throws Throwable {
		WebDriver driver;
		String url = "https://demoqa.com/selectable/";

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.id("demo-tab-grid")).click();
		WebElement one = driver.findElement(By.xpath("//li[normalize-space()='One']"));
		WebElement two = driver.findElement(By.xpath("//li[normalize-space()='Two']"));
		WebElement four = driver.findElement(By.xpath("//li[contains(text(),'Four')]"));
		WebElement six = driver.findElement(By.xpath("//li[contains(text(),'Six')]"));
		WebElement Seven = driver.findElement(By.xpath("//li[contains(text(),'Seven')]"));
		WebElement Nine = driver.findElement(By.xpath("//li[contains(text(),'Nine')]"));
		
		Actions action=new Actions(driver);
		action.keyDown(Keys.CONTROL)
		.click(one)
		.pause(3000)
		.click(two)
		.pause(3000)
		.click(four)
		.pause(3000)
        .click(six)
        .pause(3000)
        .click(Seven)
        .pause(3000)
        .click(Nine)
        .pause(3000)
        .keyUp(Keys.CONTROL)
        .perform();
		
		Thread.sleep(5000);
		driver.quit();
        
	}
}