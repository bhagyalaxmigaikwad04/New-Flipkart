package Flipkart.FlipkartProject;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class MobilePage {
	WebDriver driver;
		
		public MobilePage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//div[text()='Mobiles']")
		public WebElement mobile;
		
		public void MobileNavigation() throws InterruptedException
		{
			mobile.click();
		
		}

	}
