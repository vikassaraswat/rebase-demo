import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
	Changes by Vikas 
*/

/**
 * @author Nils Schuette via frontendtest.org
 */
public class RunTest {
    static WebDriver webDriver;
    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(final String[] args) throws InterruptedException {
        // Telling the system where to find the chrome driver
        System.setProperty(
                "webdriver.chrome.driver",
                "C:/Users/kmayer/training/HSBC/chromedriver.exe");

        // Open the Chrome browser
        webDriver = new ChromeDriver();

        // Waiting a bit before closing
        Thread.sleep(7000);

        // Closing the browser and WebDriver
        webDriver.close();
        webDriver.quit();
    }
}
