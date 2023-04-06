class Q13 {

    public static void main(String[] args) {

        short a =200;

        String str = String.valueOf(a);
        System.out.println("short----->String : "+ str);

        Short s1= new Short(a);
        System.out.println("short value-----> Short instance"+s1);

        Short s2 = new Short(str);
        System.out.println("String instance-----> short instance : "+ s2);
    }

}

/*
    13.Write a program to convert:
    a. short value into String
    b. short value into Short instance.
    c. String instance into Short instance.
 */