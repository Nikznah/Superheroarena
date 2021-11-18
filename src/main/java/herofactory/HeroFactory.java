package herofactory;

import hero.NewHero;
import hero.SuperHero;
import hero.dc.Aquaman;
import hero.dc.Batman;
import hero.dc.Flash;
import hero.dc.ManOfSteel;
import hero.marvel.Hulk;
import hero.marvel.IronMan;
import hero.marvel.Spiderman;
import hero.marvel.Thor;

import java.util.Random;

/**
 * Класс Фабрики героев
 * отвечает за создание героев
 */
public class HeroFactory {

    private static final Random RANDOM = new Random();
    private static final SuperHero.Universe MARVEL = SuperHero.Universe.MARVEL;
    private static final SuperHero.Universe DC = SuperHero.Universe.DC;

    public SuperHero createHero(String name, int s, SuperHero.Universe universe, String skill, boolean fly) {
        return new NewHero(name, s, universe, skill, fly);
    }

    public SuperHero createRandomHero() {
        switch (RANDOM.nextInt(8)) {
            case 0:
                return createAqua();
            case 1:
                return createBatman();
            case 2:
                return createFlash();
            case 3:
                return createManOfSteel();
            case 4:
                return createHulk();
            case 5:
                return createIronMan();
            case 6:
                return createThor();
            case 7:
                return createSpider();
        }
        return createIronMan();
    }

    private Aquaman createAqua() {
        return new Aquaman("Аквамэн", 7, DC, "Трезубец", false);
    }

    private Batman createBatman() {
        return new Batman("Бэтмэн", 5, DC, "Деньги", false);
    }

    private Flash createFlash() {
        return new Flash("Флэш", 6, DC, "Сверхскорость", false);
    }

    private ManOfSteel createManOfSteel() {
        return new ManOfSteel("Супермэн", 10, DC, "Лазер из глаз", true);
    }

    private Hulk createHulk() {
        return new Hulk("Халк", 8, MARVEL, "Зеленый цвет", false);
    }

    private IronMan createIronMan() {
        return new IronMan("Железный человек", 5, MARVEL, "Лазер из груди", true);
    }

    private Spiderman createSpider() {
        return new Spiderman("Человек-паук", 6, MARVEL, "Паучье чутьё", false);
    }

    public Thor createThor() {
        return new Thor("Тор", 10, MARVEL, "Мьёлнир", true);
    }
}
