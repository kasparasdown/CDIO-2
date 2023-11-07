import java.util.Scanner;

public class DiceGame {
    public static void runGame() {
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

        //Adding players with names and a wallet
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
            int dieInput = Integer.parseInt(scanner.nextLine());
            if ((dieInput >= 2 && dieInput <= 11)){
                dices.dieSize = dieInput;
                break;
            }
            if (language.equals("e")){
                System.out.println("Wrong input! Please enter a number between 1 and 11.");
            } else if (language.equals("d")){
                System.out.println("Forkert tast! Skriv et nummer mellem 1 og 11.");
            }
            
        }
        if (language.equals("e")){
            System.out.println("your die size is: "+dices.getDie());
        } else if (language.equals("d")){
            System.out.println("terningernes sider er sat til: "+dices.getDie());
        }
        


        // Player 1 starts
        p1.currentPlayer = true;
        p2.currentPlayer = false;
        boolean runGame = true;
        while (runGame) {
            Player currentPlayer = p1.currentPlayer ? p1 : p2;
        
            if (currentPlayer.currentPlayer) {
                System.out.println("\nIt's your turn now " + currentPlayer.getName() + ". Roll the dice by typing 'r':");
                if ("r".equalsIgnoreCase(scanner.nextLine())) {
                    int rollResult = dices.dieRoll();
                    int tileValue = Tile.rollSwitch(rollResult);
                    currentPlayer.addToWallet(tileValue);
        
                    if (rollResult != 10) {
                        currentPlayer.currentPlayer = false;
                        if (currentPlayer == p1) {
                            p2.currentPlayer = true;
                        } else {
                            p1.currentPlayer = true;
                        }
                    }
                } else {
                    System.out.println("Not valid command, please type 'r' to roll.");
                }
            }
            //Wincon
            if (p1Wal.getCoinBalance() >= 3000) {
                runGame = false;
                if (language.equals("e")){
                    System.out.println("Congrats "+p1.name+"!! You won the game!");
                } else if (language.equals("d")){
                    System.out.println("Tillykke " + p1.name + "!! Du har vundet spillet!");
                }
            }
            if (p2Wal.getCoinBalance() >= 3000) {
                runGame = false;
                if (language.equals("e")){
                    System.out.println("Congrats "+p2.name+"!! You won the game!");
                } else if (language.equals("d")){
                    System.out.println("Tillykke " + p2.name + "!! Du har vundet spillet!");
                }
            }
        }
        scanner.close();
    }
    
}

