 import java.util.Scanner;
 class GCD {


    public static void gcdCalculator(int a,int b){
         if(a>b){
             for(int i=b;i>=2;i--){
                 if(a%i==0 && b%i==0){
                     System.out.println("GCD  of "+a+" , "+b+"is"+i);
                     break;
                 }

             }System.out.println("GCD  of "+a+" , "+b+"is"+"1");
             
         }else if(b>a){
             for(int i=a;i>=2;i--){
            if(a%i==0 && b%i==0){
                System.out.println("GCD  of "+a+" , "+b+"is"+i);
                break;
            }
        
               
            
        }System.out.println("GCD  of "+a+" , "+b+"is"+"1");

         }else{
            System.out.println("invalid");
        }
         return;
     }
     public static void calculateLcm(int x, int y){
         if(x>y){
             for(int i=x;i<x*y;i++){
                 if(i%x==0 && i%y==0){
                     System.out.println("Lcm is "+i);
                     break;
                 }

             }System.out.println("LCM of "+x+" , "+y+"is"+ x*y);

         } else if(y>x){
            for(int i=y;i<x*y;i++){
                if(i%x==0 && i%y==0){
                    System.out.println("Lcm is "+i);
                    break;
                }

            }System.out.println("LCM of "+x+" , "+y+"is"+ x*y);

        }else{
            System.out.println("invalid");
        }return;
     }
     public static void main(String[]args){
         Scanner sc=new Scanner (System.in);
         int x=sc.nextInt();
         int y=sc.nextInt();
         gcdCalculator(x,y);
         calculateLcm(x,y);
     }
    
}
