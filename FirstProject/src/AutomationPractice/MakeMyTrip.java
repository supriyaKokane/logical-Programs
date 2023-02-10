package AutomationPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin\\Desktop\\jar files\\chromedriver_win32 (109)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@name='notification-frame-22a350cb5']"));
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("//a[@class='close']")).click();
		
		Thread.sleep(2500);
		
		driver.findElement(By.xpath("//li[@class='makeFlex hrtlCenter font10 makeRelative lhUser userLoggedOut']")).click();

		WebElement from=driver.findElement(By.xpath("//input[@id='fromCity']"));
		from.click();

		WebElement pune=driver.findElement(By.xpath("//input[@aria-controls='react-autowhatever-1']"));
		pune.click();
		pune.sendKeys("Pune");
		
		Thread.sleep(3000);
		List<WebElement> fromList=driver.findElements(By.xpath("//div[@id='react-autowhatever-1']/div/ul/li/div/div/p"));
		for(int i=0;i<fromList.size();i++) {
			if(fromList.get(i).getText().equalsIgnoreCase("Pune, India")) {
				fromList.get(i).click();
				break;
			}
		}
		
		WebElement to=driver.findElement(By.xpath("//label[@for='toCity']"));
		to.click();
		to.sendKeys("mumbai");
		
		List<WebElement> toList=driver.findElements(By.xpath("//div[@id='react-autowhatever-1']/div/ul/li/div/div/p"));
		for(int i=0;i<toList.size();i++) {
			if(toList.get(i).getText().equalsIgnoreCase("Mumbai, India")) {
				toList.get(i).click();
				break;
			}
		}
		
		
	}

}
