package day35_Encapsulation;

public class CydeoStudentObject {

    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("john", "programming",'M',42,
                212, 8);

        String school = CydeoStudent.schoolName;
        String name1 =  student1.name;
        String school2 = student1.schoolName;
        CydeoStudent.printSecretCode();
        student1.study();
    }
}
