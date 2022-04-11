package day37_Inheritance.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class AmazonInc {

    public static void main(String[] args) {

        String company = "Amazon Inc";
        ProductOwner po = new ProductOwner("Suhaib", 29, 'M', 1, 160000, company);

        BusinessAnalyst ba = new BusinessAnalyst("Cihad", 30, 'M', 2, 150000, company);

        ScrumMaster sm = new ScrumMaster("Anel", 26, 'F', 3, 145000, company);

        Tester tester1 = new Tester("Chinara", 32, 'F', 1415, "QA", 125000, company);
        Tester tester2 = new Tester("Yasaman", 31, 'F', 1416, "QE",130000, company);
        Tester tester3 = new Tester("Irana", 29, 'F', 1417, "SDET", 128000, company);
        Tester tester4 =new Tester("Cihad", 26, 'M', 1418, "QA", 125000, company);
        Tester[] testers = {tester1, tester2, tester3, tester4};

        Developer developer1 = new Developer("Daniela", 29, 'F', 8, "Java Developer", 135000, company);
        Developer developer2 = new Developer("Max", 40, 'M', 9, "Senior Java Developer", 145000, company);
        Developer developer3 = new Developer("Allison", 18, 'F',10 , "Junior Java Developer", 100000, company);
        Developer developer4 = new Developer("Manas", 40, 'M', 10, "Full Stack Developer", 139000, company);
        Developer developer5 = new Developer("Evelyn", 30, 'F', 11, "JS Developer", 120000, company);
        Developer[] developers = {developer2, developer3, developer4, developer5};

        ScrumTeam scrumTeam = new ScrumTeam(po, ba, sm);
        scrumTeam.addDeveloper(developer1);
        scrumTeam.addTesters(testers);
        scrumTeam.addDevelopers(developers);

        System.out.println(scrumTeam); //ScrumTeam{PO=Suhaib, BA=Cihad, SM=Anel, testers=4, developers=5}

        for (Tester tester : scrumTeam.testers) {
            System.out.println(tester.name + " : " + tester.salary);
        }

        for (Developer developer : scrumTeam.developers) {
            System.out.println(developer.name + " : " + developer.salary);
        }


    }
}
