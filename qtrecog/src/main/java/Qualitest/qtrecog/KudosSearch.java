package Qualitest.qtrecog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KudosSearch {
	
	public WebDriver driver;
	
	By searchKudos=By.xpath("//a[@onclick='searchKudosByUser()']");
	By searchSentKudos= By.id("s_e_add");
	By clickSentKudos=By.xpath("//*[@id=\"search_panel\"]/button");
	By kudosHistory =By.xpath("//div[@id='shoutout_to_me']");
	 public KudosSearch(WebDriver driver) 
	 {			
		  this.driver=driver;
	 }
	 
	 public WebElement getSearchKudos()
	 {
		 return driver.findElement(searchKudos);
	 }
	 public WebElement getSentKudos ()
	 {
		 return driver.findElement(searchSentKudos);
	 }
	 public WebElement getClickSentKudos ()
	 {
		 return driver.findElement(clickSentKudos);
	 }
	 public WebElement getKudosHistory ()
	 {
		 return driver.findElement(kudosHistory);
	 }

}
