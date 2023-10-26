import java.util.Scanner;

class DiceGame {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        //Adding players with names with a wallet
        Wallet p1Wal = new Wallet(1000);
        Wallet p2Wal = new Wallet(1000);
        Player p1 = new Player("", p1Wal);
        Player p2 = new Player("", p2Wal);
        System.out.println("Please Enter Player 1's Name");
        String p1name = scanner.nextLine();
        p1.name = p1name;
        System.out.println("Please Enter Player 2's Name");
        String p2name = scanner.nextLine();
        p2.name = p2name;
        System.out.println("Welcome "+p1.getName()+" and "+p2.getName()+". Let the game begin!");
        
        
        //Adding and choosing Die
        Die dices = new Die(0);
        System.out.println("\nWrite a number between 1 and 11 to choose the dice: ");
        while (true){
            int dieInput = scanner.nextInt();
            if ((dieInput >= 2 && dieInput <= 11)){
                dices.dieSize = dieInput;
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

        //Players turn
        boolean runGame = true;
        //Player 1 starts
        p1.currentPlayer = true;
            while (runGame) {
                if (p1.currentPlayer) {
                    System.out.println("\nIt's your turn now " + p1.getName() + ". Roll the dice by typing 'r':");
                        if ("r".equalsIgnoreCase(scanner.nextLine())) {
                                int rollResult  = dices.dieRoll();
                                int tileValue = Tile.rollSwitch(rollResult);
                                p1Wal.addCoins(tileValue);
                                if(rollResult != 10) {
                                p1.currentPlayer = false;
                                }
                        }
                        else {
                        System.out.println("Not valid command, please type r to roll.");
                    }
                }
                //Player 2's turn
                else {
                    System.out.println("\nIt's your turn now " + p2.getName() + ". Roll the dice by typing 'r':");
                        if ("r".equalsIgnoreCase(scanner.nextLine())) {
                                int rollResult  = dices.dieRoll();
                                int tileValue = Tile.rollSwitch(rollResult);
                                p2Wal.addCoins(tileValue);
                                if(rollResult != 10) {
                                p1.currentPlayer = true;
                                }
                        }
                        else {
                        System.out.println("Not valid command, please type r to roll.");
                    }
            }
            if (p1Wal.getCoinBalance() >= 3000) {
                runGame = false;
                System.out.println("Congrats "+p1.name+"!! You won the game!");
            }
            if (p2Wal.getCoinBalance() >= 3000) {
                runGame = false;
                System.out.println("Congrats "+p2.name+"!! You won the game!");
            }
        }
        scanner.close();
    }
}

