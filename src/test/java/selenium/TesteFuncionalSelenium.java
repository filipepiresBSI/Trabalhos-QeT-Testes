package selenium;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;


public class TesteFuncionalSelenium {
	
	protected WebDriver driver;
	
	@BeforeClass
	public static void configurarSelenuim() {
		
	System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chocolatey\\lib\\chromedriver\\tools\\chromedriver.exe");
		
	}

	@Before
	public void criarDriver() {
		
		driver = new ChromeDriver();
		driver.get("https://localhost:5000");
			
	}
	
	@Test
	public void clicarLinkHome() {
		
		ChromeDriver driver = new ChromeDriver();
		String pagina = "https://localhost:5000";
		driver.get(pagina);
		WebElement link = driver.findElement(By.linkText("FullTeaching"));
		link.click();
		assertEquals(By.linkText("FullTeaching"), "FullTeaching");
	}

}