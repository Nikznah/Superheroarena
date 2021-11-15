package Heroes.DC;

import Heroes.SuperHero;

public class ManOfSteel extends SuperHero {

    public ManOfSteel() {
        this.setName("Супермен");
        this.setSkill("Лазер из глазз");
        this.setStrange(10);
        this.setUniverse(SuperHero.Universe.DC);
        this.setFly(true);
    }
}
