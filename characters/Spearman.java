package characters;

public class Spearman extends BaseHero {
    
    public Spearman(String name) {
        super(String.format("Копейщик Имя: %s", name),
                Magician.r.nextInt(100, 200));
        
    }

    @Override
    public String getInfo() {
        return String.format("%s ",super.getInfo());
    }

    @Override
    public void step() {
        System.out.println("Копейщик атакует");
    }
}
