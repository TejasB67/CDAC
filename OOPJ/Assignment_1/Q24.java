/*
Write a program to convert:
a. float value into String
b. float value into Float instance.
c. String instance into Float instance.
d. float value into hexadecimal string
*/

class Q24 {

    public static void main(String[] args) {

        float a = 3.14f;

        String str = Float.toString(a);
        System.out.println(str);

        Float f = new Float(a);
        System.out.println("Float instance : "+ f);

        Float f1 = new Float(str);
        System.out.println("String instance : "+ f1);

        System.out.println("Float into Hexadecimal String : " + Float.toHexString(a));
        


        
    }

}