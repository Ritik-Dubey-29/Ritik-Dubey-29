 import java.util.Scanner;
 class arrayName{
     public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
         String []names=new String[a];
         for(int i=0;i<a;i++){
             String name=sc.next();
             names[i]=name;
         }
         for(int j=0;j<names.length;j++){
             System.out.println(names[j]);
         }
     }
    
}
