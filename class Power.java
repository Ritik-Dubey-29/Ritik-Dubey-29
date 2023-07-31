 import java.util.Scanner;
 class Power{
     public static int powFunction(int x,int n){
        int power=1; 
        for(int i=1;i<=n;i++){
             power=x*power;
             

         }
         System.out.println("Power  of " +x+" raised to "+n+ " is "+ power);

         return power;
     } 
     public static void main(String[]args){
         Scanner sc =new Scanner(System.in);
         int n=sc.nextInt();
         int m=sc.nextInt();
         powFunction(n,m);
     }
    
}
