package home;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomeTest extends CommonAPI {
    @Test
    public void testUserCanUseSearchBox() {
        HomePage searchPage = PageFactory.initElements(driver, HomePage.class);
        searchPage.searchNClick("phone");
    }

    @Test
    public void testUserCanClickOnAmazonLogo() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.clickOnAmazonLogo();
    }

    @Test
    public void testUserCanClickOnReturnNOrder() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.returnNOrderProduct();
    }

    @Test
    public void testUserCanGoToShoppingCart() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.checkShoppingCart();
    }

    @Test
    public void testUserCanGoToPrime() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.gotoPrime();
    }

    @Test
    public void testUserCanGoToSignInPage() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.goToSignIn();
    }

    @Test
    public void testUserCanClickOnHamburgerIconForMoreOptions() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.hamburgerIconForOptions();
    }

    @Test
    public void testUserCanSelectAddress() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.useAddressBtn();
    }

    @Test
    public void testUserCanGoToTodaysDealPage() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.useTodaysDealBtn();
    }

    @Test
    public void testUserCanGoToBestSellersPage() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.useBestSellersBtn();
    }

    @Test
    public void testUserCanGoToCustomerServicePage() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.useCustomerServiceBtn();
    }

    @Test
    public void testUserCanGoToFindAGiftPage() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.useFindGiftBtn();
    }

    @Test
    public void testUserCanGoToNewReleasePage() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.useNewReleaseBtn();
    }
}
