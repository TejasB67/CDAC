/*17. Write a program to convert state of Integer instance into 
byte, short, int, long, float and double.*/

class Q17 {    

    public static void main(String[] args) {
        Integer a = new Integer(100);
        
        byte b= a.byteValue();
        System.out.println("byte : "+b);

        short s = a.shortValue();
        System.out.println("short : "+s);

        int i= a.intValue();
        System.out.println("int : "+i);

        long l = a.longValue();
        System.out.println("long : "+l);
        
        float f = a.floatValue();
        System.out.println("float : "+f);

        double d = a.doubleValue();
        System.out.println("double : "+d);
        
    }

}