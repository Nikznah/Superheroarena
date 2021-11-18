package hero.dc;

import hero.SuperHero;

public class Flash extends SuperHero {

    public Flash() {
    }

    public Flash(String name,
                 int strength,
                 Universe universe,
                 String skill,
                 boolean fly) {
        super(name, strength, universe, skill, fly);
    }

    @Override
    public void useSkill() {
        System.out.println("Быстрый бег");
    }
}
