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

public class KeyBoardActions {

	@Test
	public void keyBoardActions() throws Throwable {
		WebDriver driver;
		String url = "https://www.google.com/";
		String value="selenium testing";

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement search=driver.findElement(By.name("q"));
		Actions action=new Actions(driver);
		action.moveToElement(search)
		.keyDown(search,Keys.SHIFT)
		.sendKeys(search,value)
		.keyUp(search,Keys.SHIFT)
		.pause(3000)
		.sendKeys(Keys.ENTER)
		.perform();
		
     Thread.sleep(5000);
     driver.close();
		

	}
}