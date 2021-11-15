import Arena.Fight;
import Heroes.DC.ManOfsSteel;
import Heroes.Marvel.Hulk;
import Heroes.Marvel.Spiderman;
import Heroes.SuperHero;

/**
 * Лекция №2: Основные конструкции
 */
public class Application {

    public static void main(String[] args) {


        Hulk hulk = new Hulk();
        System.out.println(hulk.getName());

        Hulk hulk1 = new Hulk();
        System.out.println(hulk1.getUniverse());

        ManOfsSteel supermen = new ManOfsSteel();
        System.out.println(supermen.isFly());


    }
}
