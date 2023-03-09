package characters;

public class Sniper extends BaseHero {
    private int ammo;
    private int maxAmmo;

    public Sniper() {
        super(String.format("Снайпер #%d", ++Magician.number),
                Magician.r.nextInt(100, 200));
        this.maxAmmo = Magician.r.nextInt(50, 150);
        this.ammo = maxAmmo;
    }

    public String getInfo() {
        return String.format("%s  Боеприпасы: %d",super.getInfo(), this.ammo);
    }
}
