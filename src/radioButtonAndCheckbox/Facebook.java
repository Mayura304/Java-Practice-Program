package radioButtonAndCheckbox;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook {

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\software Testing\\selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.linkText("Sign up for Facebook")).click();
	 
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
		WebElement show = driver.findElement(By.xpath("//*[text()='Male']"));
		show.click();
		boolean status = show.isSelected();
		boolean enablestatus = show.isEnabled();
		System.out.println("Enable status = "+enablestatus);
		System.out.println("Gender status selection = "+status);

	}

}
