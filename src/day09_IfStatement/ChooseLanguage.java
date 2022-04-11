package day09_IfStatement;

import java.util.Scanner;

public class ChooseLanguage {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("enter a number 1~5: ");
        int num = input.nextInt();
        String gre;

        if (num >= 1 && num <= 5) {
            if (num == 1){
                gre = "Hello, thank for your call";
            }else if (num == 2) {
                gre = "Hola, gracias para llamar";
            }else if (num == 3) {
                gre = "Merhaba, aradiginiz icin tesekkurler";
            }else if (num == 4) {
                gre = "Privet, spasibo za vash zvonok";
            }else {
                gre = "Merci ,pour votre appel";}
            System.out.println(gre);
        }else {
            System.out.println("invalid number");
        }
input.close();

    }
}
/*
3. Creata a class called ChooseLanguage, Given an integer variable named selection that has a number between 1~5,
 Write a program that can select the language based on the number that's given in selection and prints the following message:

		for 1: Hello, thank for your call
		for 2: Hola, gracias para llamar
		for 3: Merhaba, aradiginiz icin tesekkurler
		for 4: Privet, spasibo za vash zvonok
		for 5: Merci ,pour votre appel
 */