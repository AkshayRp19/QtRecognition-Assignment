package Qualitest.qtrecog;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OthersTestCases extends Base{
	
	public static Logger log = LogManager.getLogger(Base.class.getName());
	
	
	public void mainLogin() throws IOException
	  {
		     driver=driverInitialise();
		     driver.get(prop1.getProperty("url"));
		     LoginPage l=new LoginPage(driver);
		     l.getUserName().sendKeys("madhu.sudhan@qualitestgroup.com");
		  	 l.getPassword().sendKeys("P@ssw0rd");
		  	 l.getClick().click();
	  }
	
	public void closeKudosTab() throws IOException, InterruptedException
	   {
	  	 
	  	 Thread.sleep(1000);
	  	 driver.close();
	   }
	
	@Test
	public void kudosFrom() throws IOException, InterruptedException
	{
		mainLogin();
		log.info("User has logged in");
		Others o=new Others(driver);
		o.getKudosFromMe().click();
		Thread.sleep(3000);
		boolean verifyKudosFromMe=o.getkudosFromScreen().isDisplayed();
		Assert.assertTrue(verifyKudosFromMe);
		log.info("Kudos from me has been displayed and verified");
	}
	@Test
	public void kudosTo() throws IOException, InterruptedException
	{
		mainLogin();
		log.info("User has logged in");
		Others o=new Others(driver);
		o.getKudosToMe().click();
		Thread.sleep(3000);
		boolean verifyKudosToMe=o.getKudosToScreen().isDisplayed();
		Assert.assertTrue(verifyKudosToMe);
		log.info("Kudos to me has been displayed and verified");
		
	}
	@Test
	public void recentActivity() throws IOException, InterruptedException
	{
		mainLogin();
		Others o=new Others(driver);
		o.getClickActivity().click();
		Thread.sleep(3000);
	   	boolean recentActivityVerify=o.getRecentActivity().isDisplayed();
	   	Assert.assertTrue(recentActivityVerify);
	   	log.info("Recent Activity has been displayed and verified");
	}
	@Test
	public void kudosSentToday() throws IOException, InterruptedException
	{
		mainLogin();
		Others o=new Others(driver);
		String[] recent=o.getKudosSentToday().getText().split(" ");
		Thread.sleep(1000);
		String recentCount=recent[0];
		int count=Integer.parseInt(recent[0]);
		log.info("Kudos sent has been obtained");
		System.out.println(count);
		SendKudos sk=new SendKudos(driver);
		sk.getClickKudos().click();
		sk.getEmailId().sendKeys("Ann M Pierce  (ann.pierce@qualitestgroup.com)");
		sk.getSeletPraise().click();
		sk.getComments().sendKeys("Hi");
		sk.getSendEmail().click();
	    sk.getCloseKudos().click();
	    driver.navigate().refresh();
	    o.getClickActivity();
	    Thread.sleep(4000);
	    String[] recent1=o.getKudosSentToday().getText().split(" ");
	    Thread.sleep(1000);
	    String updatedCount=recent1[0];
	    int countUpdated=Integer.parseInt(recent1[0]);
		log.info("Updated Kudos sent has been obtained");
	    if(count>countUpdated)
	    {
	    	Assert.assertTrue(false);
	    }
		
	}
	@Test
	public void selfKudos() throws IOException, InterruptedException
	{
		mainLogin();
		SendKudos sk=new SendKudos(driver);
		sk.getClickKudos().click();
		sk.getEmailId().sendKeys("Madhu Sudhan M  (madhu.sudhan@qualitestgroup.com)");
		sk.getSeletPraise().click();
		sk.getComments().sendKeys("Hi");
		sk.getSendEmail().click();
		Thread.sleep(4000);
		String error1=sk.getMTP().getText();
		log.error("'Mailer Error: SMTP connect() failed.' has been obtained while sending kudos to ourself");
		if(error1.contains("Mailer Error: SMTP connect() failed."))
		{
			Assert.assertTrue(false);
		}
		
	}
	
	
}
