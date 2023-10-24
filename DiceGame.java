import java.util.Scanner;

class DiceGame {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        
        //Adding players with names.
        Player p1 = new Player();
        Player p2 = new Player();


        
        System.out.println("Please Enter Player 1's Name");
        String p1name = scanner.nextLine();
        p1.setName(p1name);
        System.out.println("Please Enter Player 2's Name");
        String p2name = scanner.nextLine();
        p2.setName(p2name);
        System.out.println("Welcome "+p1.getName()+" and "+p2.getName()+". Let the game begin!");
        System.out.print("\nWrite a number between 1 and 11 to choose the dice: ");
        


        scanner.close();
    }
}