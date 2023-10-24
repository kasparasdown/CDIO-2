public class Player{
   
    String playerName;
    int playerCoin;

    public void setName(String name) {
        this.playerName = name;
    }   
    public String getName() {
        return playerName;
    }
    public void setCoins(int coin) {
        this.playerCoin = coin;
    }
    public int getCoin() {
        return playerCoin;
    }

}