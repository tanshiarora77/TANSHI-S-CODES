
import java.util.*;
public class EvenOdd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers :");
        int number=sc.nextInt();
        if (number%2==0)
        System.out.println("The number is Even");
        else
        System.out.println("The number is Odd");
    }
}