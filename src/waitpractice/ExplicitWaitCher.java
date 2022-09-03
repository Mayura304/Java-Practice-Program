package waitpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitCher {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\software Testing\\selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");



		WebElement alert_me = driver.findElement(By.id("alert"));
		alert_me.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());


		driver.findElement(By.id("enable-button")).click();
		WebElement click_me = driver.findElement(By.id("disable"));
		wait.until(ExpectedConditions.elementToBeClickable(click_me)).click();


		driver.findElement(By.id("checkbox")).click();
		WebElement check_me = driver.findElement(By.xpath("//*[@type='checkbox']"));
		wait.until(ExpectedConditions.elementToBeSelected(check_me));  



	}

}
