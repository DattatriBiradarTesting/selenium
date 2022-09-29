package com.nxtgenaiacademy.Day_12;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWbTable {
	@Test
	public void dynamicWbTable() throws Throwable {
		WebDriver driver;
		String url = "https://money.rediff.com/gainers";

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		String tableXpath = "//*[@id=\"leftcontainer\"]/table";
		WebElement tableData = driver.findElement(By.xpath(tableXpath));
		List<WebElement> rowsData = tableData.findElements(By.tagName("tr"));

		int rowcount = rowsData.size();
		// System.out.println("The Table of the Count :: " + rowcount);

		for (int row = 0; row < rowcount; row++) {
			List<WebElement> columnsRow = rowsData.get(row).findElements(By.tagName("td"));

			int colCount = columnsRow.size();
			// System.out.println(colCount);
			for (int col = 0; col < colCount; col++) {
				String cellText = columnsRow.get(col).getText();
				
				System.out.println(cellText);
				
			}
		}
		Thread.sleep(9000);
		driver.quit();
	}
}
