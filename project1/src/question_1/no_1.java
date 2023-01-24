package question_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class no_1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Y410P\\Desktop\\selenium-server-4.7.2\\chromedriver\\chromedriver.exe");
		WebDriver D= new ChromeDriver();
		D.manage().window().maximize();
		D.get("https://www.google.com/");

	}

}
