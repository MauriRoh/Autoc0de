package pages;

import com.core.utility.MasterPage;
import org.junit.Assert;


import static locators.Locators.*;

public class ExamplePage extends MasterPage {

    public void ClickTheD01Button(){
        auto_setClickElement(DO1_BUTTON_XPATH);
    }

    public void Button02ChangeFromDisableToEnable(){
        auto_isElementVisible(DO1DESABLE_BUTTON_XPATH);
    }

    public void ClickTheD02Button(){
        auto_setClickElement(DO2_BUTTON_XPATH);
    }

    public void Button01ChangeFromDisableToEnable(){
        auto_isElementVisible(DO2DESABLE_BUTTON_XPATH);
    }

    public void ClicksTheUpButtonfourTimes(int up) {
        for (int i = 0; i < up; i++){
            auto_setClickElement(INCREASEFONT_BUTTON_XPATH);
        }
    }

    public void FontIncreasesInSize(){
        auto_isElementVisible(TEXT32PX_P_XPATH);
    }

    public void ClicksTheDownButtonfourTimes (int down) {
        for (int i = 0; i < down; i++){
            auto_setClickElement(DECRESEFONT_BUTTON_XPATH);
        }
    }

    public void FontDecreasesInSize(){
        auto_isElementVisible(TEXT8PX_P_XPATH);
    }

    public void EntersColorIntoTheInput(String color) {
        auto_setTextToInput(BGCOLOR_INPUT_XPATH, color);
    }

    public void ClickTheSetBackgroundColorButton() {
        auto_setClickElement(SETBGCOLOR_BUTTON_XPATH);
    }

    public void BackgroundColorChanges(){
        auto_isElementVisible(COLORIZE_FORM_XPATH);
    }



}

