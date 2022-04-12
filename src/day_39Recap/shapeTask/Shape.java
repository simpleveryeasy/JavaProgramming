package day_39Recap.shapeTask;

public class Shape {

    private String name;

    //--------Getter-------------
    public String getName() {
        return name;
    }

    //--------Setter---------------
    public void setName(String name) {
        if (name == null){
            System.err.println("Name can not be null");
            System.exit(1); // 1:something went wrong
        }
        if (name.isBlank() || name.isEmpty()){
            System.err.println("Invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    //--------Constructor-------------
    public Shape(String name) {
        setName(name);
    }

    //--------Area Method-------------
    public double area(){
      return 0;
    }

    //--------Perimeter Method-------------
    public double perimeter(){
        return 0;
    }
}
/*
Shape:
	variables:
			name

	Encapsulate the field

	Add a constructor to set the filed

	Methods:
		area(){}
		perimeter(){}


 */