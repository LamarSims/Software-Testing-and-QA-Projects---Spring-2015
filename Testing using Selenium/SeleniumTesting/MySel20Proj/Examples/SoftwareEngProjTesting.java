import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SoftwareEngProjTesting {
	
	public static void main(String[] args){
		testChromeRegistration();
	}
	
	public void useCase_4_1_1_SystemNavigation(){
		
	}
    
    public static void testChromeRegistration(){
    	System.setProperty("webdriver.chrome.driver", "C:/Program Files/Apache Maven/apache-maven-3.3.1/web driver servers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        // Go to the Google Suggest home page
        driver.get("http://www.chadgolden.com/se/test/register");
        
        WebElement form = driver.findElement(By.className("form-horizontal"));
        List<WebElement> entries = form.findElements(By.className("form-control"));
        int i = 0;
        for (WebElement entry: entries){
        	switch(i){
        	case 0: entry.sendKeys("Grim Adventures");
        		break;
        	case 1: entry.sendKeys("words@email.com");
        		break;
        	case 2: entry.sendKeys("Biily");
        		break;
        	case 3: entry.sendKeys("Mandy");
        		break;
        	case 4: entry.sendKeys("CN");
        		break;
        	case 5: entry.sendKeys("CN");
        	}
        	System.out.println(entry.getAttribute("value"));
        	i++;
        }
        
        try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        driver.quit();
    }
}
