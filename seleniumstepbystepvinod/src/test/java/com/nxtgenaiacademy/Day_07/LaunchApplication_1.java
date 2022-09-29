package com.nxtgenaiacademy.Day_07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApplication_1 {
	@Test
	public void Launchapplication() {
		WebDriver driver;
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		String usernmae = "Admin";
		String password = "admin123";

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys(usernmae);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).sendKeys(Keys.ENTER);

	}

}
