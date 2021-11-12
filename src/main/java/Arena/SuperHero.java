package Arena;

import java.util.Objects;

/**
 * Класс отвечает за создание супер героя
 */

public class SuperHero {

    public enum Universe {DC, MARVEL}

    private String name;
    private Universe universe;
    private int strange;
    private String skill;


    public SuperHero() {
    }

    public SuperHero(String name, int strange, Universe universe, String skill) {
        setName(name);
        this.strange = strange;
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

    public int getStrange() {
        return strange;
    }

    public void setStrange(int strange) {
        if (strange > 10 || strange < 1)
            throw new IllegalArgumentException("Сила должна быть числом от 1 до 10");
        this.strange = strange;
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
                ", strange=" + strange +
                ", universe=" + universe +
                ", skill='" + skill + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SuperHero hero = (SuperHero) o;
        return strange == hero.strange && name.equals(hero.name) && universe.equals(hero.universe) && skill.equals(hero.skill);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, strange, universe, skill);
    }
}

