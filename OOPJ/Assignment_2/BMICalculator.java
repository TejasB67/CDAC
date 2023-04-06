import java.util.*;
class BMICalculator {


    private double height;
    private double weight;
    
    BMICalculator(){

    }

    BMICalculator(double height, double weight){
        this.height = height;
        this.weight = weight;
    }

    public void setHeight(double height){
         this.height = height;
    }
    public double getHeight(){
        return this.height;
    }
    
    public void setWeight(double weight){
        this.weight = weight;
    }
    public double getWeight(){
        return this.weight;
    }

    Double calculateBMI(){
       double BMI = (this.weight / (this.height * this.height));
       return BMI;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Height : ");
        double height= sc.nextDouble();

        System.out.println("Enter Height : ");
        double height= sc.nextDouble();

        BMICalculator bmiCalculator = new BMICalculator(height, weight);

        double BMI = bmiCalculator.calculateBMI();
        System.out.println("BMI is" + BMI);
    }

}