class Q26 {

    public static void main(String[] args) {

        float value1 = 1.1f;
        float value2 = 2.1f;
        float max = Float.max(value1, value2);
        System.out.println("Max value : " + max);

        float min = Float.min(value1, value2);
        System.out.println("Min value : " + min);

        float sum = Float.sum(value1, value2);
        System.out.printf("sum  : %1.1f ", sum);
    }

}