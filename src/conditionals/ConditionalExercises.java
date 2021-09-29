package conditionals;

public class ConditionalExercises {
    public double calculator(double op1, double op2, String operator) {
        System.out.println(op1 + " " + operator + " " + op2);
        switch (operator) {
            case "add":
                return op1 + op2;
            case "subtract":
                return op1 - op2;
            case "multiply":
                return op1 * op2;
            case "division":
                return op2 == 0 ? op1 : op1 / op2;
            default:
                return -1;
        }
    }

    public  boolean isOdd(int value) {
        return value % 2 == 0;
    }
    public  void printNumberDescription(int value)
    {
        if(value>=0 && value<10)
            System.out.println("It is a digit");
        else if(value>=10 && value<100)
        {
            if(isOdd(value))
                System.out.println("It is a two-digit even number");
            else
                System.out.println("It is a two-digit odd number");
        }
        else {
            System.out.println("Out of bounds");
        }
    }
}
