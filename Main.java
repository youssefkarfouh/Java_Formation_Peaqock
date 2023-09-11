import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        /*Scanner input = new Scanner(System.in);
        String alphabet = "";
        while (alphabet.length() > 1){
            System.out.println("Invalid input. Please enter a single character.");
            alphabet = input.nextLine();
            char character = alphabet.charAt(0);
        }

        System.out.println("You entered: " + alphabet);

        if (isVowel(alphabet)) {
            System.out.println(alphabet + " is a vowel.");
        } else {
            System.out.println(alphabet + " is not a vowel.");
        }*/


   Scanner input = new Scanner(System.in);

   int x = 0;

        while (x != 3 ){

             x =  input.nextInt();
            System.out.println("false");
        }

        System.out.println("true");
    }

    private static boolean isVowel(char character) {


            switch (Character.toLowerCase(character)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    return true;
                default:
                    return false;
            }

    }
}
