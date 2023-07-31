 import java.util.Scanner;
 class CircleArea {
     public static float areaCalculate(float a){
         float area=2*a;
         float circle_area=area*22/7;
         System.out.println("Radius of " +a+ " will have an area of "+circle_area);
         return circle_area;
         
     }
     public static void main(String[]args){
         Scanner sc= new Scanner(System.in);
         float r=sc.nextFloat();
         areaCalculate(r);
         
     }
    
}
