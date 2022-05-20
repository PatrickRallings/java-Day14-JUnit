package Box;

public class Box {
    int width;
    int height;

    Box(int w, int h){
        this.width = w;
        this.height = h;
    }

    Box(Box b){
        this.width = b.width;
        this.height = b.height;
    }

    boolean isEqual(Box b){
        return this.width == b.width && this.height == b.height;
    }

    Box duplicate(){
        return new Box(this.width, this.height);
    }

    static boolean isTwoObjectsEqual(Box b1, Box b2){
        return b1.width == b2.width && b1.height == b2.height;
    }
    void display(){
        System.out.println("Width is "+this.width+" and height is "+this.height+".");
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
