package packageOne;

/**
 * AnotherFile
 */
public class AnotherFile {

    AnotherFile(){}
    public int empID;
    public  AnotherFile(int empID){
        this.empID = empID;
    }
    public void getDetails(){
        System.out.println("Emp ID is "+ empID);
    }

    public static void main(String[] args) {
        Student sohail = new Student(15, "Sohail");
        sohail.getDetails();
    }
}