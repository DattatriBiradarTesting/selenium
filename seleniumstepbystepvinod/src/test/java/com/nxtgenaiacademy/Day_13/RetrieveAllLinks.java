package com.nxtgenaiacademy.Day_13;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RetrieveAllLinks {

	@Test
	public void retrieveAllLinks() throws Throwable {
		WebDriver driver;
		String url = "https://nxtgenaiacademy.com/python/";

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		List<WebElement> allLink = driver.findElements(By.tagName("a"));

		for (WebElement link : allLink) {
			System.out.println(link.getText() + "_" + link.getAttribute("href"));
		}
		Thread.sleep(5000);
		driver.quit();
	}

}
