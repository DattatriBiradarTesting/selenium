package com.nxtgenaiacademy.Day_09;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingIframes {

	@Test
	public void handlingIframes() throws Throwable {
		WebDriver driver;
		String url = "https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html";

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.xpath("/html/body/main/ul/li[4]/a")).click();
		System.out.println("org.openqa.selenium.chrome links clicked");

		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("/html/body/main/div/section[1]/ul/li[7]/a")).click();
		System.out.println("packageFrame chrome links clicked");

		driver.switchTo().defaultContent();
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("HELP")).click();

		Thread.sleep(5000);
		driver.quit();

	}
}