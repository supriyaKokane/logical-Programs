package AutomationPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyTableInExcel {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin\\Desktop\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.worldometers.info/world-population/population-by-country/");
		
		int rows=driver.findElements(By.xpath("//table[@id='example2']//tbody/tr")).size();
		System.out.println(rows);
		
		int cols=driver.findElements(By.xpath("//table[@id='example2']//tbody/tr[1]/td")).size();
		System.out.println(cols);
		
		for(int r=1;r<=rows;r++) {
			for(int c=1;c<=cols;c++) {
				String value=driver.findElement(By.xpath("//table[@id='example2']//tbody/tr["+r+"]/td["+c+"]")).getText();
				System.out.print("==>"+value);
			}
			System.out.println();
		}
	}

}
