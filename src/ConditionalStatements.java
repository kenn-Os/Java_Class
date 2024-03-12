public class ConditionalStatements {
    public static void main(String[] args) {
        /*
         * Decision-making statements in Java decide which statements to execute and when. Decision-making statements evaluate the Boolean expression and control the program flow depending on the result of the condition provided.
         * 
         * If Statement - This is used to evaluate a condition. The control of the program is diverted depending upon the specific condition provided. The condition of the statement is provided in the form of a Boolean expression. Either true or false.
         */

         // if statement
          int age = 17;
          if (age >= 18) {
              System.out.println("Yay!! Niggas..... I am an Adult");
          }else{
              System.out.println("I am not an adult");
          }

          int time = 22;
          if (time < 10) {
              System.out.println("Good Morning");
          }else if(time < 20){
              System.out.println("Good Day");
          }else{
              System.out.println("Good Evening");
            
          }
          // Short form
          int age2 = 18;
          String result = (age2 >= 18) ? "Yay!! I am an Adult" : "I am not an adult";
          System.out.println(result);


        

    }
       

}
