package Qualitest.qtrecog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SendKudos {
	public WebDriver driver;
	

	By clickKudos=By.xpath("//a[@class='nav-item nav-link']");
	By emailId=By.id("email_address");
	By comments=By.id("comment");
	By seletPraise=By.xpath("//p/i[.='\"Exceptional Work\"']");
	By sendMail=By.cssSelector(".btn-primary");
	By closeKudos=By.xpath("//button[@class='close']");
	By errorMTP=By.xpath("//center[normalize-space()='Mailer Error: SMTP connect() failed.']");
	
	 public SendKudos(WebDriver driver) {
			
		  this.driver=driver;
	}
	

	public WebElement getClickKudos()
    {
			  return driver.findElement(clickKudos);
     }
	

	public WebElement getEmailId()
    {
			  return driver.findElement(emailId);
     }
	public WebElement getSeletPraise()
    {
			  return driver.findElement(seletPraise);
     }
	public WebElement getComments()
    {
			  return driver.findElement(comments);
     }
	
	
	public WebElement getSendEmail()
    {
			  return driver.findElement(sendMail);
     }
	public WebElement getCloseKudos()
    {
    	 return driver.findElement(closeKudos);
    } 
	public WebElement getMTP()
    {
    	 return driver.findElement(errorMTP);
    } 
}
