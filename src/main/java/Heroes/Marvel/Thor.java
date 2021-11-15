package Heroes.Marvel;

import Heroes.SuperHero;

public class Thor extends SuperHero {

    public Thor(){
        this.setName("Тор");
        this.setSkill("Удар молнией");
        this.setStrange(8);
        this.setUniverse(SuperHero.Universe.MARVEL);
    }
}
