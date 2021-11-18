package hero.marvel;

import hero.SuperHero;

public class Thor extends SuperHero {

    public Thor() {
    }

    public Thor(String name,
                int strength,
                Universe universe,
                String skill,
                boolean fly) {
        super(name, strength, universe, skill, fly);
    }

    @Override
    public void useSkill() {
        System.out.println("Удар молнией");
    }
}
