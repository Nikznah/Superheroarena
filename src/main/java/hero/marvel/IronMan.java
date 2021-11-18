package hero.marvel;

import hero.SuperHero;

public class IronMan extends SuperHero {


    public IronMan() {
    }

    public IronMan(String name,
                   int strength,
                   Universe universe,
                   String skill,
                   boolean fly) {
        super(name, strength, universe, skill, fly);
    }

    @Override
    public void useSkill() {
        System.out.println("Джарвис");
    }
}
