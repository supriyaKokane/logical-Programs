package BasicAutomation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UtilityCls {

//Take Screenshot:-
	public static void getscreenshot(WebDriver driver,String title) throws IOException {
		//Date d= new Date();
		//String name=title+"-"+d.toString().replace(" ", "_").replace(":", "_80,nbvcz000");
		File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination=new File("c://selenium/screenshots/"+title+".jpg");
		FileUtils.copyFile(source, destination);
	}
	
//Fetch data from excel:-
	public static void fetchFromExcel(String path,String sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream testdata=new FileInputStream(path);
		Sheet excel=WorkbookFactory.create(testdata).getSheet(sheetname);
		String value=excel.getRow(row).getCell(cell).getStringCellValue();
	}

//Title by javascript:-	
	public static void titleByJS(WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		String title=js.executeScript("return document.title;").toString();
		System.out.println(title);
	}
	
//Border by javascript:-	
	public static void borderByJS(WebDriver driver,WebElement element) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='5px solid red';", element);
	}
	
//Click by javascript:-	
	public static void clickByJS(WebDriver driver,WebElement element) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", element);
	}

//create Alert popup by javascript:-	
	public static void alertmessage(WebDriver driver,String message) {
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("alert('" + message + "')");
	}
	
//Refresh by javascript:-	
	public static void refresh(WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("history.go(0);");
	}

//Scroll Down by javascript:-
	public static void scrolldownByJS(WebDriver driver, int x, int y) {
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("scroll(" +x+ "," +y+ ")");
	}
	
//Scroll Up by javascript:-	
	public static void scrollUpByJS(WebDriver driver, int x, int y) {
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("scroll(" +x+ "," +y+ ")");
	}
	
//Scroll into view by javascript:-	
	public static void ScrollIntoView(WebElement element,WebDriver driver) {
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("argument[0].scrollIntoView(true);",element);
	}	
	
}
