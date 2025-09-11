import java.util.Random;
public class DrunkenWalk {
    private int x;
    private int y;
    private int maxSteps;
    private int currentSteps;
    private int squareRadius;
    private int fellOff;
    private int amtDrunks;


    public DrunkenWalk (int max, int edge, int drunks){
        maxSteps=max;
        squareRadius=edge;
        amtDrunks=drunks;
    }
    public DrunkenWalk (int max, int edge, int startX, int startY){
        maxSteps=max;
        squareRadius=edge;
        x=startX;
        y=startY;
    }

    void drunkWalk(){
        for(int i = 0; i < amtDrunks;i++){
            RandomWalk tempWalk = new RandomWalk(maxSteps,maxSteps);
            tempWalk.walk();
            System.out.println(tempWalk);
        }
    }