package FlipkartProjectTestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class selenium {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonu\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://www.calculator.net/calorie-calculator.html");
driver.findElement(By.linkText("US Units"));
driver.findElement(By.name("cage")).clear();
driver.findElement(By.name("cage")).sendKeys("23");
driver.findElement(By.name("cheightfeet")).clear();
driver.findElement(By.name("cheightfeet")).sendKeys("5");
driver.findElement(By.name("cheightinch")).clear();
driver.findElement(By.name("cheightinch")).sendKeys("3");



//driver.findElement(By.linkText("BMI")).click();
//driver.findElement(By.partialLinkText("Conception")).click();

	}

}
