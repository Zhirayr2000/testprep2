package classes;

public class BoxUsage {
    public static void main(String[] args) {
        Box box1 = new Box(4, 5, 6);
        Box box2 = new Box(7, 8, 9);
        box1.printBox();
        box2.printBox();
        long vol1 = box1.calculateVolume();
        System.out.println("The volume for first box is " + vol1);
        long vol2 = box2.calculateVolume();
        System.out.println("The volume for second box is " + vol2);
    }
}
