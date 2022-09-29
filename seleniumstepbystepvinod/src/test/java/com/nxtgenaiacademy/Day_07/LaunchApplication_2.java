package com.nxtgenaiacademy.Day_07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApplication_2 {
	@Test
	public void Launchapplication() {
		WebDriver driver;
		String url = "https://nxtgenaiacademy.com/";

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String actTitle = driver.getTitle();
		String expTitle = "NxtGen A.I Academy – Learn With Clarity";

		if (actTitle.equals(expTitle)) {
			System.out.println("Both th actual AND exoected titles are  same");
			System.out.println("The title of the page is " + actTitle);
		} else {
			System.out.println("Both th actual AND exoected titles are not same");
			System.out.println("The actual of the page is " + actTitle);
			System.out.println("The expTitle of the page is " + expTitle);
		}
		System.out.println("__________________________________________________________");
		

		driver.findElement(By.partialLinkText("DATA SCIENCE")).click();

		String actCurrentURl = driver.getCurrentUrl();
		String expCurrentURl = "https://nxtgenaiacademy.com/python/";

		if (actCurrentURl.equals(expCurrentURl)) {
			System.out.println("Both the actual and expectd current rul are same");
			System.out.println("The current url is " + actCurrentURl);

		} else {

			System.out.println("Both the actual and expected current url are not same");
			System.out.println("Actual current url is " + actCurrentURl);
			System.out.println("Expected current url is " + expCurrentURl);

		}
		
		String pageSoure = driver.getPageSource();
		int pagesourcelenth = pageSoure.length();
		System.out.println(pagesourcelenth);

		driver.close();

	}

}
