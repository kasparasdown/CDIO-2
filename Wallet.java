public class Wallet{
    private int coinBalance;

    public Wallet(int initialBalance) {
        this.coinBalance = initialBalance;
    }

    public int getCoinBalance() {
        return coinBalance;
    }

    public void addCoins(int amount, String language) {
        coinBalance += amount;
        if (amount < 0 && 0 > coinBalance) {
            coinBalance = 0;
            if (language.equals("e")){
                System.out.println("You`re broke.. Your balance is " + coinBalance);
            } else if (language.equals("d")){
                System.out.println("Du er flad..  Din balance er " + coinBalance);
            }
        }
        else if (amount > 0) {
            if (language.equals("e")){
                System.out.println(amount + " coins added to the wallet. Your balance is " + coinBalance);
            } else if (language.equals("d")){
                System.out.println(amount + " mønter er sat i din pengepung. Din balance er " + coinBalance);
            }
        }         
        else if (amount < 0) {
            if (language.equals("e")){
                System.out.println(amount + " coins subtracted from the wallet. Your balance is " + coinBalance);
            } else if (language.equals("d")){
                System.out.println(amount + " mønter er fjernet fra din pengepung. Din balance er " + coinBalance);
            }
        }  
    }
}