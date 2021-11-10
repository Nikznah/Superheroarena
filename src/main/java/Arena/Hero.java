package Arena;

import java.util.Objects;

/**
 * Супер герой
 */
public class Hero {

    private String name;
    private int strange;
    private String universe;
    private String skill;

    public Hero() {}

    public Hero(String name, int strange, String universe, String skill) {
        this.name = name;
        this.strange = strange;
        this.universe = universe;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrange() {
        return strange;
    }

    public void setStrange(int strange) {
        this.strange = strange;
    }

    public String getUniverse() {
        return universe;
    }

    public void setUniverse(String universe) {
        this.universe = universe;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
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
        Hero hero = (Hero) o;
        return strange == hero.strange && name.equals(hero.name) && universe.equals(hero.universe) && skill.equals(hero.skill);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, strange, universe, skill);
    }
}

