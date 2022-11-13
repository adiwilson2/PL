package wilson_adeline;

public class IsPullable implements Visitor{
    private boolean isPull;
    private int x;
    private int y;

    IsPullable() {
        isPull = false;
    }

    @Override
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void visit(Empty empty) {
        isPull = false;
    }

    @Override
    public void visit(Planet planet) {
        isPull = true;
    }

    @Override
    public void visit(Stars stars) {
        isPull = true;
    }

    @Override
    public void visit(Nebula nebula) {
        isPull = true;

    }

    @Override
    public void visit(Blackhole blackhole) {
        isPull = false;
    }


    public boolean getIsPull() {
        return isPull;
    }

}
