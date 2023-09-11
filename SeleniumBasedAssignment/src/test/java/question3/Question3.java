package question3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question3 {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Technodora (Pvt) Ltd\\Desktop\\Comprehensive Assignment\\chromedriver.exe");
		
		driver.get("https://www.automationanywhere.com/");
		
		WebElement productsMenu = driver.findElement(By.xpath("//*[@id=\"topNavbar\"]/div/div/div[2]/ul/li[1]/a"));
        Actions actions = new Actions(driver);
        actions.moveToElement(productsMenu).build().perform();

        driver.findElement(By.xpath("//a[@title=\"Process Discovery\"]")).click();
        

        // Verify the URL
        String expectedURL = "https://www.automationanywhere.com/products/process-discovery";
        String actualURL = driver.getCurrentUrl();

        if (actualURL.equals(expectedURL)) {
            System.out.println("URL verification passed. Navigated to the correct URL.");
        } 
        
        else {
            System.out.println("URL verification failed.");
        }
	}
}
