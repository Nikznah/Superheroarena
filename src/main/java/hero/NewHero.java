package hero;

public class NewHero extends SuperHero {

    public NewHero(String name,
                   int strength,
                   Universe universe,
                   String skill,
                   boolean fly) {
        super(name, strength, universe, skill, fly);
    }

    @Override
    public void useSkill() {
        System.out.println("Использую способность" + super.getSkill());
    }
}
