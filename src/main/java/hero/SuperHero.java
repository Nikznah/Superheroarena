package hero;

import java.util.Objects;

/**
 * Класс Супер Герой
 */


public class SuperHero {

    public enum Universe {DC, MARVEL}

    private String name;
    private Universe universe;
    private int strength;
    private String skill;
    private boolean fly = false;

    public boolean isFly() {
        return fly;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }

    public SuperHero() {
    }

    public SuperHero(String name, int strength, Universe universe, String skill) {
        setName(name);
        setStrength(strength);
        this.universe = universe;
        setSkill(skill);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!checkString(name))
            throw new IllegalArgumentException("Имя супер героя введено некорректно");
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        if (strength > 10 || strength < 1)
            throw new IllegalArgumentException("Сила должна быть числом от 1 до 10");
        this.strength = strength;
    }

    public Universe getUniverse() {
        return universe;
    }

    public void setUniverse(Universe universe) {
        this.universe = universe;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        if (!checkString(skill))
            throw new IllegalArgumentException("Название способности введено некорректное");
        checkString(skill);
        this.skill = skill;
    }

    private static boolean checkString(String word) {
        return word != null && !("").equals(word.replaceAll("\\s+", ""));
    }


    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", strange=" + strength +
                ", universe=" + universe +
                ", skill='" + skill + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SuperHero hero = (SuperHero) o;
        return strength == hero.strength && name.equals(hero.name) && universe.equals(hero.universe) && skill.equals(hero.skill);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, strength, universe, skill);
    }
}

