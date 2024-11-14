import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TicketBooking {
    public static void main(String[] arg) throws InterruptedException {
        Irctc ticket=new Irctc();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();//maximize the window after opening it.
        String url= "https://www.irctc.co.in/nget/train-search";
        driver.get(url); //hit the url
        ticket.login(driver);
        ticket.sourceStation(driver).click();
        ticket.destinationStation(driver).click();
        ticket.ticketType(driver).click();

        System.out.println("All test case passed");
    }
}
