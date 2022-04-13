package day_39Recap.cydeoTask;

public class Employee extends Person{

    private int employeeId;
    private String jobTitle;
    private double salary;



    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        if (employeeId <= 0){
            System.err.println("Invalid value: " + employeeId);
            System.exit(1);
        }
        this.employeeId = employeeId;
    }



    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        if (!(jobTitle.equalsIgnoreCase("tester") || jobTitle.equalsIgnoreCase("developer") ||
        jobTitle.equalsIgnoreCase("teacher"))){
            System.err.println("Invalid value: " + jobTitle);
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }



    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        if (salary <= 0){
            System.err.println("Invalid value: " + salary);
            System.exit(1);
        }
        this.salary = salary;
    }


    public Employee(String name, int age, char gender, int employeeId, String jobTitle, double salary) {
        super(name, age, gender);
        setEmployeeId(employeeId);
        setJobTitle(jobTitle);
        setSalary(salary);
    }



    public void work(){
        System.out.println(getName() + " is working");
    }



    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", employeeId=" + employeeId +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
/*
2. Create a sub class of Person named Employee:
            Extra variables:
                employeeId, jobTitle, salary

            Encapsulate all the fields

            Add a constructor to set all the fields

            Methods:
                work()
                toString()
 */
