package question4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question4 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Technodora (Pvt) Ltd\\Desktop\\Comprehensive Assignment\\chromedriver.exe");
		
		driver.get("https://www.automationanywhere.com");
		
		//click on Request Demo button
		driver.findElement(By.xpath("//a[@class=\"coh-link utility-nav-link coh-style-solid-orange-button\"]")).click();
		
		//verification
		String expectedURL = "https://www.automationanywhere.com/request-live-demo";
        String actualURL = driver.getCurrentUrl();
        
        if (actualURL.equals(expectedURL)){
            System.out.println("Page is navigating to correct URL.");
        } 
        
        else{
            System.out.println("Page is not navigate to correct URL.");
        }
        
        //Verify the label names
        WebElement firstName = driver.findElement(By.xpath("//label[@id=\"LblFirstName\"]"));
        WebElement lastName = driver.findElement(By.xpath("//label[@id=\"LblLastName\"]"));

        String expectedFirstNameLabel = "First Name";
        String expectedLastNameLabel = "Last Name";
        
        if (firstName.getText().equals(expectedFirstNameLabel) &&
                lastName.getText().equals(expectedLastNameLabel)) {
                System.out.println("Label names for First Name and Last Name are as expected.");
            } else {
                System.out.println("Label names for First Name and Last Name are not as expected.");
            }
        
		
	}

}
