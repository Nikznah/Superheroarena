package arena;

import hero.SuperHero;

public class Arena {

    public void fight(SuperHero hero1, SuperHero hero2) {
        System.out.println(hero1);
        System.out.println(hero2);

        if (hero1.getStrength() > hero2.getStrength()) {
            System.out.println("Выйграл" + hero1.getName());
        }
    }
}
