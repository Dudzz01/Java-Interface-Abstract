package Game;

public class Main {
    
    public static void main(String[] args) throws Exception {
        Boss boss_1 = new Boss();
        Hero hero_1 = new Hero();

        boss_1.chute();
        boss_1.soco();

        hero_1.chute();
        hero_1.soco();
    }

}
