import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Irctc {
    public static void main(String[] arg) throws InterruptedException {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.irctc.co.in/nget/train-search");
//        Thread.sleep(5000);
        String title = driver.getTitle();
        Assert.assertEquals(title,"IRCTC Next Generation eTicketing System");

        driver.findElement(By.xpath("//body/app-root/app-home/div/app-header/div[2]/div[2]/div/a[1]")).click();// Clicking on login Button
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[placeholder='User Name']")).sendKeys("sumit223345");//passing id
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("Sumit223345");//passing password
        Thread.sleep(20000); //20sec pause to inter captcha
        //driver.findElement(By.cssSelector("form.ng-pristine.ng-valid.ng-touched button[class='search_btn train_Search']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='SIGN IN']")).click();

        Thread.sleep(5000);
        driver.close();
        System.out.println("All test case passed");

    }
}
