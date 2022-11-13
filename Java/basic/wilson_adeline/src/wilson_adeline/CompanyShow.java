package wilson_adeline;

import java.text.DecimalFormat;
import java.util.Map.Entry;
import java.util.Iterator;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;

public class CompanyShow extends Show{

    private HashMap<String,Double> tallyBills;

    public CompanyShow(String name, int maxFireworks) {
        super(name, maxFireworks);
        tallyBills = new HashMap<>();
    }

    public CompanyShow(int maxFireworks) {
        this("company", maxFireworks);
    }

    public boolean addFirework(String name, int time, int duration, double cost)
    {
        if(super.addFirework(time,duration,cost)){
            if (tallyBills.containsKey(name)){
                tallyBills.put(name,tallyBills.get(name) + cost);
            }
            else{
                tallyBills.put(name,cost);
            }
            return true;
        }
        return false;
    }

    public boolean addFirework( int time)
    {
        return this.addFirework("UNKNOWN", time, Firework.DEFAULT_DURATION, Firework.DEFAULT_COST);

    }
    public boolean addFirework( int time, int duration)
    {
        return this.addFirework("UNKNOWN", time, duration, Firework.DEFAULT_COST);

    }
    public boolean addFirework( int time, int duration, int cost )
    {
        return this.addFirework("UNKNOWN", time, duration, cost);

    }
    public boolean addFirework(String name, int time) {
        return this.addFirework(name, time, Firework.DEFAULT_DURATION, Firework.DEFAULT_COST);

    }
    public boolean addFirework(String name,int time,  int duration)
    {
        return this.addFirework(name, time, duration, Firework.DEFAULT_COST);

    }

    public double getCost(){
        double cost = 0.0;
        Iterator<Entry<String,Double>>  new_Iterator =tallyBills.entrySet().iterator();
        while (new_Iterator.hasNext())
        {
            Map.Entry<String,Double> new_Bill = (Map.Entry<String,Double>) new_Iterator.next();
            if(new_Bill.getValue() >= 100)
                cost += new_Bill.getValue()*0.95;
            else
                cost += new_Bill.getValue();
        }
        return cost;
    }

    public String toString()
    {
        String k = super.toString();
        Iterator<Entry<String,Double>>  new_Iterator =tallyBills.entrySet().iterator();
        while (new_Iterator.hasNext())
        {
            Map.Entry<String,Double> new_Bill = (Map.Entry<String,Double>) new_Iterator.next();
            k += "\n--" + new_Bill.getKey() + " $" + new DecimalFormat("##0.00").format(new_Bill.getValue());
        }
        return  k;
    }

}
