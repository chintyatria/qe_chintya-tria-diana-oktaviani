package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProductPage extends PageObject {
    private By productType(){
        return By.id("product_type_0");
    }

    @Step
    public void openPage(){
        open();
    }
    @Step
    public void selectItem(){
        $(productType()).click();
    }

}
