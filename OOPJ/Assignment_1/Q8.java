class Q8{
    public static void main(String[] args){
        byte b= 100;
        System.out.println("byte : "+b);

        String str = String.valueOf(b);
        System.out.println("byte into String : "+ str );

        Byte b1 = new Byte(str);
        System.out.println("String instance into Byte instance : "+b);
        
        Byte b2=Byte.valueOf(b);   //= b;
        System.out.println("byte value into Byte instance : "+b); 

    }
}