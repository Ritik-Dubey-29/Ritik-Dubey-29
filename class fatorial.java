 import java.util.Scanner;
 class fatorial{
     public static void factorial(int a){
       if(a<0){
           System.out.print("invalid button");
       }
        int factorial2=1;

        for(int i=a;i>=1;i--){
            factorial2=i*factorial2;

        }
        System.out.println(factorial2);
        return;
        
     }
     public static void main(String[]args){
         try (Scanner sc = new Scanner(System.in)) {
            int a=sc.nextInt();
            factorial(a);
        }
     }
    
}
