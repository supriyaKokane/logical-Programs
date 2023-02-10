package AutomationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BMSHOWmultipleElements {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin\\Desktop\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://in.bookmyshow.com/");
		
		
    }	
}
