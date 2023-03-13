package characters;

public class Peasant extends BaseHero {
    
    public Peasant(String name) {
        super(String.format("Крестьянин Имя: %s", name),
                Magician.r.nextInt(100, 200));
    }

    @Override
    public String getInfo() {
        return String.format("%s ",super.getInfo());
    }

    @Override
    public void step() {
        System.out.println("Что ему делать!");
    }
    
}
