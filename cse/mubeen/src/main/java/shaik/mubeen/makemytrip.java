package shaik.mubeen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class makemytrip {

	public static void main(String[] args) throws InterruptedException {
		//System.setProgerty("webdriver.chrome.driver","chromedriver-win64/.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
	    Thread.sleep(4000);
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    driver.manage().window().minimize();
	    Thread.sleep(6000);
        driver.close();
        driver.getCurrentUrl();
	}

}
