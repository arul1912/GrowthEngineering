package org.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver d;
	public static Actions a;

	public static void launchChrome() {
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
	}

	public static void launchUrl(String url) {
		d.get(url);

	}

	public static void maxWindow() {
		d.manage().window().maximize();

	}

	public static void implicitWaitMethod() {
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public static void fillTheValues(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void btnClick(WebElement elements) {
		elements.click();
	}

	public static void moveElement(WebElement element) {
		a = new Actions(d);
		a.moveToElement(element).perform();

	}

	public static void selectionByValue(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByValue(text);
	}

	public static void selectionByInde(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}

}
