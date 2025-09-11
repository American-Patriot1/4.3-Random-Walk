public class Main {
    public static void main(String[] args) {
        // RandomWalk walk1 = new RandomWalk(10,5);
        // System.out.println(walk1);

        // for(int i=0;i<5;i++){
        //     walk1.takeStep();
        //     System.out.println("X: "+walk1.getX()+" Y: "+walk1.getY());
        // }

        // RandomWalk walk1 = new RandomWalk(200,10);
        // walk1.walk();
        // System.out.println(walk1);

        DrunkenWalk walk1 = new DrunkenWalk(200,10,100);
        walk1.drunkWalk();
    }
}