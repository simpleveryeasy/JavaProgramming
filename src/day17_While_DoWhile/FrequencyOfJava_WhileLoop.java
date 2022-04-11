package day17_While_DoWhile;

public class FrequencyOfJava_WhileLoop {

    public static void main(String[] args) {

        String str = "Java Java Java Python";
        str = str.toLowerCase();
        int frequency = 0;

        while (str.contains("java")) {
            str = str.replaceFirst("java", "");
            frequency++;
        }
        System.out.println(frequency);

        System.out.println("______________________\n");

        String sentence = "Cat cat cat cat dog dog cat cat";
        sentence = sentence.toLowerCase();
        int count = 0;

        while (sentence.contains("cat")) {
            sentence = sentence.replaceFirst("cat", "");
            count++;
        }
        System.out.println(count);

        System.out.println("______________________\n");

        String s = "Java Java Java Python python";
        s = s.toLowerCase();
        int javaCount = 0;
        int pythonCount = 0;

        while (s.contains("java") || s.contains("python")) {

            if (s.contains("java")) {
                s = s.replaceFirst("java", "");
                javaCount++;
            }

            if (s.contains("python")) {
                s = s.replaceFirst("python", "");
                pythonCount++;
            }
        }
        System.out.println("java: " + javaCount);
        System.out.println("python: " + pythonCount);
    }
}
