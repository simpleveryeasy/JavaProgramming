package week10;

public class MethodOverLoading {

    // convert inches to cm, return cm
    public static void main(String[] args) {
        // Height = 5 feet and 11 inches
        System.out.println(convertBritishToMetric(5.0, 11.0));
        // Height = 71 inches
        System.out.println(convertBritishToMetric(71));

    }

    public static double convertBritishToMetric (double feet, double inches){
        // 1 foot = 12 inches
        if (feet < 0 || inches < 0 || inches > 12){
            System.err.println("Invalid feet or inches");
            return -1.0;
        }

        return feet * 12 * 2.54 + inches * 2.54;
    }

    public static double convertBritishToMetric(double inches){
        if (inches < 0){
            System.err.println("Invalid feet or inches");
            return -1.0;
        }

        return inches * 2.54;
    }

}
