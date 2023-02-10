package AutomationPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsOnAmazon {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin\\Desktop\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		WebElement signin=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Actions a=new Actions(driver);
		a.moveToElement(signin).build().perform();
		
		
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.click();
		search.sendKeys("books");
		Thread.sleep(2500);
		
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='s-suggestion-container']/div"));
		System.out.println(options.size());
		
//		for(int i=0;i<options.size();i++) {
//			String displayoptions=options.get(i).getText();
//			System.out.println(displayoptions+" ");
//		}
		
		for(WebElement value:options) {
			String all=value.getText();
			System.out.println(all);
			
			if(all.equalsIgnoreCase("books in hindi")) {
				value.click();
				break;
			}
		}
		
		
	}
}
