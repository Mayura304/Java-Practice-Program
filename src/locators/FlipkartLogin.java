package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\software Testing\\selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/account/login?ret=%2Faccount%2Forders&fromMyOrdersPage=true");
		driver.findElement(By.xpath("(//*[@type='text'])[2]")).sendKeys("9420610684");
		driver.findElement(By.linkText("Forgot?")).click();
		driver.findElement(By.xpath("//*[text()='New to Flipkart? Create an account']")).click();

	}

}
