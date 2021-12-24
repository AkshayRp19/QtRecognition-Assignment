package Qualitest.qtrecog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObj {
	
	public WebDriver driver;
	By nameVerify=By.xpath("//div[1]/div[1]/div[1]/div[1]/h5[@class='header-font-size']");
	By imageVerify=By.xpath("//img[@src='img\\\\avatar.svg']");
	
	public HomePageObj(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		
	}

	public WebElement getName()
	{
		return driver.findElement(nameVerify);
	}
	
	public WebElement getImage()
	{
		return driver.findElement(imageVerify);
	}
	


}
