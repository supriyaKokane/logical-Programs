package AutomationPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsOnFLIP {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin\\Desktop\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		WebElement close=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();
		
		WebElement home=driver.findElement(By.xpath("(//div[@class='xtXmba'])[3]"));
		Actions a=new Actions(driver);
		a.moveToElement(home).build().perform();
		Thread.sleep(1500);
		
		WebElement men = driver.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']"));
		a.moveToElement(men).build().perform();
		
		 List<WebElement> menlist = driver.findElements(By.xpath("//div[@class='_2IjXr8']/div[2]/a "));
		
		 for(WebElement value:menlist ) {
			 System.out.println(value.getText());
			 if(value.getText().equalsIgnoreCase("Men's kurtas")) {
				 value.click();
				 break;
			 }
		 }
		
		
		
	}

}
