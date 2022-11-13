package wilson_adeline;

public class Grid {
    Spot[][] grid = new Spot[5][7];

    Grid(){
        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                grid[i][j] = new Empty();
            }
        }
    }

    public void acceptVisitor(Visitor v) {
        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                v.setPosition(i, j);
                grid[i][j].accept(v);
            }
        }
    }

    public void PrintGrid(){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 7; j++) {
                System.out.print(grid[i][j].toString());
            }
            System.out.print("\n");
        }
    }

    public void setArea(int locationX, int locationY, int selection) {
        switch(selection){
            case 0 -> grid[locationY][locationX] = new Empty();
            case 1 -> grid[locationY][locationX] = new Planet();
            case 2 -> grid[locationY][locationX] = new Stars();
            case 3 -> grid[locationY][locationX] = new Nebula();
            case 4 -> grid[locationY][locationX] = new Blackhole();
        }
    }

    public void defaultGrid() {
        grid = new Spot[][]{
                {new Stars(), new Empty(), new Nebula(), new Planet(), new Empty(), new Empty(), new Empty()},
                {new Empty(), new Nebula(), new Stars(), new Planet(), new Stars(), new Empty(), new Stars()},
                {new Planet(), new Empty(), new Blackhole(), new Stars(), new Planet(), new Empty(), new Blackhole()},
                {new Planet(), new Stars(), new Nebula(), new Stars(), new Nebula(), new Empty(), new Blackhole()},
                {new Blackhole(), new Stars(), new Nebula(), new Empty(), new Stars(), new Empty(), new Empty()}
        };
    }
}
