package week18.poly_demo2;

public class ElementsTest {

    public static void main(String[] args) {

        Links links = new Links(); //no poly

        links.click();
        links.getText();
        links.sendKeys("EU8");
        links.getLinkHref();

        WebElement loginLink = new Links(); //poly
        loginLink.click(); // poly-dynamic binding
        String text = loginLink.getText();
        System.out.println("text " + text);
        ((Links)loginLink).getLinkHref(); // explicit down-casting

        WebElement userName = new InputField();
        userName.click();
        userName.sendKeys("superman");

        ((InputField)userName).getValue(); //can be reach by down-casting

        System.out.println("-----changed object of the reference type----");
        userName = new Links(); //benefit of poly
        userName.click();
        ((Links)userName).getLinkHref();

        userName = new InputField();

        // two objects InputField, Links
        WebElementUtility.clickElement(loginLink);
        WebElementUtility.clickElement(userName);
        //  WebElementUtility.clickElement(new String("Hello")); String is not child of WebElement
        WebElementUtility.clickElement(links);

        WebElement login = WebElementUtility.getLinkWithText("login");
        login.click();


    }
}
