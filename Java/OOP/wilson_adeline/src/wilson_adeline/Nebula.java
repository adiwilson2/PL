package wilson_adeline;

public class Nebula extends Spot{
    Nebula(){
        super();
        symbol = '⛆';
        //color = ColorText.Color.BLACK;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }
    public String toString() {return ColorText.colorString(symbol, color);}
}
