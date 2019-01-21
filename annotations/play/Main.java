package play;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {
	public static void main(String[] args) throws InterruptedException, IOException {
		String url = "";
		String purl = "https://www.youtube.com/watch?v=QRS8MkLhQmM";
		System.setProperty("webdriver.chrome.driver", "/home/aj/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, 60);
		driver.get(purl);

		Thread.sleep(3000);
		Actions a = new Actions(driver);

		WebElement cc = playerselements.subtitles(driver);
		Helpher.highLightElement(driver, cc);
		a.moveToElement(cc).click().build().perform();
		System.out.println("Closed captions is visiable");

		WebElement Setting = playerselements.Settingbutton(driver);
		Helpher.highLightElement(driver, Setting);
		a.moveToElement(Setting).click().build().perform();
		System.out.println("Setting icon is visiable");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Subtitles/CC']")));

		WebElement CC = playerselements.subtitlescc(driver);
		Helpher.highLightElement(driver, CC);
		CC.click();

		System.out.println("Clicking on captions button");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Hindi']")));

		WebElement languageselection = playerselements.Hindi(driver);
		Helpher.highLightElement(driver, languageselection);
		languageselection.click();

		System.out.println("Selected hindi language");

		Thread.sleep(3000);

		WebElement ele = driver.findElement(By.className("ytp-progress-bar "));
		int width = ele.getSize().getWidth();
		a.moveToElement(ele).moveByOffset((width / 2) - 400, 0).click().perform();

		Thread.sleep(3000);

		a.moveToElement(ele).moveByOffset((width / -3) + 100, -1).click().perform();

		Thread.sleep(3000);
		driver.navigate().refresh();

		WebElement Setting1 = playerselements.Settingbutton(driver);
		Helpher.highLightElement(driver, Setting1);
		a.moveToElement(Setting1).click().build().perform();
		System.out.println("Setting icon is visiable");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Subtitles/CC']")));

		WebElement CC1 = playerselements.subtitlescc(driver);
		Helpher.highLightElement(driver, CC1);
		CC1.click();

		System.out.println("Clicking on captions button");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Options']")));
		driver.findElement(By.xpath("//*[text()='Options']")).click();

		// WebElement settingbutton=playerselements.Settingbutton(driver);

		// Helpher.highLightElement(driver, settingbutton);

		// a.moveToElement(settingbutton).click().build().perform();

	}
}
