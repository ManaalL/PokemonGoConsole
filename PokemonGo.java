import java.util.*;
/**
 * Write a description of class PokemonGo here.
 *
 * @author Manaal
 * @version Feb 14 2024
 */
public class PokemonGo
{
    public static void main()
    {
        int pokemon = 0;
        do
        {
            Scanner scan = new Scanner (System.in);
            Scanner scan1 = new Scanner (System.in);
            System.out.println("Choose a number from the following list of Pokemon:");
            System.out.println("1. Pikachu");
            System.out.println("2. Squirtle");
            System.out.println("3. Charmander");
            System.out.println("4. Bulbasaur");
            System.out.println("5. Exit");
            pokemon = scan.nextInt();
            
            if (pokemon == 1)
            {
                pikachu();
                System.out.println("Would you like to select another pokemon Y/N");
                String repeat = scan1.nextLine();
                if(repeat.equals("N"))
                {
                    pokemon = 5;
                }
            }
            else if (pokemon == 2)
            {
                squirtle();
                System.out.println("Would you like to select another pokemon Y/N");
                String repeat = scan1.nextLine();
                if(repeat.equals("N"))
                {
                    pokemon = 5;
                }
            }
            else if (pokemon == 3)
            {
                charmander();
                System.out.println("Would you like to select another pokemon Y/N");
                String repeat = scan1.nextLine();
                if(repeat.equals("N"))
                {
                    pokemon = 5;
                }
            }
            else if (pokemon == 4)
            {
                bulbasaur();
                System.out.println("Would you like to select another pokemon Y/N");
                String repeat = scan1.nextLine();
                if(repeat.equals("N"))
                {
                    pokemon = 5;
                }
            }
            if (pokemon == 5)
            {
                System.out.println("Goodbye!");
            }
        } while(pokemon !=5);
    }
    private static void pikachu()
    {
        System.out.println("Charecter: Pikachu");
        System.out.println("Species: Mouse");
        System.out.println("Type: Electric");
        System.out.println("Ability: Static");
        System.out.println("Weakness: Ground");
        System.out.println("Evolution: Pichu, Pikachu, Raichu");
    }
    private static void squirtle()
    {
        System.out.println("Charecter: Squirtle");
        System.out.println("Species: Turtle");
        System.out.println("Type: Water");
        System.out.println("Ability: Torrent");
        System.out.println("Weakness: Grass");
        System.out.println("Evolution: Squirtle, Wartortle, Blastoise");
    }
    private static void charmander()
    {
        System.out.println("Charecter: Charmander");
        System.out.println("Species: Lizard");
        System.out.println("Type: Fire");
        System.out.println("Ability: Blaze");
        System.out.println("Weakness: Water");
        System.out.println("Evolution: Charmander, Charmeleon, Charizard");
    }
    private static void bulbasaur()
    {
        System.out.println("Charecter: Bulbasaur");
        System.out.println("Species: Frog");
        System.out.println("Type: Grass");
        System.out.println("Ability: Overgrow");
        System.out.println("Weakness: Ice");
        System.out.println("Evolution: Bulbasaur, Ivysaur, Venusaur");
    }
}
