public class Wallet{
    private int coinBalance;

    public Wallet(int initialBalance) {
        this.coinBalance = initialBalance;
    }

    public int getCoinBalance() {
        return coinBalance;
    }

    public void addCoins(int amount) {
        coinBalance += amount;
        if (amount > 0 && amount >= coinBalance) {
            coinBalance = 0;
            System.out.println("You`re broke.. Your balance is " + coinBalance);
        }
        else if (amount > 0) {
            System.out.println(amount + " coins added to the wallet. Your balance is " + coinBalance);
        }         
        else if (amount > 0 && amount <= coinBalance) {
            System.out.println(amount + " coins subtracted from the wallet. Your balance is " + coinBalance);
        }  
        else {
            System.out.println("Invalid amount.");
        }
    }
}