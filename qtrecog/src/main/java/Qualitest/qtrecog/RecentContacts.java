package Qualitest.qtrecog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RecentContacts {
	public WebDriver driver;
	By recent=By.xpath("//*[@id=\"contact_list\"]/div[1]/div/h5/small/a/i");
	By emailId=By.id("email_address");
	By comments=By.id("comment");
	By seletPraise=By.xpath("//p/i[.='\"Exceptional Work\"']");
	By sendMail=By.cssSelector(".btn-primary");
	By errorMessage=By.xpath("//center[normalize-space()='Mailer Error: SMTP connect() failed.']");
	
	
	
 public RecentContacts(WebDriver driver)
    {
		
		this.driver=driver;
    }
   public WebElement getRecentContacts()
    {
    	 return driver.findElement(recent);
    } 
   public WebElement getRecentEmail()
   {
   	 return driver.findElement(emailId);
   } 
   public WebElement getRecentComment()
   {
   	 return driver.findElement(comments);
   } 
   public WebElement getRecentPraise()
   {
   	 return driver.findElement(seletPraise);
   	 
   } 
   public WebElement getRecentSendMail()
   {
   	 return driver.findElement(sendMail);
   } 
   public WebElement getRecentError()
   {
   	 return driver.findElement(errorMessage);
   } 
   
   
}
