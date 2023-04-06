class Q20 {

    public static void main(String[] args) {

        long a = 100L;
        
        //long value into String
        String str = String.valueOf(a);
        System.out.println("String : "+str);
        
       //long value into Long instance.
        Long l = new Long(a);
        System.out.println("Long instance : "+l);

        //String instance into Long instance.
        Long l1 = new Long(str);
        System.out.println("Long Instance : "+l1);

        System.out.println("Binary  :   "+Long.toBinaryString(a));

        System.out.println("HexaDecimal :   "+Long.toHexString(a));

        System.out.println("Octal   :   "+Long.toOctalString(a));



        

    }

}
/*
Write a program to convert:
a. long value into String
b. long value into Long instance.
c. String instance into Long instance.
d. long value into binary, octal and hexadecimal string.
 */