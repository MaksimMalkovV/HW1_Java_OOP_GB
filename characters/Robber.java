package characters;

public class Robber extends BaseHero {
    
    private int gold;
    private int maxGold;

    public Robber(String name) {
        super(String.format("Разбойник Имя: %s", name),
                Magician.r.nextInt(100, 200));
        this.maxGold = Magician.r.nextInt(50, 150);
        this.gold = maxGold;
    }

    @Override
    public String getInfo() {
        return String.format("%s  Золото: %d",super.getInfo(), this.gold);
    }

    @Override
    public void step() {
        System.out.println("Разбойник разбойничает!");
    }


}
