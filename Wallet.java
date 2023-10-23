public class Wallet{
    int balance = 1000;


    public Wallet(){
        
    }
    public String toString() {
        return "You have " + balance + " coins";
    }


    public static void main(String[] args){
        Wallet player1 = new Wallet();
        System.out.println(player1);

    }
}