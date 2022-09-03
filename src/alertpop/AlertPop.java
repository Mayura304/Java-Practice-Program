package alertpop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertPop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\software Testing\\selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.findElement(By.name("alert")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.name("confirmation")).click();
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.name("prompt")).click();
		driver.switchTo().alert().dismiss();
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"sub-menu\"]"));
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		driver.findElement(By.xpath("//*[@id=\"link2\"]")).click();
		
		driver.navigate().back();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement double_click = driver.findElement(By.xpath("//*[@id=\"double-click\"]"));
		act.doubleClick(double_click).perform();
		driver.switchTo().alert().accept();
		
	}

}
