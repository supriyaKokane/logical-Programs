package RegularLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookMyShow {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin\\Desktop\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://in.bookmyshow.com/");
		
		//Customized xpath:-
		//basic xpath:-
		driver.findElement(By.xpath("//div[@class='sc-fQejPQ jWuMjc']"));
		
		//xpath by text:-
		driver.findElement(By.xpath("//span[text()='Search for Movies, Events, Plays, Sports and Activities']"));
		
		//xpath  by contains:-
		driver.findElement(By.xpath("//span[contains(@class,'sc-cvbbAY jxbeGL ellipsis')]"));
		
		//xpath by starts-with:-
		driver.findElement(By.xpath("//button[starts-with(@class,'sc-8f9mtj-0 sc-8f9mtj-1 sc-ycjzp')]"));
		
		//xpath by OR operator:-
		driver.findElement(By.xpath("//a[@class='sc-133848s-11 sc-1ljcxl3-1 eQiiBj' or @href='https://in.bookmyshow.com/explore/c/stream']"));
	}

}
