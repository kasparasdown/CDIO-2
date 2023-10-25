public class Wallet {
    
    int coinBalance = 1000;

    public void walletSum(int initialBalance){
        this.coinBalance = initialBalance;
    }

    public int getCoinBalance(){
        return coinBalance;
    }

    public void addCoins(int amount){
        coinBalance =+ amount;
        if(amount > 0){
           System.out.println(amount + " coins have been added to your wallet"); 
        }
        else if(amount < 0){
           System.out.println(amount + " coins have been subtracted to your wallet"); 
        }
        else{
            System.out.println("Invalid amount");
        }

    }
}