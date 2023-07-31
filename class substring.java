 import java.util.Scanner;
 class substring {
     public static void SubstringCalc(String a,int b,int c){
        if(b>a.length() &&c >a.length()){
            System.out.println("Invalid choice");
 
        }else if(b<a.length() && c<=a.length()){
        String subs=a.substring(b,c);
         System.out.println(subs);
        }else{
            System.out.println("Invalid choice");
        }

     }
    
     public static void main(String[]args){
         Scanner sc=new Scanner (System.in);
         String sentence=sc.nextLine();
         int a=sc.nextInt();
         int b=sc.nextInt();
         SubstringCalc(sentence,a,b);
     }
    }
