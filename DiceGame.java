import java.util.Scanner;

class DiceGame {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        
        Player p1 = new Player();
        Player p2 = new Player();
        Die dices = new Die();


        //Adding players with names
        System.out.println("Please Enter Player 1's Name");
        String p1name = scanner.nextLine();
        p1.setName(p1name);
        System.out.println("Please Enter Player 2's Name");
        String p2name = scanner.nextLine();
        p2.setName(p2name);
        System.out.println("Welcome "+p1.getName()+" and "+p2.getName()+". Let the game begin!");
        
        
        //Choosing Die Size
        System.out.println("\nWrite a number between 1 and 11 to choose the dice: ");
        while (true){
            int dieInput = scanner.nextInt();
            if ((dieInput >= 2 && dieInput <= 11)){
                dices.setDie(dieInput);
                break;
            }
            System.out.println("Wrong input! Please enter a number between 1 and 11.");
        }
        System.out.println("your die size is: "+dices.getDie());

        //Choosing language
        Language languageSelector = new Language();

        // Call the setLanguage method to allow the user to choose a language.
        languageSelector.setLanguage(scanner);

        // Get the selected language and use it.
        String selectedLanguage = languageSelector.getLanguage();

        if (selectedLanguage.equals("d")) {
            System.out.println("You selected Danish.");
            // Perform actions in Danish language.
        } else if (selectedLanguage.equals("e")) {
            System.out.println("You selected English.");
            // Perform actions in English language.
        } else {
            System.out.println("Invalid language selection.");
        }


        
        scanner.close();
    }
}
