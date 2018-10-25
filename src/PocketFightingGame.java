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
        System.out.println(pikachu);
    }
}
