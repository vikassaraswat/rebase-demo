import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
	rebase demo iin kmayer10 repo
*/

/**
 * @author Kulbhushan Mayer Thinknyx Technologies LLP
 */
public class RunTestGoogleLogin {
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

        // Maximize the browser window
        webDriver.manage().window().maximize();

        if (testWordpressloginFailure()) {
            System.out.println("Test Wordpress Login wrong password: Passed");
        } else {
            System.out.println("Test Wordpress Login password: Failed");

        }

        // Close the browser and WebDriver
        webDriver.close();
        webDriver.quit();
    }

    private static boolean testWordpressloginFailure() {
        try {
            // Open google.com
            webDriver.navigate().to("https://gitlab.com/users/sign_in");

            // Type in the username
            webDriver.findElement(By.id("user_login")).sendKeys("kulbhushan.mayer@gmail.com");

            // Type in the password
            webDriver.findElement(By.id("user_password")).sendKeys("1458745");

            // Click the Submit button
            webDriver.findElement(By.name("commit")).click();

            // Wait a little bit (7000 milliseconds)
            Thread.sleep(15000);

            // Check whether the h1 equals “Dashboard”
            if (webDriver.findElement(By.tagName("span")).getText()
                    .equals("Invalid Login or password.")) {
                return true;
            } else {
                return false;
            }

        // If anything goes wrong, return false.
        } catch (final Exception e) {
            System.out.println(e.getClass().toString());
            return false;
        }
    }
}
