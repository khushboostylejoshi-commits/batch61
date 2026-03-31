package SeleniumLearning;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice1 {
    public static void main(String[] args){

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        String title =driver.getTitle();// to get the title
        System.out.println(title);
        String url = driver.getCurrentUrl();
        System.out.println(url);
        driver.close();//it closes only the active tab/browser opened
        driver.quit();//it closes the complete session(all tabs/browser)



    }
}

//Assignment
//To open 5 website ,maximize,get the totle and the url and quit