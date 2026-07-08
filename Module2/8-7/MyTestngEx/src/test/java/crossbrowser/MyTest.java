package crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MyTest 
{
	
	@Parameters("browser")
	@Test
	public void test(String browser)
	{
		WebDriver driver=null;
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "G:\\Software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");		
			driver = new ChromeDriver();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			
		}
		else if(browser.equals("xyz"))
		{
			System.setProperty("webdriver.edge.driver","G:\\Software\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
			EdgeOptions options = new EdgeOptions();
		    options.addArguments("--remote-allow-origins=*");
		    driver = new EdgeDriver(options);

		     
		}
		
		driver.get("https://topsint.com/topserp/index.php");
		driver.manage().window().maximize();
		
	}
}
