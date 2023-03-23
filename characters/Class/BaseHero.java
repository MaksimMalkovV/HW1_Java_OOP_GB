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
    public int hp;
    protected int maxHp, damage, armor, speed, attack;
    protected String state;
    public Position position;
    public String type;

    public BaseHero(int hp, int speed, int damage, int attack, int armor, String name, int x, int y) {
        NAME = name;
        this.hp = hp;
        this.maxHp = hp;
        this.speed = speed;
        this.damage = damage;
        this.attack = attack;
        this.armor = armor;
        state = "Stand";
        position = new Position(x, y);
        this.type = this.getClass().getName().split("\\.")[1];
    }

    static {
        BaseHero.number = 0;
        BaseHero.r = new Random();
    }

    public String getInfo() {
        String outStr = String.format("\t%-3s\tARM %-3d\tHP %-3d%%\tDM %-3d\t      ", getName(), armor,
                (int) hp * 100 / maxHp, damage);
        return outStr;

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

    public Position getPosition() {
        return position;
    }

    public void attack(BaseHero target, int damage) {
        int causedDamage = 0;
        if (damage < target.armor) {
            causedDamage = damage;
        }
        target.getDamage(causedDamage);
    }

    public void getСharacterName() {
        System.out.println(NAME);
    }

    public String getName() {
        return this.getClass().getName().split("\\.")[1];
    }

    @Override
    public String toString() {
        return "Name: " + NAME + "Type: " + getInfo() + "Attack: " + attack + "Armor: " + armor + "Damage: " + damage
                + "Speed: " + speed;
    }

    public static String assignName() {
        return Names.values()[new Random().nextInt(Names.values().length)].toString();
    }
}