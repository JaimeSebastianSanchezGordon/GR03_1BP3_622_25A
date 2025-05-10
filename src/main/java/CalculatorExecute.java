public class CalculatorExecute {
    public static void main(String[] args) {
        System.out.println("CALCULATOR EXECUTE");

        Calculator calculator = new Calculator();
        int addition = calculator.addition(5, 7);
        System.out.println("calculator.addition(5, 7): " + addition);
        int subtraction = calculator.subtraction(5, 7);
        System.out.println("calculator.subtraction(5, 7): " + subtraction);
    }
}
