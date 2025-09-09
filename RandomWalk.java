
public class RandomWalk {
    private int x;
    private int y;
    private int maxSteps;
    private int currentSteps;
    private int squareSize;


    public RandomWalk (int max, int edge){
        maxSteps=max;
        squareSize=edge;
    }
    public RandomWalk (int max, int edge, int startX, int startY){
        maxSteps=max;
        squareSize=edge;
        x=startX;
        y=startY;
    }

    void takeStep(){

    }









    //to string
    public String toString(){
        String word="X: "+x+"\nY: "+y+"\nMax Steps: "+maxSteps+"\nCurrent Steps: "+currentSteps+"\nSquare Size: "+squareSize;
        return word;
    }
}