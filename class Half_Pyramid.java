 import java.util.Scanner;
 class Half_Pyramid {
     public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
         //int b=sc.nextInt();
         for(int i=0;i<a;i++){
             for(int j=0;j<=i;j++){
                // //  if(j==i){
                // //      System.out.print("*");
                // //  }else{
                // //      System.out.print(" ");
                // //  }
                System.out.print("*");
             }
             System.out.println();
         }
     }
    
}
