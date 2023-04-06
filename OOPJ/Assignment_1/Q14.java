class Q14 {

    public static void main(String[] args) {

        Short a = new Short(150);

        short s = a.shortValue();
        System.out.println("short :"+s);

        byte b = a.byteValue();
        System.out.println("byte : "+b);

        int i = a.intValue();
        System.out.println("int"+i);

        long l = a.longValue();
        System.out.println("long"+l);

        float f = a.floatValue();
        System.out.println("float"+f);

       double d = a.doubleValue();
        System.out.println("double"+ d);
    }

}
/*
14.Write a program to convert state of Short instance into byte, 
short, int, long, float and double
*/