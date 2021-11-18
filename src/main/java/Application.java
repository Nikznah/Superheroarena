import arena.Arena;
import hero.SuperHero;
import herofactory.HeroFactory;

/**
 * Фабрика героев
 * программа устраивает дуэли между двумя супер героями
 * Можно создать своего героя или воспользоваться генератором.
 */
public class Application {

    private static final HeroFactory FACTORY = new HeroFactory();
    private static final Arena ARENA = new Arena();

    public static void main(String[] args) {

        if (args.length != 1) {
            throw new IllegalArgumentException("Некоретное значение");
        }
        SuperHero hero1;
        SuperHero hero2;

        if ((args[0].equals("1"))) {
            hero1 = FACTORY.createHero("Никита",8, SuperHero.Universe.MARVEL,"Пишу код на Java",false);
            hero2 = FACTORY.createRandomHero();
            ARENA.fight(hero1, hero2);
        }
        if (args[0].equals("2")) {
            hero1 = FACTORY.createRandomHero();
            hero2 = FACTORY.createRandomHero();
            ARENA.fight(hero1, hero2);
        }
    }
}

