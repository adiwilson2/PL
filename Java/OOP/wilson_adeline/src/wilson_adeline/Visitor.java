package wilson_adeline;

public interface Visitor {
     void setPosition(int x, int y);
     void visit(Empty v);
     void visit(Planet v);
     void visit(Stars v);
     void visit(Nebula v);
     void visit(Blackhole v);
}
