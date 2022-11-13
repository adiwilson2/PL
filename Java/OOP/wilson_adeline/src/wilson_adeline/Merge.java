package wilson_adeline;

public class Merge implements Visitor{

    private int x;
    private int y;
    private Grid grid;

    Merge(Grid grid) {
        this.grid = grid;
    }

    @Override
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void visit(Empty empty) {
        //set false
    }

    @Override
    public void visit(Planet planet) {
        //set false
    }

    @Override
    public void visit(Stars stars) {
        //set false
    }

    @Override
    public void visit(Nebula nebula) {
        //change it to new Star
        grid.grid[x][y]= new Stars();
    }

    @Override
    public void visit(Blackhole blackhole) {
        //set true
    }
    //merge
}
