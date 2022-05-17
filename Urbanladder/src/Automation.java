import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Automation {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","D:\\COMPRIHENSIVE\\Q1\\SQ5\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.urbanladder.com/");
		
		
		
		
		// 1) LOGIN 
		
		Actions a = new Actions(driver);
		
		
		a.moveToElement(driver.findElement(By.xpath("//span[@class='header-icon-link user-profile-icon']"))).build().perform();
		
		a.moveToElement(driver.findElement(By.xpath("//a[@class='login-link authentication_popup']"))).click().build().perform();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@name='spree_user[email]'])[2]")).sendKeys("pundsahil09@gmail.com");
		
		driver.findElement(By.xpath("(//input[@name='spree_user[password]'])[3]")).sendKeys("Sahilpund100@");
		
		a.moveToElement(driver.findElement(By.xpath("(//input[@name='commit'])[3]"))).click().build().perform();	
	
		
		
	//	2) search product
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("chair");
		
		a.moveToElement(driver.findElement(By.xpath("//span[@class='search-icon icofont-search']"))).click().build().perform();
		
		// driver.findElement(By.xpath("(//img[@class='lazy product-img-default'])[1]")).click();
		
		
		Thread.sleep(3000);
		driver.get("https://www.urbanladder.com/");
		
	//	3) Track Orders
		
		a.moveToElement(driver.findElement(By.xpath("//a[@title='Track Order']"))).click().build().perform();

	// 4) logout
		
		driver.get("https://www.urbanladder.com/");
		
		a.moveToElement(driver.findElement(By.xpath("//span[@class='header-icon-link user-profile-icon']"))).build().perform();		
		a.moveToElement(driver.findElement(By.xpath("//a[@id='logout']"))).click().build().perform();
		
		
		
	}

}
