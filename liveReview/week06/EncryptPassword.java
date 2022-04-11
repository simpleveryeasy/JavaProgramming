package week06;

public class EncryptPassword {

    public static void main(String[] args) {

        String password = "cydeo";

        char encryptChar = 'x';
        String encrypted = "";

        for (int i = 0; i <= password.length()-1; i++){
            encrypted+= ""+password.charAt(i)+encryptChar;

        }
        System.out.println(encrypted);
    }
}
