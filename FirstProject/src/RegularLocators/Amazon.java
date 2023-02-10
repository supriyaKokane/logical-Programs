package RegularLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\pravin\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		//locators:-
		//1.by id:-
		driver.findElement(By.id("a-page"));
		
		//2.by name:-			
		driver.findElement(By.name("google-site-verification"));
		
		//3.by classname:-
		driver.findElement(By.className("nav-logo-link nav-progressive-attribute"));
		
		//4.by tagname:-
		driver.findElement(By.tagName("h1"));
		
		//5.by linktext:-
		driver.findElement(By.linkText("Sign in"));
		
		//6.Partial link text:-
		driver.findElement(By.partialLinkText("('CSMLibrarySize', 68237)"));
		
		//Customized xpath:-
		//*1.basic xpath:-
		driver.findElement(By.xpath("//i[@class=\"a-icon a-icon-logo\"]"));
		
		//*2.xpath by text function:-
		driver.findElement(By.xpath("//span[text()='Need help?']"));
		
		//*3.xpath by contains:-
		driver.findElement(By.xpath("//label[contains(@class,'a-form-label')]"));
		
		//*4.xpath by start-with:-
		driver.findElement(By.xpath("//span[starts-with(@id,'nav-link-accountList-nav')]"));
		
		//*5.xpath by AND operator:-
		driver.findElement(By.xpath("//div[@id='nav-tools' and @class='layoutToolbarPadding']"));
		
		//*6.xpath by OR operator:-
		driver.findElement(By.xpath("//span[@id='logo-ext' or class='nav-sprite nav-logo-ext nav-progressive-content']"));
	}

}
