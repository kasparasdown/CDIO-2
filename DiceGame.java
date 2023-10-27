import java.util.Scanner;

class DiceGame {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        //Choosing language
        Language languageSelector = new Language();

        // Call the setLanguage method to allow the user to choose a language.
        languageSelector.setLanguage(scanner);

        // Get the selected language and use it.
        String language = languageSelector.getLanguage();

        if (language.equals("d")) {
            System.out.println("You selected Danish.");
            // Perform actions in Danish language.
        } else if (language.equals("e")) {
            System.out.println("You selected English.");
            // Perform actions in English language.
        } else {
            System.out.println("Invalid language selection.");
        }

        //Adding players with names with a wallet
        Wallet p1Wal = new Wallet(1000);
        Wallet p2Wal = new Wallet(1000);
        Player p1 = new Player("", p1Wal);
        Player p2 = new Player("", p2Wal);
        if (language.equals("e")){
            System.out.println("Please Enter Player 1's Name: ");
        } else if (language.equals("d")){
            System.out.println("Hvad hedder spiller 1: ");
        }
        
        String p1name = scanner.nextLine();
        p1.name = p1name;
        if (language.equals("e")){
            System.out.println("Please Enter Player 2's Name: ");
        } else if (language.equals("d")){
            System.out.println("Hvad hedder spiller 2: ");
        }
        String p2name = scanner.nextLine();
        p2.name = p2name;
        if (language.equals("e")){
            System.out.println("Welcome "+p1.getName()+" and "+p2.getName()+". Let the game begin!");
        } else if (language.equals("d")){
            System.out.println("Velkommen "+p1.getName()+" og "+p2.getName()+". Lad spillet begynde!");
        }
        
        
        
        //Adding and choosing Die
        Die dices = new Die(0);
        if (language.equals("e")){
            System.out.println("\nWrite a number between 1 and 11 to choose the dice: ");
        } else if (language.equals("d")){
            System.out.println("\nSkriv et nummer fra 1 til 11 for at vælge, hvor mange sider terningerne skal have: ");
        }
        
        while (true){
            int dieInput = scanner.nextInt();
            if ((dieInput >= 2 && dieInput <= 11)){
                dices.dieSize = dieInput;
                break;
            }
            if (language.equals("e")){
                System.out.println("Wrong input! Please enter a number between 1 and 11.");
            } else if (language.equals("d")){
                System.out.println("Forkert tast! Vær sød at skrive et nummer mellem 1 og 11.");
            }
            
        }
        if (language.equals("e")){
            System.out.println("your die size is: "+dices.getDie());
        } else if (language.equals("d")){
            System.out.println("terningernes sider er sat til: "+dices.getDie());
        }
        

        //Players turn
        boolean runGame = true;
        //Player 1 starts
        p1.currentPlayer = true;
            while (runGame) {
                if (p1.currentPlayer) {
                    if (language.equals("e")){
                        System.out.println("\nIt's your turn now " + p1.getName() + ". Roll the dice by typing 'r':");
                    } else if ( language.equals("d")){
                        System.out.println("\nDet er " + p1.getName() + " tur. rul terningerne ved at trykke 'r':");
                    }
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
                                int rollResult  = dices.dieRoll();  //Rolling or chosen dices
                                int tileValue = Tile.rollSwitch(rollResult); //Result from dice, pull Tile value
                                p2Wal.addCoins(tileValue);  //Adding points to the player
                                if(rollResult != 10) {
                                p1.currentPlayer = true;
                                }
                        }
                        else {
                        System.out.println("Not valid command, please type r to roll.");
                    }
            }
            //Wincondition
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

