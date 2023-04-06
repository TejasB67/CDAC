class Q29 {

    public static void main(String[] args) {

        Double d= new Double(100.001f);

        byte b = d.byteValue();
        System.out.println("byte value : "+b);

        short s = d.shortValue();
        System.out.println("short value : "+ s);

        int i = d.intValue();
        System.out.println("int value : "+ i);

        long l = d.longValue();
        System.out.println("long value : "+ l);

        float f = d.floatValue();
        System.out.println("double value : "+ f);
        
    }

}