package RegularLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rahulshetty {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pravin\\Desktop\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		//checkbox.click();
		
		if(checkbox.isSelected()==true) {
			System.out.println("by default selected");
		}else {
			System.out.println("not selected");
		}
     }
}
