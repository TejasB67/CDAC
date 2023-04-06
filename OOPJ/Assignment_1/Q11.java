/*
11.Accept character from command line and perform below 
operations. Here you can use charAt() method to extract 
character:
a. Check whether entered character is letter or digit. If it 
is digit then print its values as well as code point.
b. If it is character then check whether it is in lowercase? 
If it is in lowercase then convert it into upper case and 
print it well as its code point. If it is in uppercase
then convert it into lower case and print it well as its 
code point.
 

 */
class Q11 {

    public static void main(String[] args) {

        char ch = args[0].charAt(0);

        if((ch>=65 && ch<=90) || (ch>=97 && ch<=122) || (ch>=48 && ch<=57)){
            if((ch>=48 && ch<=57)){
                System.out.println("It is digit");
                System.out.println("Its value is : " + ch + "\n"
                                    + "And Code point is : " + ((int)ch));
            }
            else{
                System.out.print("It is character ");
                if((ch>=97 && ch<=122)){
                    System.out.println("in LowerCase");
                    char ch1=Character.toUpperCase(ch);
                    System.out.println("Converted to Uppercase : "+ ch1 + "\n"+
                                        "And its code point is : "+ ((int)ch1));

                }
                else{
                    System.out.println("in UpperCase");
                    char ch1=Character.toLowerCase(ch);
                    System.out.println("Converted to Lowercase : "+ ch1 + "\n"+
                                        "And its code point is : "+ ((int)ch1));

                }
            }
        }
        
        
    }

}