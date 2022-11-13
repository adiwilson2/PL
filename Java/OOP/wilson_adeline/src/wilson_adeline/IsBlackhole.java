package wilson_adeline;

public class IsBlackhole implements Visitor {
    private boolean isBH;
    private int x;
    private int y;

    IsBlackhole() {
        isBH = false;
    }

    @Override
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void visit(Empty empty) {
        isBH = false;
    }

    @Override
    public void visit(Planet planet) {
        isBH = false;
    }

    @Override
    public void visit(Stars stars) {
        isBH = false;
    }

    @Override
    public void visit(Nebula nebula) {
        isBH = false;

    }

    @Override
    public void visit(Blackhole blackhole) {
        isBH = true;
    }


    public boolean getIsBlackHole() {
        return isBH;
    }

}
