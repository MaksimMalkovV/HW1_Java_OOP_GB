import java.util.Random;

import characters.*;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        // BaseHero hero1 = new Priest();
        // System.out.println(hero1.getInfo());

        // BaseHero hero2 = new Peasant();
        // System.out.println(hero2.getInfo());

        // BaseHero Max = new Sniper();
        // System.out.println(Max.getInfo());

        // BaseHero Georg = new Spearman();
        // System.out.println(Georg.getInfo());

        // BaseHero Bond = new Robber();
        // System.out.println(Bond.getInfo());

        // BaseHero Mag = new Magician();
        // System.out.println(Mag.getInfo());

        // BaseHero Fin = new Crossbowman();
        // System.out.println(Fin.getInfo());
        ArrayList<BaseHero> list = new ArrayList<>();
        ArrayList<BaseHero> list2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            switch (new Random().nextInt(3)) {
                case 0:
                    list.add(new Crossbowman(getName()));
                    break;
                case 1:
                    list.add(new Priest(getName()));
                    break;
                default:
                    list.add(new Robber(getName()));
                    break;
            }
            switch (new Random().nextInt(4)) {
                case 0:
                    list2.add(new Spearman(getName()));
                    break;
                case 1:
                    list2.add(new Sniper(getName()));
                    break;
                case 2:
                    list2.add(new Magician(getName()));
                    break;
                default:
                    list2.add(new Peasant(getName()));
                    break;
            }
        }

        list.forEach(u -> u.getNAME());
    }

    private static String getName() {
        return Names.values()[new Random().nextInt(Names.values().length)].toString();
    }

}
