package characters.Class;

import java.util.ArrayList;
import java.util.Random;

import characters.Interfase.BaseInterfase;
import characters.Interfase.Names;
import characters.Interfase.Position;

public abstract class BaseHero implements BaseInterfase {

    protected static Random r;
    protected static int number;

    protected final String NAME;
    protected int hp;
    protected int maxHp;
    protected int damage;
    protected int armor;
    protected int speed;
    protected int maxDamage;
    protected String state;
    public Position position;

    public BaseHero(int hp, int speed, int damage, int maxDamage, int armor, String name, int x, int y) {
        NAME = name;
        this.hp = hp;
        this.maxHp = hp;
        this.speed = speed;
        this.damage = damage;
        this.maxDamage = maxDamage;
        this.armor = armor;
        state = "Stand";
        position = new Position(x, y);
    }

    static {
        BaseHero.number = 0;
        BaseHero.r = new Random();
    }

    public String getInfo() {
        return String.format("Имя: %s  Hp: %d  Тип: %s",
                this.NAME, this.hp, this.getClass().getSimpleName());
    }

    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        System.out.println("Ход");
    }

    public int getSpeed() {
        return this.speed;
    }

    public void healed(int Hp) {
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
    }

    public void getDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        } else
            this.hp = 0;

    }

    public void attack(BaseHero target, int damage, int maxDamage) {
        int causedDamage;
        if (damage < target.armor) causedDamage = damage;
        else {
            switch (new Random().nextInt(4)){
                case 0:
                    causedDamage = maxDamage;
                    break;
                default:
                    causedDamage = damage;
                    break;
            }
        }
        System.out.printf("%s Атака %s\t", this.getClass().getSimpleName(), target.getClass().getSimpleName());
        System.out.printf("Power of knock = %d\n", causedDamage);
        System.out.printf("%s hp= %d\n", target.getClass().getSimpleName(), target.hp);
        target.getDamage(causedDamage);
    }

    public void getNames() {
        System.out.println(NAME);
    }

    public static String getName() {
        return Names.values()[new Random().nextInt(Names.values().length)].toString();
    }
}