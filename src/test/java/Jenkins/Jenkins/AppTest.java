package Jenkins.Jenkins;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class AppTest 
{
        @Test
	    public void Testing()
	    {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\idea\\Jenkins\\Jenkins\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Facebook");
		System.out.println("Done");
	    }
}
