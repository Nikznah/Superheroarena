package hero.dc;

import hero.SuperHero;

public class ManOfSteel extends SuperHero {

    public ManOfSteel() {
    }

    public ManOfSteel(String name,
                      int strength,
                      Universe universe,
                      String skill,
                      boolean fly) {
        super(name, strength, universe, skill, fly);
    }

    @Override
    public void useSkill() {
        System.out.println("Выстрел из глаз лазером");
    }
}
