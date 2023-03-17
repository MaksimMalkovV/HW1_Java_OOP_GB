package characters.Class;

import java.util.ArrayList;

public class ShooterClass extends BaseHero {
    
    int ammo;

    public ShooterClass(int hp, int speed, int damage, int maxDamage, int armor,int ammo, String name) {
        super(hp, speed, damage, maxDamage, armor, name);
        this.ammo = ammo;
    }

    @Override
    public void step(ArrayList<BaseHero> team, ArrayList<BaseHero> friends) {
        if (this.ammo > 0 && this.hp > 0) {
            System.out.println("Делает выстрел");
            for (BaseHero unit : team) {
                if (unit.hp > 0) {
                    this.attack(unit, this.damage, this.maxDamage);
                    this.ammo--;
                    break;
                } else
                    System.out.println("Пропуск хода");
            }
        }

        System.out.println(toString());
        for (BaseHero unit : friends) {
            if (unit.getInfo().equals("Peasant")) {
                this.ammo++;
                break;
            }
        }
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Осталось стрел: " + String.valueOf(this.ammo);
    }


}
