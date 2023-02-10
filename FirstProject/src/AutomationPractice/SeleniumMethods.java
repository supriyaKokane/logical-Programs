package AutomationPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethods {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin\\Desktop\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		System.out.println("************ NAVIGATE ***************");
		
		driver.navigate().to("https://google.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.get("https://www.facebook.com/reg/");
		
		System.out.println("************ IS DISPLAYED ***************");
		WebElement logo=driver.findElement(By.xpath("//img[@class='fb_logo _agiv img']"));
		System.out.println("Logo is displaed:- "+ logo.isDisplayed());
		
		System.out.println("************ MAXIMIZE ***************");
		
		driver.manage().window().maximize();
		
		System.out.println("**********Multiple elements***************");
		
		List<WebElement> footerlinks=driver.findElements(By.xpath("//div[@id='pageFooterChildren']/ul/li/a"));
		System.out.println("Number of total footer elements:- "+footerlinks.size());
		
		for(int i=0;i<footerlinks.size();i++) {
			WebElement individuallink=footerlinks.get(i);
			String linkname=individuallink.getText();
			//System.out.println(i+")"+linkname);
			
			String link=individuallink.getAttribute("href");
			System.out.println(i+")"+linkname+":- "+link);
			
		}
		
	}

}
