import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income: ");
        double income = sc.nextDouble();
        double tax;
        if(income<= 250000){
            tax = 0;
        }
        else if (income<=500000){ 
        tax = (income*5)/100;
        }
        else if (income<=1000000){
            tax = (income*20)/100;
        }
        else {
            tax = (income*30)/100;
        }
        System.out.println("Income tax =  " + tax);
    }
}
