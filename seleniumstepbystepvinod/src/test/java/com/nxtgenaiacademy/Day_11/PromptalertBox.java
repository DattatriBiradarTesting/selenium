package com.nxtgenaiacademy.Day_11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PromptalertBox {

	@Test
	public void PromptalertBoxClick() throws Throwable {
		WebDriver driver;
		String url = "https://nxtgenaiacademy.com/alertandpopup/";

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement prompt = driver.findElement(By.xpath("//button[contains(text(),'Prompt Alert Box')]"));
		Thread.sleep(5000);
		prompt.click();

		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		String boxMSG = alert.getText();
		Thread.sleep(5000);
		System.out.println("prompt Alert Box::" + boxMSG);
		Thread.sleep(5000);
		alert.sendKeys("Yes");
		alert.accept();
		prompt.click();
		Thread.sleep(5000);
		alert.sendKeys("No");
		alert.dismiss();
		Thread.sleep(5000);
		driver.quit();

	}
}
