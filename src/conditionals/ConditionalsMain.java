package conditionals;

public class ConditionalsMain {
    public static void main(String[] args) {
        ConditionalExercises conditionals = new ConditionalExercises();
        int operand1 = (int) (Math.random() * 100);
        int operand2 = (int) (Math.random() * 100);
        String operator;
        if (args.length > 0)
            operator = args[0];
        else
            operator = "add";
        double result = conditionals.calculator(operand1, operand2, operator);
        System.out.println("Result is:" + result);
        //Deciding the number specification
        int value = (int) (Math.random() * 100);
        System.out.println("Generated number is: " +value);
        conditionals.printNumberDescription(value);
    }
}
