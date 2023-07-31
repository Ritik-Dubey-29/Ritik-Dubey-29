 import java.util.Scanner;
 class maxMin {
     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int size=sc.nextInt();
         int []numbers=new int[size];
         for(int i=0;i<size;i++){
             int a=sc.nextInt();
             numbers[i]=a;
            

         }
         int max=Integer.MIN_VALUE;
         int min=Integer.MAX_VALUE;
         for( int  i=0;i<numbers.length;i++){
             if(numbers[i]<min){
                 min=numbers[i];

             }
             if(numbers[i]>max){
                 max=numbers[i];

             }



         }
         System.out.println(min);
         System.out.println(max); 

     }

    
}
