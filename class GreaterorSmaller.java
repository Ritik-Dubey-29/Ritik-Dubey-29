import java.util.Scanner;
 class GreaterorSmaller {
     public static void greaterCheck(int a, int b){
         if(a>b){
             System.out.println(a+" is greater than " + b);
         }else{
             System.out.println(b+ " is greater than " +a);
         }
         return;
     }
     public static void main (String[]args){
         Scanner sc=new Scanner(System.in);
         System.out.println("enter no.1");
         int n=sc.nextInt();
         System.out.println("enter no.2");
         int m=sc.nextInt();
         greaterCheck(n,m);
     }
    
}
