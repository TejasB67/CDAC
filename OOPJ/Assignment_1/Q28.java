class Q28 {

    public static void main(String[] args) {

        double d = 10.10101;

        String str = Double.toString(d);
        System.out.println(str);

        Double d1 = new Double(d);
        System.out.println("Double instance : "+ d1);

        Double d2 = new Double(str);
        System.out.println("Double instance : "+ d2);

        // System.out.println("Double into octal String : " + Double.toOctalString(d));
        // System.out.println("Double into binary String : " + Double.toBinaryString(d));
        System.out.println("Double into Hexadecimal String : " + Double.toHexString(d));
    }

}