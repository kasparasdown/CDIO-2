public class Wallet{
    private int coinBalance;

    public Wallet(int initialBalance) {
        this.coinBalance = initialBalance;
    }

    public int getCoinBalance() {
        return coinBalance;
    }

    public void addCoins(int amount) {
        if (amount > 0) {
            coinBalance += amount;
            System.out.println(amount + " coins added to the wallet. Your balance is " + coinBalance);
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void subtractCoins(int amount) {
        if (amount > 0 && amount <= coinBalance) {
            coinBalance -= amount;
            System.out.println(amount + " coins subtracted from the wallet. Your balance is " + coinBalance);
        } else if (amount > 0 && amount >= coinBalance) {
            coinBalance = 0;
            System.out.println("You`re broke.. Your balance is " + coinBalance);
        } else {
            System.out.println("Invalid amount.");
        }
    }
    public static void main(String[] args){
        Wallet p1Wal = new Wallet(1000);

        p1Wal.addCoins(500);
        p1Wal.subtractCoins(4000);
    }
}