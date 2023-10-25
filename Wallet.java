public class Wallet {
    
    int coinBalance = 1000;

    public Wallet(int coinBalance){
        this.coinBalance = coinBalance;
    }

    public int getCoinBalance(){
        return coinBalance;
    }

    public void addCoins(int amount){
        this.coinBalance =+ amount;
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