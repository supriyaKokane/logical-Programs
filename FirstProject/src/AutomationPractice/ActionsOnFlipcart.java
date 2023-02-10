package AutomationPractice;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsOnFlipcart {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin\\Desktop\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		WebElement close=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();
		
		WebElement home=driver.findElement(By.xpath("(//div[@class='_1psGvi SLyWEo'])[3]"));
		Actions a=new Actions(driver);
		a.moveToElement(home).build().perform();
		Thread.sleep(1500);
		
//		 List<WebElement> options = driver.findElements(By.xpath("//a[@class='_6WOcW9']"));
//		 System.out.println(options.size());
//		 
//		 for(WebElement value1:options) {
//			 System.out.println(value1.getText());
//		 }
//		 
//		 for(WebElement value:options) {
//			 if(value.getText().equalsIgnoreCase("Bedroom Furniture")) {
//				 value.click();
//				 break;
//			 }
//		 }
		
		WebElement search = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		search.sendKeys("samsung 5g ");
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		Thread.sleep(2000);
		
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String parentID=it.next();
		String childID=it.next();
		driver.switchTo().window(childID);
		
		WebElement mb=driver.findElement(By.xpath("//span[@class='B_NuCI']"));
		System.out.println(mb.getText());
		driver.close();
		
		driver.switchTo().window(parentID);
		
		WebElement mb2=driver.findElement(By.xpath("(//div[@class='_4rR01T'])[3]"));
		mb2.click();
		System.out.println(mb2.getText());
	}

}
