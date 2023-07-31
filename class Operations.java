import java.util.Scanner;

class Operations {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         double a= sc.nextDouble();
         double b= sc.nextDouble();
         double c =sc.nextDouble();
         double amount=a*(1+b/100);
         System.out.println(Math.pow(amount,c));
         
     }
    
}
