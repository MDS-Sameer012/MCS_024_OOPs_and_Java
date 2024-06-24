/**
 * finalize_method
 */
class myClass{
    private int a;
    
    myClass(int a){
        this.a = a;
    }
    public void getA(){
        System.out.println("Value of A is : "+a);
    }
    
    
}

public class finalize_method {
    @Override
    protected  void finalize() throws Throwable{
        System.out.println("Garbage Collector Called Finalize");
    }
    public static void main(String []args){
        myClass a = new myClass(4);
        myClass b = new myClass(9);
        a.getA();
        b.getA();
        a = null;
        b = null;
        Runtime.getRuntime().gc();
    }  
   
    
}