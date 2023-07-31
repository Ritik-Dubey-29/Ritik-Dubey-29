 import java.util.Scanner;
 class reverse_String_optimsed {
     public static void rev_string_2(StringBuilder str){
         System.out.println(str);
         for(int i=0;i<str.length()/2;i++){
             int front=i;
             int back=str.length()-1-i;
             str.setCharAt(front,str.charAt(str.length()-1-i));
             str.setCharAt(back,str.charAt(i));

         }
         System.out.println(str);
         return;
     }
     public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         String abc4=sc.nextLine();
         StringBuilder abc5=new StringBuilder(abc4);
         rev_string_2(abc5);

     }
    
}
