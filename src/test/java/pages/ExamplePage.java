package pages;

import com.core.utility.MasterPage;
//import org.junit.Assert;
import static locators.Locators.*;


public class ExamplePage extends MasterPage {
    public void navigateToMainURL() {
        auto_openURLInBrowser();
    }

    public void completeLoginData(String user, String pass) {
        auto_setTextToInput(USERNAME_INPUT_XPATH, user);
        auto_setTextToInput(PASSWORD_INPUT_XPATH, pass);
    }

    public void ClickTheLoginButtonOnTheForm() {
        auto_setClickElement(LOGIN_BUTTON_XPATH);
    }

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






//
////    public void verifyHomeTitle() {
////        Assert.assertTrue(page.isVisible(HOME_TITLE_XPATH));
////    }
////
////    public void clickButtonSwitch(String button) {
////        switch (button.toLowerCase()) {
////            case "foro":
////                clickOnForoButton();
////                break;
////            case "ingresar":
////                clickOnIngresarButtons();
////                break;
////            default:
////                Assert.assertEquals(button,"No button matched", "Invalid button options");
////        }
////    }
//
//    private void clickOnIngresarButtons() {
//        auto_setClickElement(FORO_BUTTON_XPATH);
//    }
//
//    private void clickOnForoButton() {
//        auto_setClickElement(FORO_BUTTON_XPATH);
//    }
//
////    public void clickIngresarButtonForum() {
////        auto_setClickElement(INGRESAR_LOGIN_BUTTONS_XPATH);
////    }
//
//    public void clickIngresarButtonForumModal() {
//        auto_setClickElement(INGRESAR_LOGIN_MODAL_BUTTONS_XPATH);
//    }
//
////    public void completeLoginData(String user, String pass) {
////        auto_setTextToInput(USUARIO_INPUT_XPATH, user);
////        auto_setTextToInput(PASS_INPUT_XPATH, pass);
////    }
////
////    public void verifyLogin() {
////        auto_setClickElement(USER_LOGIN_IMG_XPATH);
////        Assert.assertTrue("Error at login - Invalid username or passwor", auto_getElementText(USER_LOGIN_LBL_XPATH).toLowerCase().contains("autoc0de"));
////    }


}
