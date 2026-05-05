import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class S1_BroswerEx 
{
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\Final_Chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://careercenter.tops-int.com/");
		driver.manage().window().maximize();
		try 
		{
			Thread.sleep(3000);
		} 
		catch (InterruptedException e)  
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.close();
		driver.quit();
		
	}
}
