 import java.util.Scanner;
 class ComparingStrings {
     public static void compare(String a,String b){
         if(a.compareTo(b)==0){
             System.out.println("Strings are equal");
         }else{
             System.out.println("Strings are not equal");
         }
         return;

     }
     public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         String name=sc.next();
         String surname=sc.next();
         compare(name,surname);
     }
    
}
