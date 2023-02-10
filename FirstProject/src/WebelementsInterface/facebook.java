package WebelementsInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pravin\\Desktop\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		
		//Expected url is hit or not:-
		String AUrl=driver.getCurrentUrl();
		System.out.println(AUrl);
		
		String EUrl="https://rahulshettyacademy.com/loginpagePractise/";
		System.out.println(EUrl);
		
		if(AUrl.equalsIgnoreCase(EUrl)) {
			System.out.println("Link validation successful");
		}else {
			System.out.println("Link validation failed");
		}
		
		//Username:-
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("rahulshettyacademy");
		
		//Password:-
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("learning");
		
		//Click on checkbox terms and condition:-
		WebElement terms=driver.findElement(By.xpath("//input[@name='terms']"));
		terms.click();
		
		if(terms.isSelected()==true) {
			System.out.println("Manually selected");
		}else {
			terms.click();
			System.out.println("Selected by default");
		}
		
		//Click on signin button:-
		WebElement signin=driver.findElement(By.xpath("//input[@name='signin']"));
		signin.click();
		System.out.println(signin.isEnabled());
		if(signin.isEnabled()==true) {
			System.out.println("signin button enabled");
		}else {
			System.out.println("signin is disabled");
		}
		
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		
		String A=driver.getCurrentUrl();
		String E="https://rahulshettyacademy.com/angularpractice/shop";
		
		if(A.equalsIgnoreCase(E)) {
			System.out.println("Login successful");
		}else {
			System.out.println("Login unsuccessful");
			System.out.println("Please enter valid credentials");
		}
	}
}
