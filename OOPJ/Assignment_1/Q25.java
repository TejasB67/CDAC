class Q25 {

    public static void main(String[] args) {

        Float f= new Float(100.001f);

        byte b = f.byteValue();
        System.out.println("byte value : "+b);

        short s = f.shortValue();
        System.out.println("short value : "+ s);

        int i = f.intValue();
        System.out.println("int value : "+ i);

        long l = f.longValue();
        System.out.println("long value : "+ l);

        double d = f.doubleValue();
        System.out.println("double value : "+ d);
        
    }

}