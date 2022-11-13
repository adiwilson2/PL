package wilson_adeline;

public class Gravity implements Visitor{
    public int x;
    public int y;
    private Grid grid;

    Gravity(Grid grid) {
        this.grid = grid;
    }

    @Override
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void visit(Empty empty) {
        //nothing done here
    }

    @Override
    public void visit(Planet planet) {
        //nothing done here
    }

    @Override
    public void visit(Stars stars) {
        //nothing done here
    }

    @Override
    public void visit(Nebula nebula) {
        //nothing done here
    }

    @Override
    public void visit(Blackhole blackhole) {
        //GRADING: NESTED
        IsPullable isPullable = new IsPullable();
        IsBlackhole isBlackhole = new IsBlackhole();
        //Check perimeter
        for(int i = -1; i <= 1; i++){
            for(int j = -1; j <= 1; j++){
                int k = x + i;
                int l = y + j;

                if (i == j && i == 0)
                    continue;

                if(k < 0 || k > 4 || l < 0 || l > 6)
                    continue;

                grid.grid[k][l].accept(isPullable);
                if (isPullable.getIsPull()) {
                    grid.grid[k][l] = new Empty();
                }

                int m = k + i;
                int n = l + j;

                if(m < 0 || m > 4 || n < 0 || n > 6)
                    continue;

                grid.grid[m][n].accept(isPullable);
                grid.grid[m][n].accept(isBlackhole);

                if (isPullable.getIsPull() && !isBlackhole.getIsBlackHole()) {
                    grid.grid[k][l] = grid.grid[m][n];
                    grid.grid[m][n] = new Empty();
                }
            }

        }
    }
}
