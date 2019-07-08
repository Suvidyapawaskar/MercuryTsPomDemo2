package mt.mstr.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import mt.mstr.config.Config;

public class LaunchApp
{
	public void openBrowser(String browser)
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Setup\\setup1\\4052019\\chromedriver_win32 (22)\\chromedriver.exe");
		Config.driver=new ChromeDriver();
		System.out.println("Chrome browser is opened successfully");
		
	}
	
    public void enterApplicationURL(String url)
    {
    	Config.driver.get(url);
    	System.out.println("Application url is entered successfully");
    }
    
    public void maximizeBrowser()
    {
    	Config.driver.manage().window().maximize();
    	System.out.println("Maximized browser");
    }
    
    public void waittillLoginpageLoaded(int timeoutseconds)
    {
    	Config.driver.manage().timeouts().pageLoadTimeout(timeoutseconds, TimeUnit.SECONDS);
    	System.out.println("Wait till loginpage loaded");
    }
    
    public static void main(String[] args) 
    {
    	LaunchApp lc =new LaunchApp();
    	lc.openBrowser("chrome");
    	lc.enterApplicationURL("http://newtours.demoaut.com/mercurywelcome.php");
    	lc.maximizeBrowser();
    	lc.waittillLoginpageLoaded(15);
	}
    
    
}
