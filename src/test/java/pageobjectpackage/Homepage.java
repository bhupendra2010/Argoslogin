package pageobjectpackage;

import commonpackage.Driverfactory;
import org.openqa.selenium.By;

public class Homepage extends Driverfactory {

    public void baseurl(){
        driver.getCurrentUrl();
        driver.findElement(By.cssSelector("a[data-test='account']")).click();
    }
    public void detail(String Email,String password){
        driver.findElement(By.id("email-address")).sendKeys(Email);
        driver.findElement(By.id("current-password")).sendKeys(password);

    }
    public void login(){
        driver.findElement(By.className("button")).click();
    }
}
