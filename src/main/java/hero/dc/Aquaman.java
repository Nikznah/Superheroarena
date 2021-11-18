package hero.dc;

import hero.SuperHero;

public class Aquaman extends SuperHero {

    public Aquaman() {
    }

    public Aquaman(String name,
                   int strength,
                   Universe universe,
                   String skill,
                   boolean fly) {
        super(name, strength, universe, skill, fly);
    }

    @Override
    public void useSkill() {
        System.out.println("Бросок трезубца");
    }
}
