import model.Pokemon;

public class PocketFightingGame
{
    public static void main(String[] args)
    {
        PocketFightingGame app = new PocketFightingGame();
        app.run();
    }
    private void run()
    {
        System.out.println("Hello World");
        Pokemon pikachu = new Pokemon("Pikachu", 100, 40);
        Pokemon shiggy = new Pokemon("Shiggy", 100, 20);
        System.out.println(pikachu);
        while(pikachu.getHp() >= 0 && shiggy.getHp() >= 0)
        {
            shiggy.angreifen(pikachu);
            pikachu.angreifen(shiggy);
        }
    }
}
