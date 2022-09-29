package com.nxtgenaiacademy.Day_14;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProgressFluentWait {
	WebDriver driver;
	String url = "https://demoqa.com/progress-bar";

	@Test
	public void progressFluentWait() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		driver.findElement(By.id("startStopButton")).click();
		WebElement reset;
		
		Wait<WebDriver>wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(5))
				.withMessage("Fluent Wait Excute")
				.ignoring(NoSuchElementException.class);
				reset=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("resetButton")));
				
				reset.click();
				System.out.println("Reset button is clicked");
				
				driver.quit();

}
}