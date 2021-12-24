package Qualitest.qtrecog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InvalidSendKudos {
	
	public WebDriver driver;
	
	
	By clickKudos=By.xpath("//a[@class='nav-item nav-link']");
	By emailId=By.id("email_address");
	By seletPraise=By.xpath("//p/i[.='\"Exceptional Work\"']");
	By comments=By.id("comment");
	By sendMail=By.cssSelector(".btn-primary");
	By textError=By.xpath("//*[@id=\"display_message\"]/span/center");
	
	public InvalidSendKudos (WebDriver driver) {
		
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
	public WebElement getError()
    {
			  return driver.findElement(textError);
     }
	
}
