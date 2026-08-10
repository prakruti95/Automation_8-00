package AppEx2.Example;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class MyApp 
{
	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		cap.setCapability("appPackage","com.facebook.lite");
		cap.setCapability("appActivity","com.facebook.lite.MainActivity");
		AndroidDriver<MobileElement>driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub/"),cap);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Create new account\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Create new account\"]")).click();
		
	}
}
