package characters;

public class Crossbowman extends BaseHero  {

    private int bolts;
    private int maxBolts;

    public Crossbowman(String name) {
        super(String.format("Арбалетчик Имя: %s", name),
                Magician.r.nextInt(100, 200));
        this.maxBolts = Magician.r.nextInt(50, 150);
        this.bolts = maxBolts;
    }

    @Override
    public String getInfo() {
        return String.format("%s  Болтов с собой: %d",super.getInfo(), this.bolts);
    }

    @Override
    public void step() {
        System.out.println("Арбалетчик делает выстрел!");
    }
}
