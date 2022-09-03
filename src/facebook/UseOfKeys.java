package facebook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UseOfKeys {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\software Testing\\selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		Actions act = new Actions(driver);
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Mayura");
		act.sendKeys(Keys.TAB).sendKeys("Kale").sendKeys(Keys.TAB).sendKeys("9420610684").sendKeys(Keys.TAB).sendKeys("942061068").build().perform();
		
		List<WebElement> days = driver.findElements(By.xpath("//*[@id='day']//option"));
		for(WebElement day:days)
		{
			String day_value = day.getText();
			System.out.println(day_value);
			if(day_value.equals("30"))
			{
				day.click();
				break;
			}
		}
		
		List<WebElement> months = driver.findElements(By.xpath("//*[@id='month']//option"));
		for(WebElement month:months)
		{
			String month_name = month.getText();
			System.out.println(month_name);
			if(month_name.equals("August"))
			{
				month.click();
				break;
			}
		}
		
		List<WebElement> years = driver.findElements(By.xpath("//*[@id='year']//option"));
		for(WebElement year:years)
		{
			String year_value = year.getText();
			System.out.println(year_value);
			if(year_value.equals("1997"))
			{
				year.click();
				break;
			}
		}
		
		List<WebElement> choices = driver.findElements(By.xpath("//*[@data-type='radio']//label"));
		for(WebElement choice:choices)
		{
			String gender = choice.getText();
			System.out.println(gender);
			if(gender.equals("Female"))
			{
				choice.click();
				break;
			}
		}
		
		driver.findElement(By.xpath("//*[contains(@id,'u_0_s_')]")).click();

	}

}
