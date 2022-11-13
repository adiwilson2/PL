package wilson_adeline;

public class ColorVisit implements Visitor{
    private int x;
    private int y;

    private int area;
    private ColorText.Color color;

    ColorVisit(int area, int color) {
        this.area = area;
        if (color == 0) {
            this.color = ColorText.Color.RED;
        }
        else if (color == 1) {
            this.color = ColorText.Color.YELLOW;
        }
        else if (color == 2) {
            this.color = ColorText.Color.BLUE;
        }
        else if (color == 3) {
            this.color = ColorText.Color.GREEN;
        }
        else if (color == 4) {
            this.color = ColorText.Color.BLACK;
        }
    }

    @Override
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public void visit(Empty v) {
        if(area == 0) {
            v.color = this.color;
        }
    }

    @Override
    public void visit(Planet v) {
        if(area == 1) {
            v.color = this.color;
        }
    }

    @Override
    public void visit(Stars v) {
        if(area == 1) {
            v.color = this.color;
        }
    }

    @Override
    public void visit(Nebula v) {
        if(area == 1) {
            v.color = this.color;
        }
    }

    @Override
    public void visit(Blackhole v) {
        if(area == 2) {
            v.color = this.color;
        }
    }
}
