import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.util.List;
import java.util.Scanner;


public class Irctc {

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
        //System.out.print("Please enter your id:");
        this.id="sumit223345";

        //password
        //System.out.print("please enter your password:");
        this.password="Sumit223345";

        //source Station
        //System.out.print("Enter source Station Name:");
        this.sourceStation="new delhi";

        //destination Station
        //System.out.print("Enter destination Station Name:");
        this.destinationStation="patna";

        //ticket Type
        //System.out.print("Enter Ticket Type:");
        this.ticketType="general";

        //date
        //System.out.print("Enter Traveling Date:");
        this.date="15/11/2024";

        //class Type
        //System.out.print("Enter Class Type:");
        this.classType="3A";

        //passanger Name
        //System.out.print("Enter Passanger Name:");
        this.passangerName="Sumit";

        //passanger Age
        //System.out.print("Enter Passanger Age:");
        this.passangerAge="24";

        //System.out.print("\uD83D\uDE4F\uD83C\uDFFB Thanks for giving Your Id and Password, please wait!⏳");
    }
    //Login
    public void login(WebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("//body/app-root/app-home/div/app-header/div[2]/div[2]/div/a[1]")).click();// Clicking on login Button
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[placeholder='User Name']")).sendKeys(this.id); //passing id
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys(this.password);//passing password
        Thread.sleep(20000); //20sec pause to inter captcha
        driver.findElement(By.xpath("//button[normalize-space()='SIGN IN']")).click();
    }

    //sourceStation filling
    public WebElement sourceStation(WebDriver driver) throws InterruptedException {
        WebElement element=null;
        driver.findElement(By.cssSelector("input[class*='ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys(this.sourceStation);
        Thread.sleep(5000);
        List<WebElement> options=driver.findElements(By.cssSelector("li[class*='ng-star-inserted']"));
        for(WebElement option:options){
            if((option.getText()).toUpperCase().contains((this.sourceStation).toUpperCase())) {
                element=option;
                break;
            }
        }
        return element;
    }

    //destinationStation filling
    public WebElement destinationStation(WebDriver driver) throws InterruptedException {
        WebElement element=null;
        driver.findElement(By.cssSelector("input[class='ng-tns-c57-9 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys(this.destinationStation);
        Thread.sleep(5000);
        List<WebElement> options=driver.findElements(By.cssSelector("li[class*='ng-star-inserted']"));
        for(WebElement option:options){
            if((option.getText()).toLowerCase().contains((this.destinationStation).toLowerCase())){
                element=option;
                break;
            }
        }
        return element;
    }

    //TicketType
    public WebElement ticketType(WebDriver driver) throws InterruptedException {
        WebElement element=null;
        driver.findElement(By.cssSelector("div[class='ng-tns-c65-12 ui-dropdown ui-widget ui-state-default ui-corner-all']")).click();
        Thread.sleep(5000);
        List<WebElement> options=driver.findElements(By.cssSelector("li[role='option']"));
        for(WebElement option:options){
            if ((option.getText()).toUpperCase().contains((this.ticketType).toUpperCase())) {
                element=option;
                break;
            }
        }
        return element;
    }

    //classType
    public WebElement classType(WebDriver driver) throws InterruptedException {
        WebElement element=null;
        driver.findElement(By.cssSelector("div[class='ng-tns-c65-11 ui-dropdown ui-widget ui-state-default ui-corner-all']")).click();
        Thread.sleep(5000);
        List<WebElement> options=driver.findElements(By.cssSelector("li[role='option']"));
        for(WebElement option:options){
            if((option.getText()).toUpperCase().contains((this.classType).toUpperCase())){
                element=option;
                break;
            }
        }
        return element;
    }

    //filling Booking Details
    public void trainSearch(WebDriver driver){

    }
}
