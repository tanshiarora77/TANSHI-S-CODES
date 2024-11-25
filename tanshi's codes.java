import java.util.Scanner;
public class tanshi {
    public static int fact_with_while(int n){
        int fact=1;
        int i=1;

        while(i<=n){
            fact=fact*i;
            i++;

        }
        
        return fact;

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a anumber whose factorial is to be found:");
        int num = sc.nextInt();
        System.out.print("\nfactorial of"+ num +"is:"+ fact_with_while(num));
    }
}
        

