/**
 * Additional OOP  requirements
 *     toString properly extended				____
 *     Constructors properly handled			____
 *     addFirework chaining handled properly 	____
 *     Access properly handled 				____
 *
 * Last tier completed: _______
 */
package wilson_adeline;

import java.util.ArrayList;
import java.lang.String;

public class Town {

    private final ArrayList<Show> shows = new ArrayList<>();
    private int totalNumWarnings = 0;
    private int totalNumFirework = 0;
    private double totalCost = 0.0;
    private int showIndex;
    Town(){}

    public boolean addFirework(int showIndex, String name, int time, int duration, double cost)
    {
        if (shows.size() > showIndex) {
            if (this.getShow(showIndex).addFirework(time, duration, cost)) {
                totalNumFirework += 1;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    public boolean addFirework(int showIndex, int time, int duration)
    {
        return addFirework(showIndex, "UNKNOWN",time, duration, Firework.DEFAULT_COST);
    }

    public boolean addFirework(int showIndex, int time){
        return addFirework(showIndex, "UNKNOWN",time, Firework.DEFAULT_DURATION, Firework.DEFAULT_COST);
    }

    public boolean addFirework(int showIndex, int time, int duration, double cost) {
        return addFirework(showIndex, "UNKNOWN",time, duration, cost);
    }
    public boolean addFirework(int showIndex, String name, int time, int duration) {
        return addFirework(showIndex, name, time, duration, Firework.DEFAULT_COST);
    }
    public boolean addFirework(int showIndex, String name, int time) {
        return addFirework(showIndex, name, time, Firework.DEFAULT_DURATION, Firework.DEFAULT_COST);
    }
    public void update(int time)
    {
        var numFw = 0;
        for (int i = 0; i <shows.size(); i++)
        {
            shows.get(i).update(time);
            numFw += shows.get(i).fireworkArray.size();
        }

        this.totalNumFirework = numFw;
    }

    public boolean hasWarning()
    {
        Boolean hasWarning = false;
        for (int i = 0; i < shows.size(); i++) {
            try {
                if (shows.get(i).hasWarning()) {
                    hasWarning = true;
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        //returns true if and only if all the firework shows have a warning out at that time
        return hasWarning;
    }

    public int getTotalWarnings()
    {
        return totalNumWarnings;
    }

    public Show getShow(int showIndex){
        return this.shows.get(showIndex);
    }
//    public int getShowIndex()
//    {
//        return this.showIndex;
//    }
    public int add(Show show)
    {
        this.shows.add(show);
       // shows.getShow(this.shows.indexOf(show));

        return shows.indexOf(show);
    }

    public int getFireworksUp()
    {
        //returns the total number of fireworks currently up in the town
        return totalNumFirework;
    }

    public double getTotalCost()
    {
        //returns the total amount of money spent on fireworks rounded
        return totalCost;
    }
    public String toString()
    {
        StringBuilder newString = new StringBuilder();
        newString.append("Town status:\n");
        for(Show show: shows)
        {
            newString.append(show.toString()).append("\n");
        }
        return newString.toString();
    }

}
