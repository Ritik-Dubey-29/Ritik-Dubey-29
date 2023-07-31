import java.util.Scanner;
class solutions {
     public static void main(String[]args){
         Scanner sc= new Scanner(System.in);
         int n=sc.nextInt();

         do{
            int b=sc.nextInt();
            if(b>=90 && b<=100){
                System.out.println("This is very good");
            }
            else if(89>= b && b>=60){
                System.out.println("This is normal");
            }
            else if(59>=b && b<=0) {
                System.out.println("You are Dumb");
            }
            else{
                System.out.println("Invalid");
            }
         }while(n==1);
     }
    
}
