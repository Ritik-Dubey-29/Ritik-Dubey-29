 import  java.util.Scanner;
 class MSFT1 {
     public static void remove_Duplicate(int []array){
         Scanner sc= new Scanner(System.in);
        //  int size=sc.nextInt();
         for(int i=0;i<array.length;i++){
             if(array[i]==array[i+1]){
                 i++;
             }else{
                 System.out.println(array[i]);
             }

         }
     }
     public static void main(String[]args){
         Scanner sc=new  Scanner(System.in);
         int size=sc.nextInt();
         int []sorted=new int[size];
         for(int i=0;i<size;i++){
             System.out.println("Enter input");
             sorted[i]=sc.nextInt();
         }
         remove_Duplicate(sorted);
     }
    
}
