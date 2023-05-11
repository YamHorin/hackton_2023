package hackton2programs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class actions {
	
	public void setup()
	{
		
	}
	public static String search(WebDriver chrome)
	{
		WebElement searchbox = chrome.findElement(By.id("APjFqb"));
		searchbox.click();
		searchbox.sendKeys("the top trends on tiktok right now");
		WebElement SearchMade = chrome.findElement(By.xpath("/html/body"));
		SearchMade.click();
		SearchMade = chrome.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]"));
		SearchMade.click();
		WebElement path1 = chrome.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/div/a/h3/span"));
		path1.click();
		String allText = chrome.findElement(By.tagName("body")).getText();
		return allText;
		
		
	}
}
