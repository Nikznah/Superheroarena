package Heroes.DC;

import Heroes.SuperHero;

public class Batman extends SuperHero {

    public Batman() {
        this.setName("Бэтмен");
        this.setSkill("Бросок Бэтаранга");
        this.setStrange(5);
        this.setUniverse(SuperHero.Universe.DC);
    }
}
