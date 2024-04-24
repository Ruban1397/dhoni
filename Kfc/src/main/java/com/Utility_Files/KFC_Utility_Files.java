package com.Utility_Files;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KFC_Utility_Files {

	public static WebDriver driver;

	public static void get_Url(WebDriver driver, String url) {
		driver.get(url);

	}

	public static void max(WebDriver driver) {
		driver.manage().window().maximize();
	}

	public static void sendkeys(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void click(WebElement element) {
		element.click();
	}

	public static void jsScroll(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", element);

	}

	public static void close(WebDriver driver) {
		driver.close();
	}

}