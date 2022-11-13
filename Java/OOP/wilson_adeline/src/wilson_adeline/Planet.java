package wilson_adeline;

public class Planet extends Spot{
    Planet(){
        symbol = '⦾';
        color = ColorText.Color.BLACK;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    public String toString() {return ColorText.colorString("⦾", this.color);}
}
