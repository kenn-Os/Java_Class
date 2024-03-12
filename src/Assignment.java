public class Assignment {
    public static void main(String[] args) {
         // To reverse a string
        String str = "Hello World";
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println(reversed);

         // to edit or change a string
         String str2 = "Hello World";
         String newStr = str2.replace("World", "Java");
         System.out.println(newStr);
         
         // Checking if a string contains another string
         boolean check = str2.contains("World");
         System.out.println(check);

         // Encrypting a string
         String str3 = "Goodbye Cruel World";
         String encrypted = "";
         for (int i = 0; i < str3.length(); i++) {
             char ch = str3.charAt(i);
             if (ch >= 'a' && ch <= 'z') {
                 ch = (char) (ch + 3);
             } else if (ch >= 'A' && ch <= 'Z') {
                 ch = (char) (ch + 3);
             }
             encrypted += ch;
         }
         System.out.println(encrypted);
}
}