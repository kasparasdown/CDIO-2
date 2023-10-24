public class Wallet{
    int coins = 1000;


    public Wallet(){
        if(coins < 0){
            coins = 0;
        }
    }
    public String toString() {
        return "You have " + coins + " coins";
    }

    public static void main(String[] args){
        Wallet player1 = new Wallet();
        System.out.println(player1);
    
    }
}