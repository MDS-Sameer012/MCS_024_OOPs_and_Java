
class Base{
    Base(){
        System.out.println("I am Base Class Constructor");
    }
}
class Derived extends Base{

    Derived(){
        System.out.println("I am Derived Class Constructor");
    }
}

public class contructor_overloading {
    public static void main(String[] args) {
        Derived derivedObject = new Derived();
        
    }
}