package arena;

import hero.SuperHero;

import java.util.Random;

/**
 * Класс отвечает за создание героев.
 * Есть два варианта создания-
 * Случайный, а так же клавиатурный ввод клиента.
 */
public class Arena {

    public void fight(SuperHero hero1, SuperHero hero2) {
        System.out.println(hero1.toString());
        System.out.println(hero2.toString());
        System.out.println(hero1.getName() + " VS " + hero2.getName());
        System.out.println(hero1.getStrength() + " VS " + hero2.getStrength());
        System.out.println(hero1.getName() + " использует способность: ");
        hero1.useSkill();
        System.out.println(hero2.getName() + " использует способность: ");
        hero2.useSkill();
        winner(hero1, hero2);
    }

    private void winner(SuperHero h1, SuperHero h2) {
        if (h1.getStrength() > h2.getStrength()) {
            System.out.println("Выйграл " + h1.getName());
        } else if (h2.getStrength() > h1.getStrength()) {
            System.out.println("Выйграл " + h2.getName());
        } else {
            Random random = new Random();
            int r = random.nextInt(2);
            if (r == 1) {
                System.out.println("Выйграл " + h1.getName());
            } else {
                System.out.println("Выйграл " + h2.getName());
            }
        }
    }
}

