package pages;

import org.testng.annotations.Test;
import pageObject.amazonObjects;

public class amazon extends amazonObjects {
    String baseURL="https://www.amazon.in/";

    @Test
    public void testCase1(){
        getDriver().get(baseURL);
        setWaitTime();
    }
    @Test(description = "User wants to click menu and under menu TV, Appliances and Electronics")
    public void testCase2(){
        setHamburgerMenu();
        staticWait(2);
        setTVAppliancesElectronicsButton();
    }
    @Test(description = "User wants to click Televisions and wants to select brand as a 'Samsung'")
    public void testCase3(){
        staticWait(2);
        setTelevisionButton();
        staticWait(2);
        setSamsungCheckBox();
    }
    @Test(description = "User wants to sort by High to Low Price")
    public void testCase4(){
        staticWait(2);
        setSortByMenu();
        staticWait(2);
        setHighToLowButton();
    }
    @Test(description = "User wants to click second highest priced item and move to new tab")
    public void testCase5(){
        staticWait(2);
        setSecondItem();
        switchWindow();
    }
    @Test(description = "User wants to validate page has an About this item and wants to see information")
    public void testCase6(){
        staticWait(2);
        String expected="About this item";
        setAboutThisItem(expected);
        setInformation();
    }
}
