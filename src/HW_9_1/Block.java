package HW_9_1;

public class Block {
    private int width;
    private int length ;
    private int height ;

    // Constructor
    public Block (int[] array) {
        if (array.length != 3) {
            System.out.println("Input doesn't have 3 elements");
            return;
        }
        this.width = array[0];
        this.length = array[1];
        this.height = array[2];
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    // Volume
    public int getVolume() {
        return width * length * height;
    }

    // SurfaceArea
    public int getSurfaceArea() {
        return 2 * ((width * length) + (length * height) + (width * height));
    }
}
