class Q16 {

    public static void main(String[] args) {

        // int value into String
        int a= 10;
        String str = String.valueOf(a);
        System.out.println(str);

        // int value into Integer instance
        Integer i = new Integer(a);    //=a
        System.out.println(i);

        //String instance into Integer instance.
        Integer i1= new Integer(str);
        System.out.println(i1);

        // int value into binary, octal and hexadecimal string
        System.out.println(Integer.toBinaryString(a));

        System.out.println(Integer.toOctalString(a));

        System.out.println(Integer.toHexString(a));
        

        
    }

}
/*
16. Write a program to convert:
a. int value into String
b. int value into Integer instance.
c. String instance into Integer instance.
d. int value into binary, octal and hexadecimal string.
 */