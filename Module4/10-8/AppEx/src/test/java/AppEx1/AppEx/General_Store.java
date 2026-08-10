package AppEx1.AppEx;


import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

import java.net.MalformedURLException;
import java.net.URL;
public class General_Store 
{
	public static void main(String[] args) throws InterruptedException, MalformedURLException 
	{
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		
		cap.setCapability("appPackage","com.androidsample.generalstore");
		
		cap.setCapability("appActivity","com.androidsample.generalstore.SplashActivity");
		
		AndroidDriver<MobileElement>driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub/"),cap);

		
		Thread.sleep(3000);
		
		MainActivity a = new MainActivity();
		a.screen1();
		
	}
}
