package Firstsele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firstselenium {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver",
                "C:\\Users\\wayne\\Documents\\Selenium dependencies\\drivers\\geckodriver.exe");


        WebDriver driver=new FirefoxDriver();

         driver.get("https://www.donanimhaber.com");





    }


}
