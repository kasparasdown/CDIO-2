import java.util.Random;

public class Die {

        Random rand = new Random();
        int die1 = 0;
        int die2 = 0;
        int dieSize;
        int e = 0;


    public Die(int dieSize) {
            this.dieSize = dieSize; 
    }
    public int getDie() {
        return dieSize;
    }
    public int dieRoll() {
        die1 = rand.nextInt(this.dieSize) + 1;
        die2 = rand.nextInt(this.dieSize) + 1;
        System.out.println("Die 1: " + die1 + "\nDie 2: " + die2);
        var dieResult = die1 + die2;
        
        return dieResult;
    }
}