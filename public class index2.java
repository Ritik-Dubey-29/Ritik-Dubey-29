import java.util.Scanner;
public class index2{
    public static int indexMatch(int [] Array){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int size=sc.nextInt();
        for(int j=0;j<size;j++){
            if(Array[j]==x){
                System.out.println(i);
                break;
            }else{
                break;
            }
        }return j;

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []marks=new int [size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the input");
            int a=sc.nextInt();
            marks[i]=a;
        }
        indexMatch(marks);
    }
}
