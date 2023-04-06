class Q21 {

    public static void main(String[] args) {

        Long l = new Long(9421636358L);

        //byte
        byte b = l.byteValue();
        System.out.println(b);

        short s = l.shortValue();
        System.out.println(s);

        int i = l.intValue();
        System.out.println(i);

        long LONG = l.longValue();
        System.out.println(LONG);

        float f = l.floatValue();
        System.out.println(f);
        
        double d = l.doubleValue();
        System.out.println(d);
    }

}
/*
Write a program to convert state of Long instance into byte, 
short, int, long, float and double.

*/