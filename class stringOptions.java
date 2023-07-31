class stringOptions {
    public static void main(String[]args){
        StringBuilder str=new StringBuilder("Ritik");
        System.out.println(str);
        System.out.println(str.charAt(0));
      
        str.setCharAt(3, 'b');
        System.out.println(str);
        str.insert(0, 'a');
        System.out.println(str);
        for (int i=0;i<=10;i++){
            str.insert(i, 'n');
            System.out.println(str);
        }
        for (int i=0;i<=10;i++){
            str.delete(0, 1);
            System.out.println(str);
        }



    }
    
}
