import java.util.Scanner;
public class Roo {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number: ");
        int a =sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("sum = " + sum);
    }
}
