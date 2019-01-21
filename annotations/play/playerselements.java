package play;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class playerselements {
	public static WebElement Settingbutton(WebDriver driver) {

		return driver.findElement(By.xpath("//div[@class='ytp-right-controls']/button[3]"));
	}
	public static WebElement subtitles(WebDriver driver) {

		return driver.findElement(By.xpath("//*[@class='ytp-subtitles-button ytp-button']"));
	}
	
	
	public static WebElement subtitlescc(WebDriver driver) {
		return driver.findElement(By.xpath("//*[text()='Subtitles/CC']"));
		
	}
	
	public static WebElement Hindi(WebDriver driver) {
		return driver.findElement(By.xpath("//*[text()='Hindi']"));
		
	}
	
	public static WebElement Tmode(WebDriver driver) {
		return driver.findElement(By.cssSelector("button.ytp-size-button.ytp-button"));
		
	}
	public static WebElement ETmode(WebDriver driver) {
		return driver.findElement(By.cssSelector("button.ytp-size-button.ytp-button"));
		
	}
	public static WebElement Fullscreen(WebDriver driver) {
		return driver.findElement(By.cssSelector("button.ytp-fullscreen-button.ytp-button"));
		
	}
	public static WebElement soundon(WebDriver driver) {
		return driver.findElement(By.cssSelector("button.ytp-mute-button.ytp-button"));
		
	}
	public static WebElement soundoff(WebDriver driver) {
		return driver.findElement(By.cssSelector("button.ytp-mute-button.ytp-button"));
		
	}
	public static WebElement Playnext(WebDriver driver) {
		return driver.findElement(By.cssSelector("a.ytp-next-button.ytp-button"));
		
	}
	
	public static WebElement ExitTmode(WebDriver driver) {
		return driver.findElement(By.cssSelector("button.ytp-size-button.ytp-button"));
		
	}
	public static WebElement minip(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@aria-label='Miniplayer (i)']"));
		
	}
	public static WebElement Toggle(WebDriver driver) {
		return driver.findElement(By.xpath("(//*[@class='toggle-container style-scope paper-toggle-button'])[2]"));
		
	}
	
	
	
	
}
