package testing.github;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test1 {

	public static void main(String[] args) throws Exception {
		ChromeOptions co=new ChromeOptions (); 
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("maheesh711@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("M@heesh9");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		driver.close();
		Thread.sleep(5000);

	}
}
