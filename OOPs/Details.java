package OOPs;

public class Details {
    private int mathScore;

    public Details(){
        this.mathScore =(int)((Math.random()*101)+1);
    }

    public int getMathScore(){
        return mathScore;
    }

    public void getMathScore(int mathScore)
    {
        this.mathScore = mathScore;
    }
}