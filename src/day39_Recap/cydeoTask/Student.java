package day39_Recap.cydeoTask;

public class Student extends Person{

    private int studentId;
    private String fieldOfStudy;


    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        if (studentId <= 0){
            System.err.println("Invalid value: " + studentId);
            System.exit(1);
        }
        this.studentId = studentId;
    }



    public String getFieldOfStudy() {
        return fieldOfStudy;
    }
    public void setFieldOfStudy(String fieldOfStudy) {
        if (fieldOfStudy == null){
            System.err.println("Field of study can not be null");
            System.exit(1);
        }
        if (fieldOfStudy.isBlank() || fieldOfStudy.isEmpty()){
            System.err.println("Invalid value: " + fieldOfStudy);
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }


    public Student(String name, int age, char gender, int studentId, String fieldOfStudy) {
        super(name, age, gender);
        setStudentId(studentId);
        setFieldOfStudy(fieldOfStudy);
    }



    public void study(){
        System.out.println(getName() + " " + " is studying");
    }


    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", studentId=" + studentId +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                '}';
    }
}
/*
6. Create a sub class of Person named Student

            Extra variables:
                studentId, fieldOfStudy

            Encapsulate all the fields

            Add a constructor to set all the fields

            Encapsulate all the fields

            Methods:
                study()

 */
