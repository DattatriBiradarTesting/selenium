package com.nxtgenaiacademy.Day_12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticWebtable {

	@Test
	public void staticWebtable() throws Throwable {
		WebDriver driver;
		String url = "https://nxtgenaiacademy.com/webtable/";

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		String FirstName = driver.findElement(By.xpath("//tr[1]/td[2]")).getText();
		String Title = driver.findElement(By.xpath("//tr[6]/td[2]")).getText();
		String EmailID = driver.findElement(By.xpath("//tr[9]/td[2]")).getText();
		System.out.println(FirstName);
		System.out.println(Title);
		System.out.println(EmailID);

		Thread.sleep(9000);
		driver.quit();

	}
}