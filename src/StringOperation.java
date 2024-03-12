public class StringOperation {
// Strings are used for storing text.A string is a collection of characters enclosed in single or double quotes

public static void main(String[] args) {
    // Creating a string
    String name = "Kenny";
    System.out.println(name);

    // Getting length of a string
    String word = "Welcome to ApTech";
    System.out.println("The length of the string is: " + word.length());

    // Converting string To Uppercase
    String txt = "hello aptech";
    System.out.println(txt.toUpperCase());

    // Converting string to Lowercase
    String txt2 = "HELLO APTECH";
    System.out.println(txt2.toLowerCase());

    // Finding a  String in a String
    String txt3 = "I am a student of aptech";
    System.out.println(txt3.indexOf("aptech"));

    // String Concatenation
    String firstName = "Esther";
    String secondName = "Chinaka";
    System.out.println("Her name is " + firstName + " " + secondName);

    // or using concat
    System.out.println("Her name is " .concat(firstName.concat(" ".concat(secondName))));


    String test = "Prince is the so-called \"City Boy\" from Rivers";
    System.out.println(test);

    // Create a function for encrypting a string
    // To reverse a string
    // to edit or change a string




}
}
