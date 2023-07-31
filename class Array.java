 import java.util.Scanner;
 class Array {
     public static void main(String[]args){
         int []marks=new int[4];
         Scanner sc=new Scanner(System.in);
         for(int i=0;i<4;i++){
            System.out.println("Enter the number"); 
            int a=sc.nextInt();
             marks[i]=a;
         }
         for(int i=0;i<4;i++){
             System.out.println(marks[i]);
         }

     }
    
}
