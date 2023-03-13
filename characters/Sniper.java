package characters;

public class Sniper extends BaseHero {
    private int ammo;
    private int maxAmmo;

    public Sniper(String name) {
        super(String.format("Снайпер Имя: %s", name),
                Magician.r.nextInt(100, 200));
        this.maxAmmo = Magician.r.nextInt(50, 150);
        this.ammo = maxAmmo;
    }

    @Override
    public String getInfo() {
        return String.format("%s  Боеприпасы: %d",super.getInfo(), this.ammo);
    }

    @Override
    public void step() {
        System.out.println("Снайпер делает выстрел!");
    }
}
