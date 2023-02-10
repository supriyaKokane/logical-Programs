package RegularLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CareHealthInsurance {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin\\Desktop\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.careinsurance.com/");
		
		//basic xpath:-
		driver.findElement(By.xpath("//input[@id='mobileno_navbar']"));
		
		//xpath by text:-
		driver.findElement(By.xpath("//p[text()='Get Updates on WhatsApp']"));
		
		//xpath by contains:-
		driver.findElement(By.xpath("//img[contains(@data-src,'/assets/public/images/icons-19.svg')]"));
		
		//xpath by starts-with:-
		driver.findElement(By.xpath("//img[starts-with(@alt,'Chatbot Care')]"));
		
		
	}

}
