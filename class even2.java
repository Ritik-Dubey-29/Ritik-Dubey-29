import java.util.Scanner;
class even2 {
     public static void checkEven(int a){
         if(a<0){
             System.out.print("invalid choice");
             
         }
         else if (a%2==0){
             System.out.print(a+"is an even number");


         }else{
             System.out.print(a+" is not an even number");
         }
         return;
             
     }
     public static void main(String[]args){
         Scanner sc=new Scanner (System.in);
         int n=sc.nextInt();
         checkEven(n);

     }
    
}
