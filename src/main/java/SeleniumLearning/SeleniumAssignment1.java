package SeleniumLearning;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumAssignment1 {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        //Facebook
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        String fbtitle= driver.getTitle();
        String fburl = driver.getCurrentUrl();
        System.out.println(fbtitle);
        System.out.println(fburl);
        driver.close();
        //Youtube
        driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        String yTtitle= driver.getTitle();
        String yTurl = driver.getCurrentUrl();
        System.out.println(yTtitle);
        System.out.println(yTurl);
        driver.close();
        //LinkedIn
        driver = new ChromeDriver();
        driver.get("https://in.linkedin.com/");
        driver.manage().window().maximize();
        String lkndtitle= driver.getTitle();
        String lkndurl = driver.getCurrentUrl();
        System.out.println(lkndtitle);
        System.out.println(lkndurl);
        driver.close();
        //TechEllecptica
        driver = new ChromeDriver();
        driver.get("https://techelliptica.com/login.php");
        driver.manage().window().maximize();
        String TeTitle= driver.getTitle();
        String teUrl = driver.getCurrentUrl();
        System.out.println(TeTitle);
        System.out.println(teUrl);
        driver.close();
        //Pintrest
        driver = new ChromeDriver();
        driver.get("https://in.pinterest.com/");
        driver.manage().window().maximize();
        String pTitle= driver.getTitle();
        String pUrl= driver.getCurrentUrl();
        System.out.println(pTitle);
        System.out.println(pUrl);
        driver.close();
        driver.quit();



    }
}
