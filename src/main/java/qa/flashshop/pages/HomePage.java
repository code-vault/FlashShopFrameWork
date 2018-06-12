package qa.flashshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
	WebDriver driver;
	WebElement logo;
	public HomePage() {
		// TODO Auto-generated constructor stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://ecom.thepropertyz.com");
		logo = driver.findElement(By.xpath("//img[@title = 'Your Store']"));
	}
		
	public void clickOnLogo() {
		logo.click();
		String title = logo.getAttribute("title");
	}
}
