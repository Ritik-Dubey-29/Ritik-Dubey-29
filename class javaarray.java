import java.util.Scanner;
class javaarray {
    public static void main(String []args){
        try (Scanner sc = new Scanner(System.in)) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int [][] arr=new int[a][b];
            for(int i=0;i<a;i++){
                for(int j=0;j<b;j++){
                    System.out.println("Enter the no");
                    int c=sc.nextInt();
                    arr[i][j]=c;

                }
            }
            for(int i=0;i<a;i++){
                for(int j=0;j<b;j++){
                    System.out.println(arr[i][j]);
                }
            }
        }
    }   
}
