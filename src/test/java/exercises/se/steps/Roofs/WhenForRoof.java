package exercises.se.steps.Roofs;

import cucumber.api.java.en.When;
import exercises.se.Actions.CommonActions;
import exercises.se.browser.Driver;
import exercises.se.pages.RoofSpecification.RoofCategories;
import exercises.se.pages.RoofSpecification.RoofSpecifications;

import java.util.concurrent.TimeUnit;

import static exercises.se.browser.Driver.getDriver;

public class WhenForRoof {

    RoofSpecifications roofSpecifications = new RoofSpecifications(getDriver());
    CommonActions commonActions= new CommonActions();
    RoofCategories roofCategories = new RoofCategories(Driver.getDriver());
    @When("click on menu button")
    public void menu(){
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        roofSpecifications.getMenu().click();
    }

    @When("choose {string} category from the list")
    public void clickOnSpecificCategory(String categoryName){
        commonActions.scrollToElement(roofSpecifications.getSelectCategory());
        System.out.println(roofSpecifications.getSelectCategory().getText().trim());
        roofSpecifications.getMenuItemByName(categoryName).click();
    }

    @When("click on {string} button of the product")
    public void clickOnProduct(String buttonLook){
        roofCategories.getLookButton().click();
    }

}
