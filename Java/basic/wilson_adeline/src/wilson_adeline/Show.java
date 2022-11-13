package wilson_adeline;

import java.util.ArrayList;
import java.text.DecimalFormat;

/**
 * class show - track the number fo fireworks in an individual show
 */
public class Show {

    protected String name;
    protected int maxFireworks;
    private int updatedTime = 0;

    ArrayList<Firework> fireworkArray = new ArrayList<>();
    public final static int WARNING_THRESHOLD = 80;
    private double totalCost = 0.0;
    private int totalWarning = 0;

    private boolean capacityCheck = false;


    public Show(int maxFireworks) {
        this("test", maxFireworks);
    }


    public Show(String name, int maxFireworks) {
        this.name = name;
        this.maxFireworks = maxFireworks;
    }


    public boolean addFirework(int time, int duration, double cost) {
        if (duration < 1)
            return false;
        if (cost < 0)
            return false;
        if (time < updatedTime)
            return false;
        if(fireworkArray.size() == maxFireworks)
            return false;
        fireworkArray.add(new Firework(time,duration,cost));

        totalCost += cost;

        update(time);
        return true;

    }

    public boolean addFirework(int time) {
        return addFirework(time, Firework.DEFAULT_DURATION, Firework.DEFAULT_COST);
    }

    public boolean addFirework(int time, int duration) {
        return addFirework(time, duration, Firework.DEFAULT_COST);
    }

    public boolean addFirework(int time, double cost) {
        return addFirework(time, Firework.DEFAULT_DURATION, cost);
    }

    public void update(int time) {
        if(time <this.updatedTime)
            return;

        this.updatedTime = time;


        for(int i = fireworkArray.size() -1; i >= 0; i--) {
            int endTime = fireworkArray.get(i).time +fireworkArray.get(i).duration;
            if(endTime < updatedTime)
                fireworkArray.remove(i);
        }

        if(this.hasWarning()) {
            if(!this.capacityCheck) {
                this.totalWarning += 1;
                this.capacityCheck = true;
            }
        }
        else
            this.capacityCheck = false;

    }

    public int getFireworksUp(){
        return fireworkArray.size();
    }

    public boolean hasWarning(){
        //return true if the number of fireworks up is at 80 percent or above the number of maximum fireworks allowed
        //save as a constant
        return (double) fireworkArray.size()/maxFireworks >= WARNING_THRESHOLD/100.0;

    }

    public int getTotalWarnings(){
        //returns the total number of times during which the show released a warning
        return totalWarning;
    }

    public double getCost(){
        //return cost of show
        return totalCost;
    }

    public String toString(){
        DecimalFormat decFormat = new DecimalFormat("0.#%");
        String p = decFormat.format((double) fireworkArray.size()/maxFireworks);
        if(hasWarning())
            p = "WARNING";

        return "Status for " + name + " show: " + getFireworksUp() + " fireworks up (" + p + ")";
        //return string
    }
    public String getName()
    {
        return name;
    }



}
