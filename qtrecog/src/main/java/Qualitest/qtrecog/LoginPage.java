package Qualitest.qtrecog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	 By username=By.xpath("//input[@name='username']");
	 By password=By.xpath("//input[@type='password']");
	By clickLogin= By.xpath("//button[@type='submit']");
	By color1=By.xpath("//button[@type='submit']");
	By color2=By.xpath("//div[@class='myHeading']");
    By color3=By.xpath("//body");
	  
	  public LoginPage(WebDriver driver) {
		
		  this.driver=driver;
	}



	public WebElement getUserName()
	  {
		  return driver.findElement(username);
	  }
	

	public WebElement getPassword()
	  {
		  return driver.findElement(password);
	  }
	
	public WebElement getClick()
	  {
		  return driver.findElement(clickLogin);
	  }
	  public WebElement getColor1()
	  {
		  return driver.findElement(color1);
	  }
	  
	  public WebElement getColor2()
	  {
		  return driver.findElement(color2);
	  }
	  public WebElement getColor3()
	  {
		  return driver.findElement(color3);
	  }
	  public void getError()
	  {
			driver.switchTo().alert().accept();
		
	  }

}
