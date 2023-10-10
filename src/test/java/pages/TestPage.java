package pages;

import com.core.utility.MasterPage;
import org.junit.Assert;

import static locators.Locators.*;

public class TestPage extends MasterPage {

    public void navigateToMainURL(){
        auto_openURLInBrowser();
    }

    public void completeLoginData(String user, String pass) {
        auto_setTextToInput(USERNAME_INPUT_XPATH, user);
        auto_setTextToInput(PASSWORD_INPUT_XPATH, pass);
    }

    public void ClickTheLoginButtonOnTheForm() {
        auto_setClickElement(LOGIN_BUTTON_XPATH);
    }

    public void ClickTheD01Button (String button){
        auto_setClickElement(button);
    }



//    public void verifyLogin() {
//        auto_setClickElement(USER_LOGIN_IMG_XPATH);
//        Assert.assertTrue("Error at login - Invalid username or passwor", auto_getElementText(USER_LOGIN_LBL_XPATH).toLowerCase().contains("autoc0de"));
//    }
}
