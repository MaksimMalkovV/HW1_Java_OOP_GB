package characters.Units;


import characters.Class.ShooterClass;

public class Sniper extends ShooterClass {
    

    public Sniper(String name) {
        super(450, 260, 38, 43, 40, 33, name);
        
    }

    @Override
    public String getInfo() {
        return "Снайпер";
    }


}
