package hero;

import lombok.Data;

import static org.apache.commons.lang3.StringUtils.isBlank;

/**
 * Класс Супер Герой
 */

@Data
public class SuperHero {

    public enum Universe {DC, MARVEL}

    private String name;
    private Universe universe;
    private int strength;
    private String skill;
    private boolean fly = false;

    public SuperHero() {
    }

    public SuperHero(String name, int strength, Universe universe, String skill) {
        setName(name);
        setStrength(strength);
        setUniverse(universe);
        setSkill(skill);
    }

    public void setName(String name) {
        if (isBlank(name))
            throw new IllegalArgumentException("Имя супер героя введено некорректно");
        this.name = name;
    }

    public void setStrength(int strength) {
        if (strength < 1 || strength > 10)
            throw new IllegalArgumentException("Сила должна быть числом от 1 до 10");
        this.strength = strength;
    }

    public void setSkill(String skill) {
        if (isBlank(skill)) {
            throw new IllegalArgumentException("Название способности введено некорректное");
        }
        this.skill = skill;
    }
    public void setUniverse(Universe universe){
        if (universe == null){
            throw new IllegalArgumentException("Ошибка вселеной");
        }
        this.universe = universe;
    }
    public void useSkill(){

    }
}

