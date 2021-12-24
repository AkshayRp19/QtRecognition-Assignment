package Qualitest.qtrecog;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
 WebDriver driver;
 public Properties prop1;
	public WebDriver driverInitialise() throws IOException
	{   
		 prop1=new Properties();
		FileInputStream file= new FileInputStream("D:\\Framework Selenium\\qtrecog\\src\\main\\java\\Qualitest\\qtrecog\\data.properties");
		prop1.load(file);
		String browserName=prop1.getProperty("browser");
		
	    if(browserName.equals("chrome"))
	    {
	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aksha\\Downloads\\chromedriver_win32\\chromedriver.exe" );
			driver= new ChromeDriver();
	    }
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    return driver;
	}
	

}
