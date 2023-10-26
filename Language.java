import java.util.Scanner;

class Language {
    private String language = "e";

    public void setLanguage(Scanner scanner) {
        while (true) {
            System.out.println("Write a letter corresponding to the language you want, the options are danish and english");
            String lang = scanner.nextLine();

            if (lang.equals("d")) {
                language = "d";
                return;
            } else if (lang.equals("e")) {
                language = "e";
                return;
            } else {
                System.out.println("Wrong input! Please write a single letter for the corresponding language.");
            }
        }
    }

    public String getLanguage() {
        return language;
    }
}