package hero.marvel;

import hero.SuperHero;

public class Hulk extends SuperHero {

    public Hulk() {
    }

    public Hulk(String name,
                int strength,
                Universe universe,
                String skill,
                boolean fly) {
        super(name, strength, universe, skill, fly);
    }

    @Override
    public void useSkill() {
        System.out.println("Халк крушить!");
    }
}
