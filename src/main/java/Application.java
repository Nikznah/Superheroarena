import Arena.Hero;

/**
 * Лекция №2: Основные конструкции
 */
public class Application {

    public static void main(String[] args) {

        Hero hero1 = new Hero();
        hero1.setName("Бэтмэн");
        hero1.setSkill("деньги");
        hero1.setStrange(10);
        hero1.setUniverse("DC");

        System.out.println(hero1);
    }
}
