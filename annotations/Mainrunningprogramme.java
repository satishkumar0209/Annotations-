package annotations;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mainrunningprogramme {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "/home/aj/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// Login into Gmail

		Logintogmail gmail = new Logintogmail();
		gmail.gmail(driver);

		
		
		// uploading a video

		Thread.sleep(1000);
		
		
		Channelcard ccard=new Channelcard();
		ccard.ccard(driver);
		
		windows win=new windows();
		win.Handle(driver);
		
		
//		pollcard card=new pollcard();
//		card.pcard(driver);
//		
//		windows win=new windows();
//		win.Handle(driver);
//		
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[text()='Love music']")).click();
//		
//		driver.findElement(By.xpath("(//*[@role='radio'])[1]")).click();
		
//		WebElement drag=driver.findElement(By.xpath("(//*[@class='timeline-row-body'])[1]"));
//		
//		WebElement drop =driver.findElement(By.xpath("//*[@id=’box101']"));
//
//
//	    Actions action = new Actions(driver);
//	    action.clickAndHold(drag).build().perform();
//	    //you need to release the control from the test
//	    action.moveToElement(drop).release();
//				


//		Linkcardnormaluser user=new Linkcardnormaluser();
//		user.linkcardnormaluser(driver);
		
		
//		Calltoaction cta = new Calltoaction();
//		cta.cta(driver);
//
//		windows win = new windows();
//		win.Handle(driver);
//		
//		Calltoactioninlivepage live=new Calltoactioninlivepage();
//		live.call(driver);
//		
//		paidcontent paid=new paidcontent();
//		paid.paid(driver);
//		
//		windows wins = new windows();
//		wins.Handle(driver);
		
		
		
		
		
		
		
		
	}

	private static Actions newActions(WebDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}

}
