package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pravin\\Desktop\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/reg/");
		
		WebElement female=driver.findElement(By.xpath("//span[@class='_5k_2 _5dba'][1]"));
		female.click();
		
		if(female.isSelected()==true) {
			System.out.println("By default selected");
		}
		else {
			System.out.println("manually selected");
		}
	}

}
