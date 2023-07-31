 import java.util.Scanner;
 class Products {
     public static float multiply(float a, float b){
         float mult=a*b;
         return mult;
     }
     public static void main(String[]args){
         Scanner sc =new Scanner(System.in);
         float x=sc.nextFloat();
         float y=sc.nextFloat();
         Float multiplication=multiply(x,y);
         System.out.println(multiplication);
     }
    
}
