import java.util.Scanner;
class Switch {
     public static void main (String[]args){
         Scanner sc= new Scanner(System.in);
         int Button=sc.nextInt();
         switch (Button) {
             case 1:System.out.println("CAT");
                 
                 break;
             case 2:System.out.println("Coding");
                 break;
             case 3:System.out.println("IIT");
                 break;
             default:System.out.println("Invalid selection");
                 break;
         }
     }
    
}
