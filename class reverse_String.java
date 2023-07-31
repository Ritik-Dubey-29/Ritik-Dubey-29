import java.util.Scanner;
class reverse_String {
     public static void revString(StringBuilder str){
         System.out.println(str);
         StringBuilder bbc2=new StringBuilder("");
         for(int i=str.length()-1;i>=00;i--){
             bbc2.append(str.charAt(i));
             
         }
         System.out.print(bbc2);
         return;
         
     }

     public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         String abc=sc.nextLine();
         StringBuilder abc2=new StringBuilder(abc);
         revString(abc2);
     }
    
}
