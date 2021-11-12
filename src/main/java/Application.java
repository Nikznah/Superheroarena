import Arena.Fight;
import Arena.SuperHero;

/**
 * Лекция №2: Основные конструкции
 */
public class Application {

    public static void main(String[] args) {

        SuperHero hero1 = new SuperHero();
        hero1.setName(" Ю");
        hero1.setSkill(" ");
        hero1.setStrange(10);
        hero1.setUniverse(SuperHero.Universe.DC);
        SuperHero hero2 = new SuperHero("Тор",6, SuperHero.Universe.MARVEL," Молоток");

        Fight.fight(hero1,hero2);


    }
}
