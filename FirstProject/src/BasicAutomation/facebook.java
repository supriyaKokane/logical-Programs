package BasicAutomation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin\\Desktop\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.facebook.com/");
		
//		driver.close();
//		driver.quit();
		
		System.out.println(driver.getCurrentUrl());
		
		String ActualUrl=driver.getCurrentUrl();
		String ExpectedUrl=("https://www.facebook.com/");
		System.out.println(ExpectedUrl);
		if(ActualUrl.equalsIgnoreCase(ExpectedUrl)) {
			System.out.println("Link validation successful");
		}else {
			System.out.println("Link validation failed");
		}
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://google.com");
		driver.navigate().back();
		driver.navigate().forward();
		
		Dimension d=new Dimension(300,500);
		driver.manage().window().setSize(d);
		
		Point p=new Point(500,100);
		driver.manage().window().setPosition(p);
	}

}
