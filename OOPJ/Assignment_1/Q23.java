/*
.Write a program to perform below operations on float type to 
get: 
a. The number of bits used to represent a float value
b. The number of bytes used to represent a float value
c. The minimum value a float
d. The maximum value a float
 */
class Q23 {

    public static void main(String[] args) {

        System.out.println("No. of bits req to represent float : "+ Float.SIZE);
        System.out.println("No. of bytes used : " + Float.BYTES);
        System.out.println("MAX VALUE : " + Float.MAX_VALUE);
        System.out.println("MIN VALUE : " + Float.MIN_VALUE);        
    }

}