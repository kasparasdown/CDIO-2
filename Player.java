public class Player{
   
    String name;
    Wallet coin = new Wallet(1000);
    public boolean currentPlayer;    

    public Player(String name, Wallet coin) {
        this.name = name;
        this.coin = coin;
    }
    public String getName() {
        return name;
    }
    public int getCoin() {
        return coin.getCoinBalance();
    }
    public void addToWallet(int tileValue) {
        if (currentPlayer) {
            coin.addCoins(tileValue);
        }
    }
}