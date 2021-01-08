package Jan8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLogin {
	public static void main(String[] args) throws Throwable   {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohan\\git\\EclipseREpository\\SeleniumGitHub\\Browsers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
        //driver.switchTo().frame("Login");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("8790315553");
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("Google123");
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
        Thread.sleep(3000);
	
        
        driver.close();
        driver.quit();
	}

}
