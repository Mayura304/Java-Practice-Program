package windowhandling;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowId {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\software Testing\\selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.javatpoint.com/");
		String parent_id = driver.getWindowHandle();
		System.out.println(parent_id);
	
		driver.findElement(By.xpath("//*[@id=\"link\"]/div/ul/li[3]/a")).click();
		//driver.findElement(By.xpath("//*[@id=\"smoothmenu1\"]/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//li//a[@href=\"collections-in-java\"]")).click();
		driver.findElement(By.xpath("//li//a[@href=\"exception-handling-in-java\"]")).click();
		
		Set<String> all_windows = driver.getWindowHandles();
		String[] allwinid = new String[all_windows.size()];
		int i=0;
		
		for(String window:all_windows)
		{
			allwinid[i]=window;
			System.out.println(window);
		}

	}

}
