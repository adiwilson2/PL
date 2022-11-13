package wilson_adeline;

public class Count implements Visitor{
    private int x;
    private int y;

    private int e;
    private int p;
    private int n;
    private int b;
    private int s;

    public Count (){
        e = 0;
        p = 0;
        n = 0;
        b = 0;
        s = 0;
    }

    @Override
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void visit(Empty v) {
        e += 1;
    }

    @Override
    public void visit(Planet v) {
        p += 1;
    }

    @Override
    public void visit(Stars v) {
        s += 1;
    }

    @Override
    public void visit(Nebula v) {
        n += 1;
    }

    @Override
    public void visit(Blackhole v) {
        b += 1;
    }
    //if accepted after setting visitor to true, then increment that variable

    public String toString() {
        String resultE = "Empty: " + e + "\n";
        String resultP = "Planets: " + p + "\n";
        String resultS = "Stars: " + s + "\n";
        String resultN = "Nebulas: " + n + "\n";
        String resultB = "Black Holes: " + b + "\n";

        return (resultE + resultP + resultS + resultN + resultB);

    }
}
