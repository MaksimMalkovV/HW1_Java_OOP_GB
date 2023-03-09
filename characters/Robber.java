package characters;

public class Robber extends BaseHero {
    
    private int gold;
    private int maxGold;

    public Robber() {
        super(String.format("Разбойник #%d", ++Magician.number),
                Magician.r.nextInt(100, 200));
        this.maxGold = Magician.r.nextInt(50, 150);
        this.gold = maxGold;
    }

    public String getInfo() {
        return String.format("%s  Золото: %d",super.getInfo(), this.gold);
    }
}
