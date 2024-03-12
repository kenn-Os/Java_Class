public class Operators {
// Operators in java is a symbol that is used to perform operations. There are 11 operators in java. 
// Arithmetic Operators: +, -, *, /, %, ++, --
// Comparison Operators: ==, !=, >, <, >=, <=
// Logical Operators : &&, ||, !
// Assignment Operators: =, +=, -=, *=, /=, %=
// Bitwise Operators: &, |, ^, ~, <<, >>, >>>
// Ternary Operator:? :
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10;
        int b = 20;
        System.out.println(a + b); // addition
        System.out.println(a - b); // subtraction
        System.out.println(a * b); // Multiplication
        System.out.println(a / b); // Division
        System.out.println(a % b); // Remainder (Modulus) operator
        System.out.println(++a); // Increment operator
        System.out.println(--a); // Decrement operator

        // Comparison Operators
        int princeAge = 18;
        int adaAge = 25;
        System.out.println(adaAge == princeAge); // Equal to
        System.out.println(adaAge != princeAge); // Not equal to
        System.out.println(adaAge > princeAge); // Greater than
        System.out.println(adaAge < princeAge); // Less than
        System.out.println(adaAge >= princeAge); // Greater than or equal to
        System.out.println(adaAge <= princeAge); // Less than or equal to

        // Logical Operators
        boolean isAdult = false;
        boolean isStudent = true;
        boolean isKirito = true;
        System.out.println(isAdult && isStudent); // AND operator
        System.out.println(isAdult || isKirito); // OR operator
        System.out.println(!isAdult); // NOT operator




    }
}
