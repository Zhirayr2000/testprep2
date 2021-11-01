package classes;

public class Box {
    int length;
    int width;
    int height;

    public Box(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public long calculateVolume() {
        return (long) this.length * this.width * this.height;
    }

    public void printBox() {
        System.out.println("Box is " + this.length + "x" + this.width + "x" + this.height);
    }
}
