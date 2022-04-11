package day20_Arrays;

public class UniqueElements {

    public static void main(String[] args) {

        String[] word = {"Java", "Java", "C#", "Python", "Python", "C", ".Net", "C+", "C+", "C++", "Dos", "Dos"};

        for (int j = 0; j < word.length; j++) {
            String element = word[j];
            int count = 0;
            for (int i = 0; i < word.length; i++) {
                if (word[i].equals(element)){
                    count++;
                }
            }

            if (count == 1){
                System.out.println(element);
            }
        }

    }
}
