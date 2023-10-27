public class Tile {

    public static int rollSwitch(int tile, String language){
        switch (tile) {
            case 2:
            if (language.equals("e")){
                System.out.println("You reached the Coin Tower, 250 coins is added to your wallet");
            } else if (language.equals("d")){
                System.out.println("Du har nået Penge Tårnet, du får 250 mønter til din pengepung.");
            }
            return 250;
            case 3:
            if (language.equals("e")){
                System.out.println("Oh no.. you fell in a crater and lost 100 coins.");
            } else if (language.equals("d")){
                System.out.println("åhh nej.. Du faldt i hullet og tabte 100 mønter.");
            }
            return -100;
            case 4:
            if (language.equals("e")){
                System.out.println("You found the palace, 100 coins is added to your wallet.");
            } else if (language.equals("d")){
                System.out.println("Du fandt paladset, 100 mønter er tilføjet til din pengepung.");
            }
            return 100;
            case 5:
            if (language.equals("e")){
                System.out.println("It`s cold out here in the desert you lost 20 coins");
            } else if (language.equals("d")){
                System.out.println("Det er koldt her i ørkenen, du mister 20 mønter.");
            }
            return -20;
            case 6:
            if (language.equals("e")){
                System.out.println("You reached the Walled City, 180 coins is added to your wallet");
            } else if (language.equals("d")){
                System.out.println("Du er nået den befæstede by, du har fået 180 mønter til din pengepung.");
            }
            return 180;
            case 7:
            if (language.equals("e")){
                System.out.println("Welcome to the Monastery, stay quiet for a while and eat some rice");
            } else if (language.equals("d")){
                System.out.println("Velkommen til klostret, vær stille og spis noget ris.");
            }
            return 0;
            case 8:
            if (language.equals("e")){
                System.out.println("You accidentally walked into the Black Cave, you lose 70 coins");
            } else if (language.equals("d")){
                System.out.println("Du kom ved et uheld til at gå ind i den Sorte Hule, du mister 70 mønter.");
            }
            return -70;
            case 9:
            if (language.equals("e")){
                System.out.println("Congrats you found the Mountain Huts, 60 coins is added to your wallet");
            } else if (language.equals("d")){
                System.out.println("Tillykke! du fandt Bjerghytterne, du får 60 mønter.");
            }
            return 60;
            case 10:
            if (language.equals("e")){
                System.out.println("Don`t go near the Werewall, you lose 80 coins - roll again");
            } else if (language.equals("d")){
                System.out.println("Gå ikke tæt på varvæggen, du mister 80 mønter og får en ny tur");
            }
            return -80;
            case 11:
            if (language.equals("e")){
                System.out.println("Good luck getting out of this pit, you lose 50 coins");
            } else if (language.equals("d")){
                System.out.println("Held og lykke med at komme op af hullet, du mister 50 mønter");
            }
            return -50;
            case 12:
            if (language.equals("e")){
                System.out.println("Hey lucky luke you struck gold in the Goldmine,  650 coins is added to your wallet");
            } else if (language.equals("d")){
                System.out.println("Jackpot, du fandt guldbjerget, du får 650 mønter for din indsats");
            }
            return +650;
            default:
            if (language.equals("e")){
                System.out.println("Roll again");
            } else if (language.equals("d")){
                System.out.println("rul igen");
            }
            return 0;
        }
    }
}
