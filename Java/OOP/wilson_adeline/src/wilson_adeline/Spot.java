package wilson_adeline;

public abstract class Spot {
    protected char symbol;
    protected ColorText.Color color;

    abstract void accept(Visitor v);

    public String toString(){return ColorText.colorString(symbol, color);}

}

