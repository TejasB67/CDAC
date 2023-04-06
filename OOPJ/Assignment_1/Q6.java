class Q6{
    public static void main(String[] args){
        boolean b= true;
        
        String str = String.valueOf(b);
        System.out.println(str);

        Boolean b1= new Boolean(b);
        System.out.println(b1);

        String s1="false";
        boolean b4= Boolean.parseBoolean(s1);
        System.out.println(b4);
        
        String s2= "true";
        Boolean b3= new Boolean(s2);
        System.out.println(b3);



    }
}