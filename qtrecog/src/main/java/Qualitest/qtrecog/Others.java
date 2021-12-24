package Qualitest.qtrecog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Others {
	
	public WebDriver driver;
	
	By kudosFromMe=By.xpath("//a/span[.='Kudos from me']");
	By kudosFromScreen=By.id("shoutout_to_me");
	By kudosToMe=By.xpath("//a/span[.='Kudos to me']");
	By kudosToScreen=By.xpath("//div/h5[@class='header-font-size']");
	By activity=By.xpath("//a/span[@style='margin-left: 50px']");
	By recentActivity=By.id("shoutout_to_me");
	By kudosSentToday=By.id("todayCount");
	
	
	public Others(WebDriver driver) 
	 {			
		  this.driver=driver;
	 }
	 public WebElement getKudosFromMe()
	    {
	    	 return driver.findElement(kudosFromMe);
	    } 
	 public WebElement getkudosFromScreen()
	    {
	    	 return driver.findElement(kudosFromScreen);
	    }
	 public WebElement getKudosToMe()
	    {
	    	 return driver.findElement(kudosToMe);
	    } 
	 public WebElement getKudosToScreen()
	    {
	    	 return driver.findElement(kudosToScreen);
	    } 
	 public WebElement getClickActivity()
	    {
	    	 return driver.findElement(activity);
	    } 
	 public WebElement getRecentActivity()
	    {
	    	 return driver.findElement(recentActivity);
	    } 
	 public WebElement getKudosSentToday()
	    {
	    	 return driver.findElement(kudosSentToday);
	    } 
	 
}
