package ScreenShots;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchFromExcel {

public static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin\\Desktop\\chrome driver\\chromedriver_win32 (108)\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/reg");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
//Username:-
		FileInputStream file1=new FileInputStream("C:\\Users\\pravin\\Desktop\\FB_data.xlsx");
		
		Sheet excel=WorkbookFactory.create(file1).getSheet("Sheet1");
		
		String value1= excel.getRow(0).getCell(0).getStringCellValue();
		System.out.println(value1);
		
		WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys(value1);
		
//Surname:-
		FileInputStream file2=new FileInputStream("C:\\Users\\pravin\\Desktop\\FB_data.xlsx");
		
		String value2=excel.getRow(0).getCell(1).getStringCellValue();
		System.out.println(value2);
		
		WebElement surname=driver.findElement(By.xpath("//input[@name='lastname']"));
		surname.sendKeys(value2);
		
//Monile no:-
		FileInputStream file3=new FileInputStream("C:\\Users\\pravin\\Desktop\\FB_data.xlsx");
		
		String value3=excel.getRow(1).getCell(0).getStringCellValue();
		System.out.println(value3);
		
		WebElement mbNo=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		mbNo.sendKeys(value3);
		
//Password:-
		FileInputStream file4=new FileInputStream("C:\\Users\\pravin\\Desktop\\FB_data.xlsx");
		
		String value4=excel.getRow(1).getCell(1).getStringCellValue();
		System.out.println(value4);
		
		WebElement password=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		password.sendKeys(value4);
	}
}
