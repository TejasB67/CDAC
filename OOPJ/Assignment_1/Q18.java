/*
18. Write a program to find minimum and maximum number as well as 
to add two integer numbers using methods of Integer.

 */
class  Q18 {
 
    public static void main(String[] args) {
        int value1 = 10;
        int value2 = 10;

        int max = Integer.max(value1, value2);
        System.out.println("Max_Value : "+ max);

        int min = Integer.min(value1, value2);
        System.out.println("Min_Value : "+min);
        
        int a= Integer.sum(10, 20);
        System.out.println("sum : "+a);

    }
 
}