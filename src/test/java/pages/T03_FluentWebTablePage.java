package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

public class T03_FluentWebTablePage {
    private WebDriver driver;


    @FindBy(id = "nameInput")
    private WebElement nameInput;

    @FindBy(id = "ageInput")
    private WebElement ageInput;

    @FindBy(id = "countrySelect")
    private WebElement countrySelect;

    @FindBy(xpath = "//*[.='Add Record']")
    private WebElement addRecordBtn;

    @FindBy(id = "recordsTable")
    private WebElement table;

    public T03_FluentWebTablePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public T03_FluentWebTablePage enterName(String name) {
        nameInput.clear();
        nameInput.sendKeys(name);
        return this;
    }

    public T03_FluentWebTablePage enterAge(String age) {
        ageInput.clear();
        ageInput.sendKeys(age);
        return this;
    }

    public T03_FluentWebTablePage selectCountry(String country) {
        new Select(countrySelect).selectByVisibleText(country);
        return this;
    }

    public T03_FluentWebTablePage clickAddRecord() {
        addRecordBtn.click();
        return this;
    }


}
