package AutomationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation1 {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin\\Desktop\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
//		driver.get("https://www.icicibank.com");
//		
//		driver.get("https://www.amazon.com");
//		
//		driver.get("https://www.zomato.com");
//		
//		driver.get("https://www.myvi.in/");
//		
//		driver.get("https://health.policybazaar.com/");
//		
//		driver.get("https://www.gmail.com");
//		
//		driver.get("https://www.bookmyshow.com");
	}
}
