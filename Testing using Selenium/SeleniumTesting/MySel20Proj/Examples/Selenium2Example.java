import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium2Example  {
    public static void main(String[] args) {    	
    	//testIE();
    	//testChrome();
    	//testIESerebiiTextInput("http://www.serebii.net/index2.shtml", "Aggron");
    	testIESerebiiSelect();
    	/*try {
			testRE();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
    	//testMatrixCalc();
    	//testChromeRegistration();
    	//Thread t = new Thread();
    	/*Thread t1 = new Thread(new Runnable(){public void run(){
    		try {
    			testSerebiiQueryGridCH();
    		} catch (MalformedURLException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    	}});*/
    	
    	/*Thread t2 = new Thread(new Runnable(){public void run(){
    		try {
    			testMatrixCalcGridFF();
    		} catch (MalformedURLException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    			
    		}
    	}});*/
    	
    	/*Thread t3 = new Thread(new Runnable(){public void run(){
    		try {
    			testFilmClubRegGridOP();
    		} catch (MalformedURLException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    			
    		}
    	}});*/
    	
    	/*Thread t4 = new Thread(new Runnable(){public void run(){
    		try {
    			testSerebiiSelectGridCH1();
    		} catch (MalformedURLException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    	}});*/
    	
    	/*Thread t5 = new Thread(new Runnable(){public void run(){
    		try {
    			testMatrixCalcGridIE();
    		} catch (MalformedURLException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    	}});
    	
    	t1.start();
    	t2.start();
    	t3.start();*/
    	//t4.start();
    	//t5.start();
    	/*try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	try {
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
    	/*try {
			t4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
    	/*try {
			t5.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
    	
    	
    	//testChromeRegistration();
    }
    
    public static void testIE(){
    	File file = new File("C:/Program Files/Apache Maven/apache-maven-3.3.1/web driver servers/IEDriverServer.exe");
    	System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
        WebDriver driver = new InternetExplorerDriver();

        // And now use this to visit Google
        driver.get("http://www.google.com");

        // Find the text input element by its name
        WebElement element = driver.findElement(By.name("q"));

        // Enter something to search for
        element.sendKeys("Cheese!");

        // Now submit the form. WebDriver will find the form for us from the element
        element.submit();

        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());
        
        try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        // Should see: "cheese! - Google Search"
        System.out.println("Page title is: " + driver.getTitle());
        
        //Close the browser
        driver.quit();
    }
    
    public static void testChrome(){
    	System.setProperty("webdriver.chrome.driver", "C:/Program Files/Apache Maven/apache-maven-3.3.1/web driver servers/chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	//driver.get("http://www.google.com/xhtml");

        // And now use this to visit Google
        driver.get("http://www.google.com");

        // Find the text input element by its name
        WebElement element = driver.findElement(By.name("q"));

        // Enter something to search for
        element.sendKeys("Cheese!");

        // Now submit the form. WebDriver will find the form for us from the element
        element.submit();

        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());
        
        try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        // Should see: "cheese! - Google Search"
        System.out.println("Page title is: " + driver.getTitle());
        
        //Close the browser
        driver.quit();
    }
    
    public static void testIESerebiiTextInput(String website, String pokemon){
    	File file = new File("C:/Program Files/Apache Maven/apache-maven-3.3.1/web driver servers/IEDriverServer.exe");
    	System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
        WebDriver driver = new InternetExplorerDriver();

        driver.get(website);

        // Find the text input element by its name
        WebElement element = driver.findElement(By.name("q"));

        // Enter something to search for
        element.sendKeys(pokemon);

        // Now submit the form. WebDriver will find the form for us from the element
        element.submit();

        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());
        
        try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        // Should see: "serebii - Google Search"
        System.out.println("Page title is: " + driver.getTitle());
        
        //Close the browser
        driver.quit();
    }
    
    public static void testIESerebiiSelect(){
    	File file = new File("C:/Program Files/Apache Maven/apache-maven-3.3.1/web driver servers/IEDriverServer.exe");
    	System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
        WebDriver driver = new InternetExplorerDriver();

        driver.get("http://www.serebii.net/pokedex-xy/");

        //Get the first select element on the page and then, deselect all options first, and then select the specified option
        WebElement select = driver.findElement(By.tagName("select"));
        int optionsize = select.findElements(By.tagName("option")).size();
        System.out.println(optionsize);
        for (int i = 0; i < optionsize; i++){
        	boolean ex = false;
        	try{
        		select.findElements(By.tagName("option")).get(i).click(); System.out.println(-1);
        	}catch(org.openqa.selenium.StaleElementReferenceException e){
        		select = driver.findElement(By.tagName("select")); System.out.println(-2);
        		ex = true;
        	}
        	if (ex) {
        		select.findElements(By.tagName("option")).get(i).click();
        		System.out.println(-3);
        	}
        	
        	try {
				Thread.sleep(10000); System.out.println(-4);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	System.out.println(i);
        }

        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());
        
        // Google's search is rendered dynamically with JavaScript.
        // Wait for the page to load, timeout after 10 seconds
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("serebii");
            }
        });

        System.out.println("Page title is: " + driver.getTitle());
        
        //Close the browser
        driver.quit();
    }
    
    public static void testRE() throws MalformedURLException{
    	File file = new File("C:/Program Files/Apache Maven/apache-maven-3.3.1/web driver servers/IEDriverServer.exe");
    	System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
    	DesiredCapabilities capability = new DesiredCapabilities();
    	capability.setBrowserName("internetexplorer");
    	
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
        
        driver.get("http://www.serebii.net/index2.shtml");

        // Find the text input element by its name
        WebElement element = driver.findElement(By.name("q"));

        // Enter something to search for
        element.sendKeys("Aggron");

        // Now submit the form. WebDriver will find the form for us from the element
        element.submit();

        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());
        
        try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        System.out.println("Page title is: " + driver.getTitle());
        
        //Close the browser
        driver.quit();
    }
    
    public static void testMatrixCalc(){
    	System.setProperty("webdriver.chrome.driver", "C:/Program Files/Apache Maven/apache-maven-3.3.1/web driver servers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        // Go to the Google Suggest home page
        driver.get("http://matrixcalc.org/en/slu.html");
        
        WebElement matrix = driver.findElement(By.className("matrix"));
        List<WebElement> entries = matrix.findElements(By.tagName("input"));
        int i = 0;
        for (WebElement entry: entries){
        	entry.sendKeys("" + i++ + "");
        }
        
       // WebElement operations = driver.findElement(By.className("bbo xslu-buttons"));
        List<WebElement> ops = driver.findElements(By.className("expression"));
        for (WebElement op: ops){
        	op.click();;
        }
        
        try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        driver.quit();
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
    
    public static void testSerebiiQueryGridCH() throws MalformedURLException{
    	DesiredCapabilities capability = new DesiredCapabilities();
    	capability.setBrowserName("chrome");
    	
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
        
        // And now use this to visit Google
        driver.get("http://www.serebii.net/index2.shtml");

        // Find the text input element by its name
        WebElement element = driver.findElement(By.name("q"));

        // Enter something to search for
        element.sendKeys("Aggron");

        // Now submit the form. WebDriver will find the form for us from the element
        element.submit();

        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());
        
        // Google's search is rendered dynamically with JavaScript.
        // Wait for the page to load, timeout after 10 seconds
        try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        // Should see: "serebii - Google Search"
        System.out.println("Page title is: " + driver.getTitle());
        
        //Close the browser
        driver.quit();
    }
    
    public static void testSerebiiSelectGridCH1() throws MalformedURLException{
    	DesiredCapabilities capability = new DesiredCapabilities();
    	capability.setBrowserName("chrome");
    	
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);

        // And now use this to visit Google
        driver.get("http://www.serebii.net/pokedex-xy/");

        //Get the first select element on the page and then, deselect all options first, and then select the specified option
        WebElement select = driver.findElement(By.tagName("select"));
        int optionsize = select.findElements(By.tagName("option")).size();
        System.out.println(optionsize);
        for (int i = 0; i < optionsize; i++){
        	boolean ex = false;
        	try{
        		select.findElements(By.tagName("option")).get(i).click();
        	}catch(org.openqa.selenium.StaleElementReferenceException e){
        		select = driver.findElement(By.tagName("select"));
        		ex = true;
        	}
        	if (ex) {
        		select.findElements(By.tagName("option")).get(i).click();
        	}
        	
        	try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	//System.out.println(i);
        }

        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());
        
        // Google's search is rendered dynamically with JavaScript.
        // Wait for the page to load, timeout after 10 seconds
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("serebii");
            }
        });

        // Should see: "Serebii - Google Search"
        System.out.println("Page title is: " + driver.getTitle());
        
        //Close the browser
        driver.quit();
    	
    }
    
    public static void testMatrixCalcGridFF() throws MalformedURLException{
    	DesiredCapabilities capability = new DesiredCapabilities();
    	capability.setBrowserName("firefox");
    	
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
        
        driver.get("http://matrixcalc.org/en/slu.html");
        
        WebElement matrix = driver.findElement(By.className("matrix"));
        List<WebElement> entries = matrix.findElements(By.tagName("input"));
        int i = 0;
        for (WebElement entry: entries){
        	entry.sendKeys("" + i++ + "");
        }
        
       // WebElement operations = driver.findElement(By.className("bbo xslu-buttons"));
        List<WebElement> ops = driver.findElements(By.className("expression"));
        for (WebElement op: ops){
        	op.click();;
        }
        
        try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        driver.quit();
    }
    
    public static void testMatrixCalcGridIE() throws MalformedURLException{
    	DesiredCapabilities capability = new DesiredCapabilities();
    	capability.setBrowserName("internetexplorer");
    	
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
        
        driver.get("http://matrixcalc.org/en/slu.html");
        
        WebElement matrix = driver.findElement(By.className("matrix"));
        List<WebElement> entries = matrix.findElements(By.tagName("input"));
        int i = 0;
        for (WebElement entry: entries){
        	entry.sendKeys("" + i++ + "");
        }
        
       // WebElement operations = driver.findElement(By.className("bbo xslu-buttons"));
        List<WebElement> ops = driver.findElements(By.className("expression"));
        for (WebElement op: ops){
        	op.click();;
        }
        
        try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        driver.quit();
    }
    
    public static void testFilmClubRegGridOP() throws MalformedURLException{
    	DesiredCapabilities capability = new DesiredCapabilities();
    	capability.setBrowserName("opera");
    	
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
        
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