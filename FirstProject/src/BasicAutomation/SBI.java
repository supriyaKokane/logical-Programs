package BasicAutomation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SBI {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin\\Desktop\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//To launch the browser:-
		driver.get("https://www.onlinesbi.sbi/");
		
		//To close the browser:-(focus on current tab)
		//driver.close();
		
		//To close all the tabs from browser:-
		//driver.quit();
		
		//Check whether the exact url is hit or not:-
		System.out.println(driver.getCurrentUrl());
		
		String ActualUrl=driver.getCurrentUrl();
		String ExpectedUrl="https://www.onlinesbi.sbi/";
		
		if(ActualUrl.equalsIgnoreCase(ExpectedUrl)) {
			System.out.println("Link validation Successful");
		}else {
			System.out.println("Link validation failed");
		}
		
		//Capture the title of current webpage:-
		String ActualTitle=driver.getTitle();
		System.out.println(ActualTitle);
		
		String ExpectedTitle="State Bank Of India";
		
		if(ActualTitle.equalsIgnoreCase(ExpectedTitle)) {
			System.out.println("Title validation Successful");
		}else {
			System.out.println("Title validation failed");
		}
		
		//Maximize:- it will open your browser with full window.
		
		driver.manage().window().maximize();
		
		//Navigate:- To hit the url and some additional operations like back, forward and refresh
		driver.navigate().to("http:/www.google.com");
		driver.navigate().back();
		driver.navigate().forward();
		
		//Setsize:- allow you to set the size of the browser.
		Dimension d=new Dimension(100,400);
		driver.manage().window().setSize(d);
		
		//Setposition:- we can set the position of your browser on your screen.
		
		Point p=new Point(100,200);
		driver.manage().window().setPosition(p);
		
	}

}
