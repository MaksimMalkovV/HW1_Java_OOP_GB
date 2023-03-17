import java.util.Random;

import characters.Class.BaseHero;
import characters.Units.Crossbowman;
import characters.Units.Magician;
import characters.Units.Peasant;
import characters.Units.Priest;
import characters.Units.Robber;
import characters.Units.Sniper;
import characters.Units.Spearman;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<BaseHero> list = new ArrayList<>();
        ArrayList<BaseHero> list2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            switch (new Random().nextInt(4)) {
                case 0:
                    list.add(new Crossbowman(BaseHero.getName()));
                    break;
                case 1:
                    list.add(new Magician(BaseHero.getName()));
                    break;
                case 2:
                    list.add(new Spearman(BaseHero.getName()));
                    break;
                default:
                    list.add(new Peasant(BaseHero.getName()));
                    break;
            }
            switch (new Random().nextInt(4)) {
                case 0:
                    list2.add(new Robber(BaseHero.getName()));
                    break;
                case 1:
                    list2.add(new Sniper(BaseHero.getName()));
                    break;
                case 2:
                    list2.add(new Priest(BaseHero.getName()));
                    break;
                default:
                    list2.add(new Peasant(BaseHero.getName()));
                    break;
            }
        }

        System.out.println("-------------\n Команда 1:");
        for (BaseHero unit : list) {
            System.out.printf(String.format("%s - ", unit.getInfo()));
            unit.getNames();
        }

        System.out.println("-------------\n Команда 2:");
        for (BaseHero unit2 : list2) {
            System.out.printf(String.format("%s - ", unit2.getInfo()));
            unit2.getNames();
        }

        // list.forEach(u -> u.step(list2, list));
    }

}
