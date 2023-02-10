package Attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mock {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin\\Desktop\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		WebElement name=driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		name.sendKeys("abc");
		
		WebElement password= driver.findElement(By.xpath("//input[@class='_2IX_2- _3umUoc _3mctLh VJZDxU']"));
		password.sendKeys("xyz");
		
		WebElement login=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		login.click();
		
		WebElement msg=driver.findElement(By.xpath("//span[text()='Please enter valid Email ID/Mobile number']"));
		
		String actualmsg=msg.getText();
		String expectedmsg="Please enter valid Email ID/Mobile number";
		
		if(actualmsg.equalsIgnoreCase(expectedmsg)) {
			System.out.println("test-case pass=invalid credentials");
		}else {
			System.out.println("test case failed");
		}
		
	}

}
