import java.util.Scanner;
public class Check {
    public static void main(String[] args){
        //boolean a = true;
        //boolean b = false;
        //if(a && b){
          //  System.out.println("Y");
       // }
      //  else{
      //      System.out.println("N");
      //  }
        int age;
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if(age>46){
            System.out.println("you are experienced");

        }
        else if(age>36){
            System.out.println("you are semi-experienced");
        }
        else if(age>26){
            System.out.println("you are semi-semi-experienced");
        }
        else if(age<20){
            System.out.println("you are not experienced");
        } 
    }
}
