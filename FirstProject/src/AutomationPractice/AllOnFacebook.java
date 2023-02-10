package AutomationPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllOnFacebook {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin\\Desktop\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
//1.launch the url:-
		driver.get("https://www.facebook.com/reg");
		
//2.Check whether correct url is hit or not :-
		String ActualURL=driver.getCurrentUrl();
		String ExpectedURL="https://www.facebook.com/reg";
		
		if(ActualURL.equalsIgnoreCase(ExpectedURL)) {
			System.out.println("Link Validation Successful");
		}else {
			System.out.println("Link Validation Failed");
		}
		System.out.println("*********************************");
		
//3.Maximize the window:-
		driver.manage().window().maximize();
		
//4.Enter firstname:-
		WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("Supriya");

//5.Enter Surname:-		
		WebElement surname=driver.findElement(By.xpath("//input[@name='lastname']"));
		surname.sendKeys("Kokane");
	
//6.Enter Email:-		
		WebElement email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		email.sendKeys("s123@gmail.com");
		
//7.ReEnter Email:-		
		WebElement reemail=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		reemail.sendKeys("s123@gmail.com");		
		
//8.Enter Password:-
		WebElement password=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		password.sendKeys("123456789");
		
//9.Select Day:-[By index]
		WebElement selectday=driver.findElement(By.xpath("//select[@title='Day']"));
		Select d=new Select(selectday);
		d.selectByIndex(21);
   
//10.All elements present in Day list:-
		List<WebElement> dates = d.getOptions();
		System.out.println("Total dates present in listbox:- "+ dates.size());
		
		for(int i=0;i<dates.size();i++) {
			String displaydate=dates.get(i).getText();
			System.out.print(displaydate+" ");
		}
	    System.out.println("*********************************");	
	    
//11.Select Month:-[By Visible Text]
		WebElement selectmonth=driver.findElement(By.xpath("//select[@title='Month']"));
		Select m=new Select(selectmonth);
		m.selectByVisibleText("Nov");
		
//12.All elements present in Month list:-		
		List<WebElement> months = m.getOptions();
		System.out.println("Total months present in listbox:- " + months.size());
		
		for(int i=0;i<months.size();i++) {
			String displaymonth=months.get(i).getText();
			System.out.println(displaymonth);
		}
		System.out.println("*********************************");
		
//13.Select year:-[By Value]		
		WebElement selectyear=driver.findElement(By.xpath("//select[@title='Year']"));
		Select y=new Select(selectyear);
		y.selectByValue("1993");
		
//14.All elements present in Year list:-		
		List<WebElement> years = y.getOptions();
		System.out.println("Total years present in the listbox:- " + years.size());
		
		for(int i=0;i<years.size();i++) {
			String displayyear=years.get(i).getText();
			System.out.print(displayyear+" ");
		}
		System.out.println("*********************************");
		
//15.Select Gender:-
		WebElement female=driver.findElement(By.xpath("//input[@value='1']"));
		female.click();
		
		if(female.isSelected()==true) {
			System.out.println("Gender option is selected");
		}else {
			System.out.println("Please select gender option");
		}
		System.out.println("*********************************");
		
//16.Click on Sign Up button:-
		WebElement signup=driver.findElement(By.xpath("//button[@name='websubmit']"));
		
		if(signup.isEnabled()==true) {
			signup.click();
			System.out.println("Signup button is enabled");
		}else {
			System.out.println("Signup button is Disabled");
		}
				
	}

}
