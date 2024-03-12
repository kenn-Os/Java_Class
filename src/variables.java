public class variables {
    // Meaning of variables
    // Variables are used to store data in the memory of the computer. They can be assigned values, and this value can be changed. 
    // Three types of variables in java:
    // 1. Local variables
    // 2. Instance variables
    // 3. Static variables
    
    /*
        Local Variables:
            - Declared inside methods, blocks, and constructors.
            - Can only be accessed within the method, block, or constructor.
            - Not accessible outside the method, block, or constructor.
        
        Instance Variables:
            - Declared inside classes but not inside methods.
            - Belong to an instance of a class.
            - Can be accessed within the class.
            - Not accessible outside the class.
        
        Static Variables:
            - Declared inside classes but not inside methods.
            - Shared by all instances of that class.
            - Can be accessed within the class.
            - Accessible outside the class.
    */

    // Local Variables
    public static void main(String[] args) {
        int num2 = 10;                   // Integer local variable
        System.out.println(num2);

        String name = "Kenny C";
        System.out.println(name);
    }

}
