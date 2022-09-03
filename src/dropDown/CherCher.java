package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CherCher {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\software Testing\\selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		 List<WebElement> products = driver.findElements(By.xpath("//*[@id='first']//option"));
		 for(WebElement product: products )
		 {
			 String product_name = product.getText();
			 System.out.println(product_name);
			 if(product_name.equals("Google"))
			 {
				 product.click();
				 break;
			 }
			 
		 }
		 
		 List<WebElement> animals = driver.findElements(By.xpath("//*[@id='animals']//option"));
		 for(WebElement animal: animals)
		 {
			 String animal_name = animal.getText();
			 System.out.println(animal_name);
			 if(animal_name.equals("Baby Cat"))
			 {
				 animal.click();
				 break;
			 }
		 }

	}

}
