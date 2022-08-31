package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class utils extends driver{
    public boolean switchWindow() {
        String parent_win = getDriver().getWindowHandle();
        Set<String> windows = getDriver().getWindowHandles();
        boolean flag =true ;
        for (String winID : windows) {

            if (!winID.equals(parent_win)) {
                getDriver().switchTo().window(winID);
                flag = true;
            }else {
                flag = false;
            }
        }
        return flag;
    }
    public void scrollToElement( WebElement element){

        JavascriptExecutor js = ((JavascriptExecutor) getDriver());
        js.executeScript("arguments[0].scrollIntoView(true);", element);

    }
    public static void setWaitTime(){
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public static void staticWait(int second){
        try {
            Thread.sleep(1000 * second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
