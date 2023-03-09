import characters.BaseHero;
import characters.Crossbowman;
import characters.Magician;
import characters.Peasant;
import characters.Priest;
import characters.Robber;
import characters.Sniper;
import characters.Spearman;

//  Снайпер, копейщик

public class Program {
    public static void main(String[] args) {
        
        BaseHero hero1 = new Priest();
        System.out.println(hero1.getInfo());

        BaseHero hero2 = new Peasant();
        System.out.println(hero2.getInfo());

        BaseHero Max = new Sniper();
        System.out.println(Max.getInfo());

        BaseHero Georg = new Spearman();
        System.out.println(Georg.getInfo());

        BaseHero Bond = new Robber();
        System.out.println(Bond.getInfo());

        BaseHero Mag = new Magician();
        System.out.println(Mag.getInfo());

        BaseHero Fin = new Crossbowman();
        System.out.println(Fin.getInfo());
    }
}
