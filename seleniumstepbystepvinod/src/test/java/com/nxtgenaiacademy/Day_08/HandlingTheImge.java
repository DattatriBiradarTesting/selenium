package com.nxtgenaiacademy.Day_08;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingTheImge {

	@Test
	public void handlingTheImge() throws Throwable {
		WebDriver driver;
		String url = "https://nxtgenaiacademy.com/demo-site/";

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement robotImge = driver.findElement(By.xpath("//img[@alt='Automation']"));

		if (robotImge.isDisplayed()) {
			System.out.println("Logo imgage is displayed");
			robotImge.click();
			System.out.println("____________________________________________________");
			System.out.println("Robot imges is Displayed");
			System.out.println(robotImge.getAttribute("alt"));
			System.out.println(robotImge.getAttribute("src"));
			System.out.println(robotImge.getAttribute("sizes"));
			System.out.println(robotImge.getAttribute("width"));
			System.out.println(robotImge.getAttribute("srcset"));
			System.out.println(robotImge.getAttribute("class"));
			System.out.println("____________________________________________________");
			String robotText = robotImge.getAttribute("alt");
			System.out.println("The text of the robot imges is " + robotText);
			System.out.println("____________________________________________________");

		} else {
			System.out.println("Robot  imges is not Displayed");
		}

	}
}