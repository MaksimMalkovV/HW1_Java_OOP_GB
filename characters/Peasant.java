package characters;

public class Peasant extends BaseHero {
    
    public Peasant() {
        super(String.format("Крестьянин #%d", ++Magician.number),
                Magician.r.nextInt(100, 200));
    }
    
}
