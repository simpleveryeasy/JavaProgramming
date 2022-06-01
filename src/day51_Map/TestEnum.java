package day51_Map;

public class TestEnum {

    public static void main(String[] args) {

        Browser browser = Browser.CHROME;

        switch (browser){
            case FIREFOX:
                System.out.println("Firefox is selected");
                break;

            case SAFARI:
                System.out.println("Safari is selected");
                break;

            case OPERA:
                System.out.println("Opera is selected");
                break;

            case EDGE:
                System.out.println("Edge is selected");
                break;

            default:
                System.out.println("Chrome is selected");
        }

        System.out.println("______________________________________");

        Season season = Season.SUMMER;

        Day day = Day.SUNDAY;

        switch (day){
            case MONDAY:
                System.out.println("Monday");
                break;

            case TUESDAY:
                System.out.println("Tuesday");
                break;

            case WEDNESDAY:
                System.out.println("Wednesday");
                break;

            case THURSDAY:
                System.out.println("Thursday");
                break;

            case FRIDAY:
                System.out.println("Friday");
                break;

            case SATURDAY:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Sunday");
        }
    }
}
