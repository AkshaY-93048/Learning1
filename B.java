//import java.util.Scanner;
public class B {
    public static void main(String[] args) {
       // int a = 6;
       // int b = 7;
       // int c = 8;
       // Scanner sc = new Scanner(System.in);
     //  String st = sc.next();
      // String st = sc.nextLine();
      // System.out.println(st);
      String name = "   AKSHAY   ";
      int value = name.length();
      System.out.println(name);
      System.out.println(value);
      String lstring = name.toLowerCase();
      System.out.println(lstring);
      String ustring = name.toUpperCase();
      System.out.println(ustring);
      
      String result = name.trim();
      System.out.println(result);
     // System.out.println(name.substring(1,3));
     // System.out.println(name.replace("A","I"));
      System.out.println(name.startsWith("AK"));
      System.out.println(name.endsWith("AY"));
      System.out.println(name.charAt(3));
      String modifiedName = "Akkshhay";
      System.out.println(modifiedName.indexOf("sh"));
      System.out.println(modifiedName.lastIndexOf("ha"));

        // System.out.println(12+a-8-c*b);
    }
}
