/*15. Write a program to perform below operations on int type to 
get:
a. The number of bits used to represent a integer value
b. The number of bytes used to represent a integer value
c. The minimum value a integer
d. The maximum value a integer*/
class Q15 {

    public static void main(String[] args) {
        System.out.println("For Integer\n"+ "===================" );
        
        System.out.println("No. of bits req : "+ Integer.SIZE);

        System.out.println("Bytes : "+ Integer.BYTES);

        System.out.println("Min Value : "+ Integer.MIN_VALUE);

        System.out.println("Max Value : "+ Integer.MAX_VALUE);
        
        
        
    }

}