package wilson_adeline;

/**
 * Class Firework - holds information of firework
 */
public class Firework {
    public int time;
    public int duration;
    public  double cost;
    public static final int DEFAULT_DURATION = 1;
    public static final double DEFAULT_COST = 20.00;

    /**
     * Constructor for Firework
     */
    public Firework(int time, int duration, double cost) {
        this.time = time;
        this.duration = duration;
        this.cost = cost;

    }

}

