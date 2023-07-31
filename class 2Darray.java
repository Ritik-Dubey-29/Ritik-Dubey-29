class 2Darray {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int [][] 2Darr=new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.println("Enter the no");
                int c=sc.nextInt();
                2Darr[j]=c;

            }
        }
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.println(2Darr(j));
            }
        }
    }   
}
