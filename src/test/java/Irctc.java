import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.classfile.attribute.SyntheticAttribute;
import java.util.List;
import java.util.Scanner;


public class Irctc {
    public static void main(String[] arg) throws InterruptedException {
        Irctc ticket=new Irctc();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();//maximize the window after opening it.
        String url= "https://www.irctc.co.in/nget/train-search";
        driver.get(url); //hit the url
        ticket.login(driver);


        /*
        driver.manage().window().maximize();//maximize the window after opening it.
        driver.get("https://www.irctc.co.in/nget/train-search"); //hit the url of the webpage.
        //Thread.sleep(5000);
        //String title = driver.getTitle();
        //Assert.assertEquals(title,"IRCTC Next Generation eTicketing System");

        driver.findElement(By.xpath("//body/app-root/app-home/div/app-header/div[2]/div[2]/div/a[1]")).click();// Clicking on login Button
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[placeholder='User Name']")).sendKeys("sumit223345");//passing id
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("Sumit223345");//passing password
        Thread.sleep(20000); //20sec pause to inter captcha
        driver.findElement(By.xpath("//button[normalize-space()='SIGN IN']")).click();
        Thread.sleep(5000);
        */

        System.out.println("All test case passed");
    }

    private String id=null;
    private String password=null;

    String sourceStation=null;
    String destinationStation=null;
    String ticketType=null;
    String date=null;
    String classType=null;

    String passangerName=null;
    String passangerAge=null;


    Irctc(){
        System.out.println("Welcome to automated tatkal booking app \uD83D\uDE4F\uD83C\uDFFB");
        Scanner scn=new Scanner(System.in);
        //id
        System.out.print("Please enter your id:");
        this.id=scn.next();

        //password
        System.out.print("please enter your password:");
        this.password=scn.next();

        //source Station
        System.out.print("Enter source Station Name:");
        this.sourceStation=scn.next();

        //destination Station
        System.out.print("Enter destination Station Name:");
        this.destinationStation=scn.next();

        //ticket Type
        System.out.print("Enter Ticket Type:");
        this.ticketType=scn.next();

        //date
        System.out.print("Enter Traveling Date:");
        this.date=scn.next();

        //class Type
        System.out.print("Enter Class Type:");
        this.classType=scn.next();

        //passanger Name
        System.out.print("Enter Passanger Name:");
        this.passangerName=scn.next();

        //passanger Age
        System.out.print("Enter Passanger Age:");
        this.passangerAge=scn.next();

        System.out.print("\uD83D\uDE4F\uD83C\uDFFB Thanks for giving Your Id and Password, please wait!⏳");
    }

    public void login(WebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("//body/app-root/app-home/div/app-header/div[2]/div[2]/div/a[1]")).click();// Clicking on login Button
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[placeholder='User Name']")).sendKeys(this.id); //passing id
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys(this.password);//passing password
        Thread.sleep(30000); //30sec pause to inter captcha
        driver.findElement(By.xpath("//button[normalize-space()='SIGN IN']")).click();
    }

    public void trainSearch(WebDriver driver){
        List<WebElement> options=driver.findElements(By.xpath("//input[@class='ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']"))
    }


}
