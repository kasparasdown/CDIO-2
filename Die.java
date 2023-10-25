import java.util.Random;

public class Die {

        Random rand = new Random();
        int die1 = 0;
        int die2 = 0;
        int die;
        int e = 0;


    public void setDie(int dieSize) {
            this.die = dieSize; 
    }
    public int getDie() {
        return die;
    }
    public int dieRoll(int die) {
        die1 = rand.nextInt(die) + 1;
        die2 = rand.nextInt(die) + 1;
        System.out.println("Die 1: " + die1 + "\nDie 2: " + die2);
        var dieResult = die1 + die2;
        return dieResult;
    }
}