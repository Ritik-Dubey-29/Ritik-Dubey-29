 import java.util.Scanner;
 class prime {
     public static void main(String[]args){
         Scanner sc= new Scanner(System.in);
         int n= sc.nextInt();
         boolean isPrime=true;
         for(int i=2;i<n/2;i++){
             if(n%i==0){
                 isPrime=false;
                 break;
             }


         }
         if(isPrime){
             if(n==1){
                 System.out.println("1 is neither composite nor prime");

             }else{
                 System.out.println("This is a prime number");

             }

         }else{
                System.out.println("This is not a prime number");
         }
     }
    
}
