package week08;

public class CharArray {

    public static void main(String[] args) {

        char[] letters = {'j','a','v','a',' ','i','s',' ','f','u','n'};

        for (char letter : letters) {
            System.out.print(letter+" ");
        }
        System.out.println();
        String sentence = new String(letters);
        System.out.println("sentence = " + sentence);

        // there is opposite of the action

        char [] newArray = sentence.toCharArray();
        for (char c : newArray) {
            System.out.print(c+" ");
        }

        System.out.println();
        char[] oneArray = {'w','h','a','t',' ','a', ' ','f','u','n'};
        String sentenceOne = new String(oneArray);
        System.out.println("sentenceOne = " + sentenceOne);
        char[] twoArray = sentenceOne.toCharArray();
        for (char c : twoArray) {
            System.out.print(c);

        }

    }
}
