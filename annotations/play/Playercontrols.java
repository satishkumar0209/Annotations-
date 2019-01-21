package play;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Playercontrols {

	public static void main(String[] args) throws InterruptedException {
		String url = "";
		String purl = "https://www.youtube.com/watch?v=";
		System.setProperty("webdriver.chrome.driver", "/home/aj/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, 60);
		driver.get(purl + "LOZNKZfiFUw");

		Thread.sleep(3000);

		Actions a = new Actions(driver);

		WebElement cc = playerselements.subtitles(driver);
		Helpher.highLightElement(driver, cc);
		a.moveToElement(cc).click().build().perform();
		System.out.println("Closed captions is visiable");
		Thread.sleep(3000);
		
		WebElement Setting = playerselements.Settingbutton(driver);
		Helpher.highLightElement(driver, Setting);
		a.moveToElement(Setting).click().build().perform();
		System.out.println("Setting icon is visiable");
		Thread.sleep(3000);
		
		WebElement Mode = playerselements.Tmode(driver);
		Helpher.highLightElement(driver, Mode);
		a.moveToElement(Mode).click().build().perform();
		System.out.println("Tmode icon is visiable");
		
		Thread.sleep(3000);
		
		WebElement Fmode = playerselements.Fullscreen(driver);
		Helpher.highLightElement(driver, Fmode);
		a.moveToElement(Fmode).click().build().perform();
		System.out.println("Fullscreen icon is visiable");

Thread.sleep(3000);
		
		WebElement Exitmode = playerselements.ETmode(driver);
		Helpher.highLightElement(driver, Exitmode);
		a.moveToElement(Exitmode).click().build().perform();
		System.out.println("Exitfull screen icon is visiable");

		
		
Thread.sleep(3000);
		
		WebElement vol = playerselements.soundon(driver);
		Helpher.highLightElement(driver, vol);
		a.moveToElement( vol).click().build().perform();
		System.out.println("volume  icon is visiable");

		
		
Thread.sleep(3000);
		
		WebElement voloff = playerselements.soundoff(driver);
		Helpher.highLightElement(driver, voloff);
		a.moveToElement(voloff).click().build().perform();
		System.out.println("Volume off icon is visiable");

Thread.sleep(3000);
		
		WebElement next = playerselements.Playnext(driver);
		Helpher.highLightElement(driver, next);
		a.moveToElement(next).click().build().perform();
		System.out.println("Next button icon is visiable");

Thread.sleep(3000);
		
		WebElement ExitTmode = playerselements.ExitTmode(driver);
		Helpher.highLightElement(driver, ExitTmode);
		a.moveToElement(ExitTmode).click().build().perform();
		System.out.println("Exitthreater mode icon is visiable");

Thread.sleep(3000);
		
		WebElement miniplayer = playerselements.minip(driver);
		Helpher.highLightElement(driver, miniplayer);
		a.moveToElement(miniplayer).click().build().perform();
		System.out.println("MIniplayer icon is visiable");

		
		
	}

}
