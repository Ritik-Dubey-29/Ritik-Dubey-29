import java.util.Scanner;
 class PatternsBasics {
     public static void main(String[]args){
         Scanner sc= new Scanner (System.in);
         int n= sc.nextInt();
         int b=sc.nextInt();
         for(int i=0;i<n;i++){
             for(int j=0;j<b;j++){
                 System.out.print("*");
             }
             System.out.println();
             
         }
     }
    
}
