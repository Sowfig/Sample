package org.sample;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class revised {
	


public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell Latitude\\eclipse-workspace\\Broken\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	List<WebElement> li = driver.findElements(By.tagName("a"));
	int brokencount = 0;
	for (int i = 0; i <li.size() ; i++) {
		WebElement element = li.get(i);
		String text = element.getAttribute("href");
		System.out.println(text);
		URL url = new URL(text);
		URLConnection openConnection = url.openConnection();
		
		HttpURLConnection urlconnection=(HttpURLConnection)openConnection;
		int responseCode = urlconnection.getResponseCode();
		if (responseCode!=200) {
			System.out.println(text);
			brokencount++;
	}
	

		
	}
	
	
	
	
	
	
	
}
}
