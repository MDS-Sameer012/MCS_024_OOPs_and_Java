package packageOne;

class Student{
    protected String name;
    protected int rollno;

    Student(){}

    public Student(int rollno,String name){
        this.rollno = rollno;
        this.name = name;
    }


    protected void getDetails(){
        System.out.println("\n*******************************\n");
        System.out.println("Student Rollno. : "+this.rollno);
        System.out.println("Student Name : "+this.name);
        System.out.println("\n*******************************\n");
    }
}

class StudentMarks extends Student{
    private int marks ;

    StudentMarks(int rollno , String name , int marks){
        super(rollno,name);
        this.marks = marks;
        this.rollno = rollno+1 ;
    }

    public void getMarks(){
        super.getDetails();
        System.out.println("Student Marks : "+this.marks);
    }}

/**
 * AccessSpecifier
 */
public class AccessSpecifier {
    public static void main(String[] args) {

        Student sam = new Student(12,"Sameer");
        sam.getDetails();
        sam.name = "Sohail";
        sam.getDetails();

        StudentMarks soh = new StudentMarks(16,"Sohail",89);
        soh.getMarks();
    }
}