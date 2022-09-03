package windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRM {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\software Testing\\selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		String parent_id = driver.getWindowHandle();
		System.out.println(parent_id);
		driver.findElement(By.xpath("//*[@id=\"forgotPasswordLink\"]/a")).click();
		Set<String> all_window_id = driver.getWindowHandles();
		for(String window_id:all_window_id)
		{
			System.out.println(window_id);
		}
		
	}

}
