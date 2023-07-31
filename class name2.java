import java.util.Scanner;
class name2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<m;j++){
            if(j==1||i==n||j==n){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }System.out.println();
    }
    
}
}
