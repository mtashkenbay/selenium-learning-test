package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoading extends BasePage {
    By startButton = By.cssSelector("#start > button");
    By finishTest = By.id("finish");

    public DynamicLoading(WebDriver driver) {
        super(driver);
    }
    public void loadExample(String exampleNumber) {
        visit("/dynamic_loading/" + exampleNumber);
        click(startButton);
    }
    public Boolean finishTextPresent() {
        return isDisplayed(finishTest, 20);
    }
}
