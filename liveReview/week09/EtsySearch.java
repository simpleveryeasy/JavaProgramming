package week09;

public class EtsySearch {

    public static void main(String[] args) {

        System.out.println("____Starting UI Automation testing for Etsy WebSite_____");

        openBrowser("Chrome");

        navigateToUrl("https://www.etsy.com");

        searchForItem("Java");

        if(verifyItemIsDisplayed().equals("PASS")){
            System.out.println("Passed the test case scenario");
        }else {
            System.out.println("Failed the test case scenario");
        }



    }

    public static void openBrowser(String browser){
        System.out.println("Launching" + browser + " browser");
    }

    public static void navigateToUrl(String url){
        System.out.println("Navigating to " + url);
    }

    public static void searchForItem(String item){
        System.out.println("PASS: verify " + item + " exists");
        System.out.println("Click on that " + item);
    }

    public static String verifyItemIsDisplayed(){
        String result = "PASS";
        return result;
    }
}
