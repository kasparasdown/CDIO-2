public class Tile {

    public void rollSwitch(int tile){

    switch (tile) {
        case 2:
        System.out.println("You reached the Coin Tower, 250 coins is added to your wallet");
        break;
        case 3:
        System.out.println("Oh no.. you fell in a crater and lost 100 coins");
        break;
        case 4:
        System.out.println("You found the palace, 100 coins is added to your wallet");
        break;
        case 5:
        System.out.println("It`s cold out here in the desert you lost 20 coins");
        break;
        case 6:
        System.out.println("You reached the Walled City, 180 coins is added to your wallet");
        break;
        case 7:
        System.out.println("Welcome to the Monastery, stay quiet for a while and eat some rice");
        break;
        case 8:
        System.out.println("You accidentally walked into a Black Cave, you lose 70 coins)");
        break;
        case 9:
        System.out.println("Congrats you found the Mountain Huts, 60 coins is added to your wallet)");
        break;
        case 10:
        System.out.println("Don`t go near the Werewall, you lose 80 coins - roll again");
        break;
        case 11:
        System.out.println("Good luck getting out of this pit, you lose 50 coins");
        break;
        case 12:
        System.out.println("Hey lucky luke you struck gold in the Goldmine,  650 coins is added to your wallet");
        break;
        default:
        System.out.println("Try again please!");
        break;
    
    }
}
}
