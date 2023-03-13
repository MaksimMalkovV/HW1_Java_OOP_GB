package characters;

public class Priest extends BaseHero {

    private int elixir;
    private int maxElixir;

    public Priest(String name) {
        super(String.format("Монах Имя: %s", name),
                Magician.r.nextInt(100, 200));
        this.maxElixir = Magician.r.nextInt(50, 150);
        this.elixir = maxElixir;
    }
    
    @Override
    public String getInfo() {
        return String.format("%s  Вера: %d", super.getInfo(), this.elixir);
    }

    @Override
    public void step() {
        System.out.println("Монах лечит!");
    }


}
