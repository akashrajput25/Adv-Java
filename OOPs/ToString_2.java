package OOPs;

public class ToString_2 {
    int x,y;
    public ToString_2(int aX , int aY){
        x = aX;
        y = aY;
    }

    public String ToString_2() {
        return "ToString_2 [" +x+ ","+y+ "]";
    }
    public static void main(String[] args) {
        System.out.println(new ToString_2(10, 20));
    }
}