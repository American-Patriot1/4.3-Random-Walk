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

    void takeStep(){
        Random random1 = new Random();
        int int1 = random1.nextInt(4);
        int moveBy = 1;
        currentSteps += moveBy;
        switch (int1) {
            case 0:
                x+=moveBy;
                break;
            case 1:
                x-=moveBy;
                break;
            case 2:
                y+=moveBy;
                break;
            case 3:
                y-=moveBy;
                break;
            default:
                throw new AssertionError();
        }
    }

    boolean moreSteps(){
        if (currentSteps<=maxSteps){
            return true;
        }else{
            return false;
        }
    }

    boolean inBounds(){
        if ((x>=-1*squareRadius) && (x<=squareRadius) && ((y>=-1*squareRadius) && (y<=squareRadius))){
            return true;
        }else{
            return false;
        }
    }

    void walk(){
        if ((maxSteps-currentSteps)!=0){
            int tempX=x;
            int tempY=y;
            takeStep();
            if (moreSteps()==true){
                if(inBounds()==false){
                    fellOff+=1;
                    x=tempX;
                    y=tempY;
                }
                walk();
            }
        }
    }
    void drunkWalk(){
        for(int i = 0; i < amtDrunks;i++){
            RandomWalk tempWalk = new RandomWalk(maxSteps,maxSteps);
            tempWalk.walk();
            System.out.println(tempWalk);
        }
    }






    //getters
    public Integer getX(){
        return this.x;
    }
    public Integer getY(){
        return this.y;
    }

    //to string
    public String toString(){
        String word="X: "+x+"\nY: "+y+"\nMax Steps: "+maxSteps+"\nCurrent Steps: "+currentSteps+"\nSquare Size: "+squareRadius+"\nFell Off: "+fellOff;
        return word;
    }
}