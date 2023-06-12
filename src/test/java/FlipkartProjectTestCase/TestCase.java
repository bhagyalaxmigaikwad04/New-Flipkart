package FlipkartProjectTestCase;
	import java.net.MalformedURLException;
	import org.openqa.selenium.WebDriver;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;

import Flipkart.Base.base;
import Flipkart.FlipkartProject.BrandPage;
import Flipkart.FlipkartProject.CancelPage;
import Flipkart.FlipkartProject.FilterPage;
import Flipkart.FlipkartProject.MobilePage;

	public class TestCase extends base {
		public BrandPage brandobj;
		public CancelPage cancelobj;
		public MobilePage mobileobj;
		public FilterPage filterobj;
		WebDriver driver;
		
		@Parameters({"Port"})
		@BeforeClass
		public void setup1(String Port) throws MalformedURLException
		{
			driver=setUp(Port);
			
			cancelobj = new CancelPage(driver);
			mobileobj = new MobilePage(driver);
			brandobj= new  BrandPage(driver);
			filterobj = new FilterPage(driver);
		}
		
		@Test
		public void scenarioDemo() throws InterruptedException
		{
			cancelobj.CancelAction();
			mobileobj.MobileNavigation();
			brandobj.clickBrand();
			filterobj.cancelBrand();
			
		}
	}

