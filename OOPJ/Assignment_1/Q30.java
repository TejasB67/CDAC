class Q30 {

    public static void main(String[] args) {

        double value1 = 1.1;
        double value2 = 2.12;
        
        double max = Double.max(value1, value2);
        System.out.println("Max value : " + max);

        double min = Double.min(value1, value2);
        System.out.println("Min value : " + min);

        double sum = Double.sum(value1, value2);
        System.out.println("sum  : "+ sum);
    }

}