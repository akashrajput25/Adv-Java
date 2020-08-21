package OOPs;

public class ToString {
    int x,y;
    // simple constructor
    public ToString(int aX , int aY){
        x = aX;
        y= aY;
    }
    public static void main(String[] args) {
        System.out.println(new ToString(10, 20));
    }
}