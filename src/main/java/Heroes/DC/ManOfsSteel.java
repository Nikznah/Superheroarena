package Heroes.DC;

import Heroes.SuperHero;

public class ManOfsSteel extends SuperHero {

    public ManOfsSteel() {
        this.setName("Супермен");
        this.setSkill("Лазер из глазз");
        this.setStrange(10);
        this.setUniverse(SuperHero.Universe.DC);
        this.setFly(true);
    }
}
