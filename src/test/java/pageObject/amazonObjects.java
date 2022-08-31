package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.utils;

public class amazonObjects extends utils {

    public amazonObjects(){
        PageFactory.initElements(getDriver(),this);
    }
    @FindBy(xpath = "//a[@id='nav-hamburger-menu']")
    private WebElement hamburgerMenu;

    @FindBy(xpath = "//a[@data-menu-id='9']")
    private WebElement TVAppliancesElectronicsButton;

    @FindBy(xpath = "//a[@href='/gp/browse.html?node=1389396031&ref_=nav_em_sbc_tvelec_television_0_2_9_2']")
    private WebElement televisionButton;

    @FindBy(xpath = "//span[.='Samsung']")
    private WebElement samsungCheckBox;

    @FindBy(id="a-autoid-0-announce")
    private WebElement sortByMenu;

    @FindBy(xpath = "//a[@id='s-result-sort-select_2']")
    private WebElement highToLowButton;

    @FindBy(xpath = "//div[@data-index='2']")
    private WebElement secondItem;

    @FindBy(xpath = "//h1[.=' About this item ']")
    private WebElement aboutThisItem;

    @FindBy(id = "feature-bullets")
    private WebElement information;

    public void setHamburgerMenu(){
        hamburgerMenu.click();
    }
    public void setTVAppliancesElectronicsButton(){
        TVAppliancesElectronicsButton.click();
    }
    public void setTelevisionButton(){
        televisionButton.click();
    }
    public void setSamsungCheckBox(){
        scrollToElement(samsungCheckBox);
        samsungCheckBox.click();
    }
    public void setSortByMenu(){
        sortByMenu.click();
    }
    public void setHighToLowButton(){
        highToLowButton.click();
    }
    public void setSecondItem(){
        secondItem.click();
    }
    public void setAboutThisItem(String expected){
        Assert.assertEquals(aboutThisItem.getText(),expected);
    }
    public void setInformation(){
        System.out.println(information.getText());
    }
}
