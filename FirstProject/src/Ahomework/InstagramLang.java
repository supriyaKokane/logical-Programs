package Ahomework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InstagramLang {
	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin\\Desktop\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement listofoptions = driver.findElement(By.xpath("//select[@class='_aajm']"));
		Select options = new Select(listofoptions);
		options.selectByValue("nl");
		Select onelang=new Select(driver.findElement(By.xpath("//select[@class='_aajm']")));
		System.out.println(onelang.getFirstSelectedOption().getText());
	
	}

}
