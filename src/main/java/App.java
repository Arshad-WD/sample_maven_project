import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {

	public static void main(String args[])
	{
	
		// Instantiate a ChromeDriver class.
		WebDriver driver = new ChromeDriver();

	

		driver.get("https://www.youtube.com/");
		
		driver.findElement(By.id("search")).clear();
		
		driver.findElement(By.id("search")).sendKeys("Dark Jenix");
		
	}
}
