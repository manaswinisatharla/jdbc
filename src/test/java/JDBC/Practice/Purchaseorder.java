package JDBC.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Purchaseorder {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
     driver.findElement(By.xpath("//a[text()='Purchase Order']")).click();
		driver.findElement(By.xpath("//a[text]()='Create a Purchase Order']")).click();
		
	}

}
