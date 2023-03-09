package characters;

public class Spearman extends BaseHero {
    
    public Spearman() {
        super(String.format("Копейщик #%d", ++Magician.number),
                Magician.r.nextInt(100, 200));
        
    }
}
