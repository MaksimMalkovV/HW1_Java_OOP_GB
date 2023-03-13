package characters;
 
public class Magician extends BaseHero {

    private int mana;
    private int maxMana;

    public Magician(String name) {
        super(String.format("Колдун Имя: %s", name),
                Magician.r.nextInt(100, 200));
        this.maxMana = Magician.r.nextInt(50, 150);
        this.mana = maxMana;
    }

    @Override
    public String getInfo() {
        return String.format("%s  Мана: %d",super.getInfo(), this.mana);
    }

    @Override
    public void step() {
        System.out.println("Колдун делает вжжух!");
    }
}