package hackton2programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdrive.chrome.drive","C:\\selenium\\chromedrive\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.google.com/");
		actions actions = new actions();
		String txt = actions.search(driver);
		File f = new File("data_trends_tiktok.txt");
		try {
			PrintWriter pw = new PrintWriter (f);
			pw.println(txt);
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
