/*.Write a program to convert state of Byte instance into byte,
short, int. long, float and double.*/

class Q9{
    public static void main(String[] args){
        
        Byte a = new Byte((byte)100);

        byte b1 = a.byteValue();
        System.out.println("byte : "+b1);

        short s = a.shortValue();
        System.out.println("short : "+s);

        int i = a.intValue();
        System.out.println("int : "+i);

        long l = a.longValue();
        System.out.println("long : "+l);

        float f = a.floatValue();
        System.out.println("float : "+f);

        double d = a.doubleValue();
        System.out.println("double : "+d);

        
    }
}