import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // lay duong dan thu muc goc, user.dir la 1 phan mac dinh cua ham string ta chi can lay de dung
        String projectPath = System.getProperty("user.dir");

        // tro duong dan den driver
        System.setProperty("webdriver.edge.driver", projectPath + "\\browser_drivers\\msedgedriver.exe");

        //khoi tao 1 doi tuong chrome driver
        WebDriver driver = new EdgeDriver();

        // mo full man hinh windown
        driver.manage().window().maximize();

        //dieu huong den trang goole
        driver.get("https://google.com");

        Thread.sleep(5000);
        driver.quit();
    }
}