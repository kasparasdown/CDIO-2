public class WalletTest {
    
    int coinBalance = 1000;

    public void Wallet(int initialBalance){

        this.coinBalance = initialBalance;
    }

    public int getCoinBalance(){
        return coinBalance;
    }

    public void addCoins(int amount){

        if(amount > 0){
           coinBalance =+ amount;
           System.out.println(amount + " coins have been added to your wallet"); 
        }else{
            System.out.println("Invalid amount");
        }

    }

    public void subtractCoins(int amount){

        if(amount > 0){
           coinBalance =- amount; 
           System.out.println(amount + " coins have been subtracted to your wallet"); 
        }else{
            System.out.println("Invalid amount");
        }
        
    }
    
    public static void main(String[] args){

        WalletTest p1Wallet = new WalletTest();

        p1Wallet.addCoins(650);
        p1Wallet.subtractCoins(50);

    }
}
