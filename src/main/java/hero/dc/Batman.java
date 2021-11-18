package hero.dc;

import hero.SuperHero;

public class Batman extends SuperHero {

    public Batman() {
    }

    public Batman(String name,
                  int strength,
                  Universe universe,
                  String skill,
                  boolean fly) {
        super(name, strength, universe, skill, fly);
    }

    @Override
    public void useSkill() {
        System.out.println("Бэт- мобиль");
    }
}
