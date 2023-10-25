public class Player{
   
    String name;
    Wallet coin = new Wallet(1000);
    boolean isTurn;

    public Player(String name, Wallet coin, boolean isTurn) {
        this.name = name;
        this.coin = coin;
        this.isTurn = isTurn;
    }
    public String getName() {
        return name;
    }
    public int getCoin() {
        return coin.getCoinBalance();
    }
}