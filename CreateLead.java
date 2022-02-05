package week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass
{
	
	@Test
	public void createLead() {
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Wipro");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shankari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("LakshmiNarayanan");
		driver.findElement(By.name("submitButton")).click();
		
}
}

