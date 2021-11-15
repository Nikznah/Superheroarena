package Heroes.Marvel;

import Heroes.SuperHero;

public class IronMan extends SuperHero {

    public IronMan(){
        this.setName("Железный человек");
        this.setSkill("Костюм");
        this.setStrange(9);
        this.setUniverse(SuperHero.Universe.MARVEL);
        this.setFly(true);
    }
}
