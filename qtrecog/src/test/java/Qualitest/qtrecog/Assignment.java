package Qualitest.qtrecog; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aksha\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_search/6f03f4361b080eeb747193aadd94cd2b/static/attachments/reference_page.html");
        boolean si=driver.findElement(By.id("search-input")).isDisplayed();
        System.out.println(si);
        boolean sb=driver.findElement(By.id("search-button")).isDisplayed();
        System.out.println(sb);
        
      driver.findElement(By.id("search-button")).click();
      String error= driver.findElement(By.id("error-empty-query")).getText();
    if(error.contains("Provide some query"))
    {
    	System.out.println("Passed");
    }
      
	}

}
