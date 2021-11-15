package Arena;

import Heroes.SuperHero;

public class Fight {

    public static void fight(SuperHero hero1, SuperHero hero2) {
        System.out.println(hero1);
        System.out.println(hero2);

        if (hero1.getStrange() > hero2.getStrange()) {
            System.out.println("Выйграл" + hero1.getName());
        }
    }
}
