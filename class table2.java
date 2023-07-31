 import java.util.Scanner;
 class table2 {
     public static void table(int a){
         for(int i=1;i<=10;i++){
             int table5=a*i;
             System.out.println(a+"*"+i+"="+table5);
            
         }
         return;
         
         
     }
     public static void main (String[ ]args){
         Scanner sc=new Scanner (System.in);
         int n=sc.nextInt();
         table(n);

     }
    
}
