 class Half Pyramid {
     public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
         int b=sc.nextInt();
         for(int i=0;i<a;i++){
             for(j=0;j<b;j++){
                 if(j==i){
                     System.out.print("*");
                 }else{
                     system.out.print(" ");
                 }
             }
             System.out.println();
         }
     }
    
}
