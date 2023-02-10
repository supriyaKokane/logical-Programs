package BasicAutomation;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ssPractice {
	
	public static WebDriver driver;
	
	public static void takescreenshot(String filename) throws IOException {
		
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File dest=new File("C:\\Users\\pravin\\Desktop\\Software Testing\\ScreenShots\\"+filename+".jpg");
	
	FileUtils.copyFile(src, dest);
	
	}	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin\\Desktop\\chrome driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		takescreenshot("Flipcart");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("(//div[@class='xtXmba'])[2]")).click();
		Thread.sleep(5000);
		takescreenshot("Mobile");
		
		System.out.println("Done");
	}

}
