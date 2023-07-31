import java.util.Scanner;
class Table {
    public static void main(String[]args){
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            for(int i=1;i<11;i++){
                int table=n*i;
                System.out.println(table);
            }
        }
      
    
    }
    
}
