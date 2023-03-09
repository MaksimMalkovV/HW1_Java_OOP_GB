package characters;

public class Crossbowman extends BaseHero  {

    private int bolts;
    private int maxBolts;

    public Crossbowman() {
        super(String.format("Арбалетчик #%d", ++Magician.number),
                Magician.r.nextInt(100, 200));
        this.maxBolts = Magician.r.nextInt(50, 150);
        this.bolts = maxBolts;
    }

    public String getInfo() {
        return String.format("%s  Болтов с собой: %d",super.getInfo(), this.bolts);
    }
}
