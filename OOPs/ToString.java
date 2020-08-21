package OOPs;

public class ToString {
    int x,y;
    // simple constructor
    public ToString(int aX , int aY){
        x = aX;
        y= aY;
    }
    // Creating an object and printing it
    public static void main(String[] args) {
        System.out.println(new ToString(10, 20));
    }
}
// It just prints the class name, an @sign, and the object’s hashCode() value.