/**
 * exception_handling
 */
public class exception_handling {

    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 5;
            System.out.println(a+" / "+b+" = "+ a/b);
        } 
        // catch (ArithmeticException e) {
        //     // TODO: handle exception
        //     System.out.println("Exception Occur : " + e);
        // } 
        finally {
            System.out.println("Finally Called");
        }
        System.out.println(demo());
        System.out.println("Outside Try-Catch-Finally Block");
    }

    public static String demo(){
        try{
            return "I am Demo Function";
        }finally{
            System.out.println("I am Finally of demo");
        }
    }
}