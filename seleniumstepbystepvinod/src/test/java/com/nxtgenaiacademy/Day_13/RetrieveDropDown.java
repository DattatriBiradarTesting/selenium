package com.nxtgenaiacademy.Day_13;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RetrieveDropDown {
	@Test
	public void retrieveDropDown() throws Throwable {
		WebDriver driver;
		String url = "https://nxtgenaiacademy.com/demo-site/";

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement country = driver.findElement(By.id("vfb-13-country"));
		Select DropDwon = new Select(country);
		List<WebElement> value = DropDwon.getOptions();
		int count = value.size();
		for (int i = 0; i < count; i++) {
			String Opations = value.get(i).getText();
			System.out.println(Opations);

		}

		Thread.sleep(5000);
		driver.quit();

	}
}