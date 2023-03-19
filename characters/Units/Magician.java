package characters.Units;


import characters.Class.MagClass;

public class Magician extends MagClass {



    public Magician(String name, int x, int y) {
        super(380, 250, -33, -40, 40, 300, name, x, y);
    }

    @Override
    public String getInfo() {
        return "Колдун";
    }


}