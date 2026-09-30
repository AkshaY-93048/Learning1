import java.util.Scanner;
public class Q2 {
    public static void main(String[] args){
        byte m1, m2, m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in Physics: ");
        m1 = sc.nextByte();
        System.out.println("Enter your marks in Chemistry: ");
        m2 = sc.nextByte();
        System.out.println("Enter your marks in Math: ");
        m3 = sc.nextByte();
        float percentage = ((m1+m2+m3)/3.0f);
        System.out.println("percentage: " + percentage + "%");
        if (percentage>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("passed");
        }
        else{
            System.out.println("fucked up");
        }
    }
}
