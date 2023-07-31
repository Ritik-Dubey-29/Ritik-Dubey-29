 import java.util.Scanner;
 class Average{
     public static float averageNumbers(float a, float b,float c){
         float sum=a+b+c;
         float average=sum/3;
         System.out.println("Average of "+a+" , "+b+" & "+c +" is "+average );
         return average;
     }
     public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         float x=sc.nextFloat();
         float y=sc.nextFloat();
         float z=sc.nextFloat();
         averageNumbers(x,y,z);
     }
    
}
