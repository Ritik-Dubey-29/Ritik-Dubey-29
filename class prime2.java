 import java.util.Scanner;
 class prime2 {
     public static void checkPrime(int a){
        // boolean isPrime= true; 
        boolean isPrime=true;
         for(int i=2;i<a/2;i++){
             if(a%i==0){
                 isPrime=false;
                 break;
             }


         }
         if(isPrime){
             if(a==1){
                 System.out.println("1 is neither composite nor prime");

             }else{
                 System.out.println("This is a prime number");

             }

         }else{
                System.out.println("This is not a prime number");
         }
        }

     
     public static void main(String[]args){
         try (Scanner sc = new Scanner(System.in)) {
            int a=sc.nextInt();
             checkPrime(a);
        }
     }
    
}
