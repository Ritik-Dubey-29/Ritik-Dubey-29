 import java.util.Scanner;
 class Stringoperations {
     public static void main(String[]args){
         Scanner sc=new Scanner (System.in);
         String name=sc.nextLine();
         String surname=sc.nextLine();
         String fullname= name+" "+surname;
         System.out.println(name+" "+surname);
         System.out.println(name.length());
         System.out.println(surname.length());
         System.out.println(fullname.length());
         for(int i=0;i<fullname.length();i++){
             System.out.print(fullname.charAt(i)+" ");
         }
         Character a=sc.next().charAt(0);
         int count=0;
         for (int i=0;i<fullname.length();i++){
             
             if(a==(fullname.charAt(i))){
                 System.out.print(i+" ");
                 count++;
             }
            
             
         }
         System.out.println(count);
     }    
}
