import java.util.Random;
import java.util.Scanner;

import characters.Class.BaseHero;
import characters.Units.Crossbowman;
import characters.Units.Magician;
import characters.Units.Peasant;
import characters.Units.Priest;
import characters.Units.Robber;
import characters.Units.Sniper;
import characters.Units.Spearman;

import java.util.ArrayList;
import java.util.Comparator;

public class Program {

    public static final int GANG_SIZE = 10;
    public static ArrayList<BaseHero> whiteSide = new ArrayList<>();
    public static ArrayList<BaseHero> darkSide = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Init();

        while(true){
            ConsoleView.view();
            sc.nextLine();
            step();
        }
    }

    public static void Init() {
        for (int i = 0; i < GANG_SIZE + 1; i++) {

            switch (new Random().nextInt(4)) {
                case 0:
                whiteSide.add(new Crossbowman(BaseHero.assignName(), 0, i));
                    break;
                case 1:
                whiteSide.add(new Magician(BaseHero.assignName(), 0, i));
                    break;
                case 2:
                whiteSide.add(new Spearman(BaseHero.assignName(), 0, i));
                    break;
                default:
                whiteSide.add(new Peasant(BaseHero.assignName(), 0, i));
                    break;
            }
            switch (new Random().nextInt(4)) {
                case 0:
                darkSide.add(new Robber(BaseHero.assignName(), 10, i));
                    break;
                case 1:
                darkSide.add(new Sniper(BaseHero.assignName(), 10, i));
                    break;
                case 2:
                darkSide.add(new Priest(BaseHero.assignName(), 10, i));
                    break;
                default:
                darkSide.add(new Peasant(BaseHero.assignName(), 10, i));
                    break;
            }
        }
    }    

    public static void step() {
        ArrayList<BaseHero> list = new ArrayList<>();

        list.addAll(darkSide);
        list.addAll(whiteSide);
        list.sort(new Comparator<BaseHero>() {
            @Override
            public int compare(BaseHero u1, BaseHero u2) {
                if (u1.getSpeed() == u2.getSpeed()) {
                    return 0;
                } else if (u1.getSpeed() > u2.getSpeed()) {
                    return 1;
                } else
                    return -1;
            }
        });

        for (BaseHero unit : list) {
            if (darkSide.contains(unit)) {
                unit.step(whiteSide, darkSide);
            } else
                unit.step(darkSide, whiteSide);
        }
    }
}

