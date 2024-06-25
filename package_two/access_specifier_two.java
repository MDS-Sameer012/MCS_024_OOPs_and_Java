package package_two;

import packageOne.AnotherFile;

/**
 * access_specifier_two
 */
public class access_specifier_two extends AnotherFile {

    access_specifier_two(int num){
        super(num);
    }
    public static void main(String[] args) {
        AnotherFile tony = new AnotherFile(23);
        tony.getDetails();
    }
}