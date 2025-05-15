public class Calculator{

    
    private double num1;
    private double num2;

    //constructor making use of the 'this' keyword
    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    //method to add
    public double add(){
        return this.num1 + this.num2;
    }

    //method to subtract
    public double subtract(){
        return this.num1 - this.num2;
    }

    //method to multiply
    public double multiply(){
        return this.num1 * this.num2;
    }

    //method to divide
    public double divide(){
        if (this.num2 == 0) {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
        return this.num1 / this.num2;

    }
    
    public static void main(String[] args) {
        //the below are test integers
        int num3 = 15;
        int num4 = 5;

    //Objects
    Calculator cal1 = new Calculator(num3, num4);
    Calculator cal2 = new Calculator(6.5, 2.4);

    //Integer calculations
    System.out.println("Integer Calculations");
    System.out.println("Addition: " + cal1.add());
    System.out.println("Subtraction: " + cal1.subtract());
    System.out.println("Multiplication: " + cal1.multiply());
    System.out.println("Division: " + cal1.divide());

    //Double Calculations
    System.out.println("\nDouble Calculations");
    System.out.println("Addition: " + cal2.add());
    System.out.println("Subtraction: " + cal2.subtract());
    System.out.println("Multiplication: " + cal2.multiply());
    System.out.println("Division: " + cal2.divide());
}

}


