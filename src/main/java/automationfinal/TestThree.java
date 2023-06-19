
package automationfinal;




import javax.swing.JCheckBox;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestThree {
	
	
	WebDriver driver;
	@Before
	public void init() throws Exception {
	
	
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://techfios.com/test/101/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	@Test
		public void toggleRemoveAllValidation1()  {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement Toggle_Check_Element;
		Toggle_Check_Element = driver.findElement(By.name("allbox"));
		Toggle_Check_Element.click();
		WebElement Toggle_CAR_MODEL_Element;
		Toggle_CAR_MODEL_Element = driver.findElement(By.name("todo[8]"));
		
		
	}
	
			public void removeToggle() {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			JCheckBox toggleAll = new JCheckBox("Toggle All");
			toggleAll.remove(toggleAll);
				
			}
		
	
	    @After
	     public void tearDown() {
			
			driver.close();
            driver.quit();
		}


}
