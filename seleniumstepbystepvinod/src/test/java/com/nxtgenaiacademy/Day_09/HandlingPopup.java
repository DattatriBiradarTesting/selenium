package com.nxtgenaiacademy.Day_09;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingPopup {

	@Test
	public void handlingPopup() throws Throwable {
		WebDriver driver;
		String url = "https://admin:admin@the-internet.herokuapp.com/basic_auth";

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.quit();
	}
}