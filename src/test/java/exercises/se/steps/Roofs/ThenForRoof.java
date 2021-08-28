package exercises.se.steps.Roofs;

import cucumber.api.java.en.Then;
import exercises.se.Actions.CommonActions;
import exercises.se.browser.Driver;
import exercises.se.pages.RoofSpecification.RoofCategories;
import exercises.se.pages.RoofSpecification.RoofProducts;
import exercises.se.pages.RoofSpecification.RoofSpecifications;

public class ThenForRoof {
    RoofSpecifications roofSpecifications = new RoofSpecifications(Driver.getDriver());
    RoofCategories roofCategories = new RoofCategories(Driver.getDriver());
    RoofProducts roofProducts = new RoofProducts(Driver.getDriver());
    CommonActions commonActions = new CommonActions();
    @Then("a list of categories is displayed")
    public void categoriesList(){
        System.out.println(roofSpecifications.getListOfCategories().getText().trim());

    }

    @Then("scroll to {string} product")
    public void products(String productTitle){
        System.out.println(roofCategories.getCategoryTitle().getText().trim());
        roofCategories.getMenuProductByName(productTitle);
    }

    @Then("product page is displayed")
    public void productPage(){
        System.out.println(roofProducts.getProductPageTitle().getText().trim());

    }

    @Then("get the specifications of the product")
    public void specificationsOfProduct(String spfName){
        commonActions.scrollToElement(roofProducts.getSpecifications());
        roofProducts.getSpecificationsByName(spfName);
        System.out.println(roofProducts.getSpecificationsTable());

    }
}
