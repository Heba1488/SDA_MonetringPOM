package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.T03_FluentWebTablePage;
import utilities.ConfigReader;
import utilities.Driver;

public class T03_FluentWebTableTests {
    @DataProvider
    public Object[][] recordData() {
        return new Object[][] {
                {"John Doe", "23", "Canada"},
                {"Mary Lee", "34", "USA"},
                {"Tom Hanks", "82", "Australia"}
        };
    }

    @Test(dataProvider = "recordData")
    public void addRecordFluentTest(String name, String age, String country) {

        Driver.getDriver().get(ConfigReader.getProperty("url_T03"));
        T03_FluentWebTablePage tablePage = new T03_FluentWebTablePage(Driver.getDriver());

        tablePage.enterName(name)
                .enterAge(age)
                .selectCountry(country)
                .clickAddRecord();


    }
}
