package ScreenShots;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakesScreenShots {
	
	public static WebDriver driver;
	
	public static void takess(int number, String title) throws IOException {
		
//method to take screenshot:-
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
//To get date and time printed with the ss:- 
		Date d = new Date();
		//System.out.println("date and time:- "+d);
		
//Remove spaces and symbol of date from filename:-
		String filename= number+"."+title+"-"+d.toString().replace(" ","_").replace(":","_")+".jpg";
		System.out.println(filename);
		
//File destination:-
		File dest=new File("C:\\Users\\pravin\\Desktop\\Software Testing\\ScreenShots\\"+filename);
		FileUtils.copyFile(src, dest);
	}
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin\\Desktop\\chrome driver\\chromedriver_win32 (108)\\chromedriver.exe");
		driver=new ChromeDriver();
		
//hit the url and maximize the screen:-
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
//take a screenshot of login page:-
		takess(1,"login");
		
//take signup page screenshot:-
		driver.navigate().to("https://www.facebook.com/reg");
		takess(2,"signup");
	}

}
