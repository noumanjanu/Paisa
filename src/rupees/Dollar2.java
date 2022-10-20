package rupees;

import org.openqa.selenium.By;

public class Dollar2 extends Dollar{
	
public static void addemp() {
	driver.switchTo().frame("rightMenu");
	driver.findElement(By.xpath("//input[@value='Add']")).click();
	driver.findElement(By.name("txtEmpLastName")).sendKeys("Khan");
	driver.findElement(By.name("txtEmpFirstName")).sendKeys("Salman");
	driver.findElement(By.name("txtEmpNickName")).sendKeys("Sallu");
	driver.findElement(By.id("btnEdit")).click();
	System.out.println("Employ Added");
	
	driver.switchTo().defaultContent();
}

public static void logout() {
	driver.findElement(By.linkText("Logout")).click();
	driver.close();
	System.out.println("Logout Completed");
}
}
