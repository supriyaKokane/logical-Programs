package BasicAutomation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin\\Desktop\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.zomato.com/");
		
		System.out.println(driver.getCurrentUrl());
		
//		String ActualUrl=driver.getCurrentUrl();
//		String ExpectedUrl="https://www.zomato.com/";
//		
//		if(ActualUrl.equalsIgnoreCase(ExpectedUrl)) {
//			System.out.println("Link validation successful");
//		}else {
//			System.out.println("Link validation failed");
//		}
//		
//		String ActualTitle=driver.getTitle();
//		String ExpectedTitle="Zomato";
//		
//		if(ActualTitle.equalsIgnoreCase(ExpectedTitle)) {
//			System.out.println("Title validation successful");
//		}else {
//			System.out.println("Title validation failed");
//		}
		
//		driver.manage().window().maximize();
		
//		driver.navigate().to("https://amazon.com");
//		driver.navigate().back();
//		driver.navigate().forward();
		
		Dimension d=new Dimension(600,500);
		driver.manage().window().setSize(d);
		
		Point p=new Point(400,200);
		driver.manage().window().setPosition(p);
		
	}

}
