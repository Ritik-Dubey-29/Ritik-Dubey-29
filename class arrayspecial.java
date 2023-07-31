import java.util.Scanner;
class arrayspecial{
     public static void arrayIndex(int [][] arr){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter for function");
         int a=sc.nextInt();
         int b=sc.nextInt();
         System.out.println("Enter the number to be checked");
         int c=sc.nextInt();
         int count=0;
         for(int i=0;i<a;i++){
             for(int j=0;j<b;j++){
                 if(c==arr[i][j]){
                     System.out.println(i+" "+j);
                     count++;


                 }
             }
         }System.out.println(count);
     }
     public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
         int b=sc.nextInt();
         int [][] indexArray=new int [a][b];
         for(int i=0;i<a;i++){
             for(int j=0;j<b;j++){
                 indexArray[i][j]=sc.nextInt();            
             }
         }
         arrayIndex(indexArray);
     }
    
}
