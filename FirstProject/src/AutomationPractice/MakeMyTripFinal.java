package AutomationPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MakeMyTripFinal {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin\\Desktop\\jar files\\chromedriver_win32 (109)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@name='notification-frame-22a350cb5']"));
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("//a[@class='close']")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//li[@data-cy='account']")).click();

		WebElement from = driver.findElement(By.xpath("//label[@for='fromCity']"));
		from.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("pune");

		List<WebElement> fromelements = driver
				.findElements(By.xpath("//div[@id='react-autowhatever-1']/div/ul/li/div/div/p"));

		for (WebElement element : fromelements) {
			if (element.getText().equals("Pune, India")) {
				element.click();
				break;
			}
		}

		driver.findElement(By.xpath("//input[@id='toCity']")).click();

		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("mumbai");

		List<WebElement> toelements = driver
				.findElements(By.xpath("//div[@id='react-autowhatever-1']/div/ul/li/div/div/p"));

		for (WebElement element : toelements) {
			if (element.getText().equals("Mumbai, India")) {
				element.click();
				break;
			}
		}

		WebElement monthpicker = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]/div"));
		while (!monthpicker.getText().contains("June")) {
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		}

		List<WebElement> departuredays = driver.findElements(By.xpath("//div[@class='DayPicker-Day']/div/p"));

		for (WebElement day : departuredays) {
			if (day.getText().equals("23")) {
				day.click();
				break;
			}
		}

		driver.findElement(By.xpath("//a[text()='Search']")).click();
		driver.findElement(By.xpath("//div[@class='commonOverlay ']/span")).click();

		List<WebElement> times = driver.findElements(By.xpath("//div[@class='flexOne timeInfoLeft']/p/span"));

//	System.out.println(driver.findElement(By.xpath("(//div[@class='makeFlex simpleow']/div/div/p[1])[5]")).getText());

		for (int i = 0; i < times.size(); i++) {
			Actions a = new Actions(driver);
			a.moveToElement(times.get(i)).build().perform();
			Thread.sleep(500);
			if (times.get(i).getText().contains("04:35")) {
				System.out.println(driver
						.findElement(By.xpath("(//div[@class='makeFlex simpleow']/div/div/p[1])[" + (i + 1) + "]"))
						.getText());

				WebElement viewprices = driver
						.findElement(By.xpath("(//span[@class='appendRight8'])[" + (i + 1) + "]"));
				viewprices.click();
				break;
			}

		}
		driver.findElement(By.xpath("//button[@class='button corp-btn latoBlack buttonPrimary fontSize13  ']")).click();

	}


}
