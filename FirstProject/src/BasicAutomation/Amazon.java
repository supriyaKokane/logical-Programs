package BasicAutomation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin\\Desktop\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		System.out.println(driver.getCurrentUrl());
		
//		String ActualUrl=driver.getCurrentUrl();
//		String ExpectedUrl="https://www.amazon.com/";
//		
//		if(ActualUrl.equalsIgnoreCase(ExpectedUrl)) {
//			System.out.println("Link validation successful");
//		}else {
//			System.out.println("Link validation failed");
//		}
		
//		driver.manage().window().maximize();
		
//		driver.navigate().to("https://google.com");
//		driver.navigate().back();
//		driver.navigate().forward();
		
		Dimension d=new Dimension(600,500);
		driver.manage().window().setSize(d);
		
		Point p=new Point(400,200);
		driver.manage().window().setPosition(p);
		
		
		//"C:\Users\pravin\Desktop\jar files\firefox exe\geckodriver.exe"
	}

}
