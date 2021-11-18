package hero.marvel;

import hero.SuperHero;

public class Spiderman extends SuperHero {

    public Spiderman() {
    }

    public Spiderman(String name,
                     int strength,
                     Universe universe,
                     String skill,
                     boolean fly) {
        super(name, strength, universe, skill, fly);
    }

    @Override
    public void useSkill() {
        System.out.println("Паучье чутьё");
    }
}
