package Heroes.Marvel;

import Heroes.SuperHero;

public class Spiderman extends SuperHero {

    public Spiderman(){
        this.setName("Человек паук");
        this.setSkill("Паучье чутье");
        this.setStrange(6);
        this.setUniverse(SuperHero.Universe.MARVEL);
    }
}
