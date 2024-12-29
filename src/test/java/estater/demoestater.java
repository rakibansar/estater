package estater;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class demoestater {
 
public static void main(String[] args) {
    // Set the path to the ChromeDriver executable

    // Create a new instance of the ChromeDriver
    WebDriver driver = new ChromeDriver();

    // Maximize the browser window
    driver.manage().window().maximize();

    // Navigate to a URL
    driver.get("https://www.google.com");
}

}
