package Ahomework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookLanguage {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pravin\\Desktop\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		List<WebElement> language = driver.findElements(By.xpath("//div[@id='pageFooter']/ul/li"));
		
		for(int i=0;i<language.size();i++) {
			WebElement allLang=language.get(i);
			String langName=allLang.getText();
			System.out.println(i+"."+langName);
		}
	}

}
