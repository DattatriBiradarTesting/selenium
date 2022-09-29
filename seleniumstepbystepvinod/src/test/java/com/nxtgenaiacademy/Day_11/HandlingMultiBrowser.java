package com.nxtgenaiacademy.Day_11;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMultiBrowser {

	@Test
	public void handlingMultiBrowser() throws Throwable {
		WebDriver driver;
		String url = "https://nxtgenaiacademy.com/multiplewindows/";

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Parent Browser is Opended");

		driver.findElement(By.xpath("//button[contains(text(),'New Browser Window')]")).click();
		System.out.println("Child Browser is Opened");

		System.out.println(driver.getWindowHandles());

		Set<String> windowID = driver.getWindowHandles();
		Iterator<String> iterator = windowID.iterator();

		String parentWindow = iterator.next();
		String ChildWindow = iterator.next();

		System.out.println("Parent Winow ID:: " + parentWindow);
		System.out.println("Child Winow ID:: " + ChildWindow);

		driver.switchTo().window(ChildWindow);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='PYTHON FOR DATA SCIENCE']")).click();
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(parentWindow);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Home']")).click();
		Thread.sleep(3000);
		driver.close();

		Thread.sleep(9000);
		driver.quit();

	}
}