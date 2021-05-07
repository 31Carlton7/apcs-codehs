Musician.java:
-------------
public class Musician
{
    private String name;
    private int weeksInTop40;
    private int albumsSold;
    private boolean isPlatinum;;
    
    public Musician(String name, int weeksInTop40, int albumsSold)
    {
        this.name = name;
        this.weeksInTop40 = weeksInTop40;
        this.albumsSold = albumsSold;
        setPlatinum(albumsSold);
    }
    
    public void setPlatinum(int albumsSold)
    {
        if(albumsSold >= 1000000)
        {
            isPlatinum = true;
        }
        else
        {
            isPlatinum = false;
        }
    }
    
    public int getWeeksInTop40()
    {
        return this.weeksInTop40;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public boolean getIsPlatinum()
    {
        return isPlatinum;
    }
    
    public String toString()
    {
        return this.name;
    }
}


Billboard.java:
--------------
import java.util.ArrayList;

public class Billboard {

private ArrayList<Musician> top10 = new ArrayList<Musician>();

    public void add(Musician newMusician) 
    {
    
        if(this.top10.size()<10 && newMusician.getIsPlatinum()==true) 
        {
            this.top10.add(newMusician);
        } else {
            if(newMusician.getIsPlatinum()==false) 
            {
                System.out.println("Sorry, " + newMusician + " does not qualify for Top 10");
            
            } else {
                replace(newMusician);
            }
        }

    }

    public void replace(Musician newMusician) {
    
        int lowestOnTop40 = Integer.MAX_VALUE;
        
        int index=-1;
        
        for(int i=0;i<this.top10.size();i++) 
        {
            if(this.top10.get(i).getWeeksInTop40()<lowestOnTop40) 
            {
                lowestOnTop40 = this.top10.get(i).getWeeksInTop40();
                index = i;
            }
        }
        
        if(lowestOnTop40 < newMusician.getWeeksInTop40()) 
        {
            System.out.println("The musician "+ this.top10.get(index) + " has been replaced by "+ newMusician + ".");
            
            this.top10.set(index, newMusician);
        } else {
            System.out.println("Sorry, " + newMusician + " has less weeks in the Top 40 than the other musicians.");
        }
    }

    public void printTop10() 
    {
        System.out.println(top10);
    }

}

BillboardTester.java:
--------------------
public class BillboardTester
{
    public static void main(String[] args)
    {
        Billboard top10 = new Billboard();
        top10.add(new Musician("Beyonce", 316, 100000000));
        top10.add(new Musician("The Beatles", 365, 600000000));
        top10.add(new Musician("Drake", 425, 150000000));
        top10.add(new Musician("Pink Floyd", 34, 250000000));
        top10.add(new Musician("Mariah Carey", 287, 200000000));
        top10.add(new Musician("Rihanna", 688, 250000000));
        top10.add(new Musician("Queen", 327, 170000000));
        top10.add(new Musician("Ed Sheeran", 536, 150000000));
        top10.add(new Musician("Katy Perry", 317, 143000000));
        top10.add(new Musician("Justin Bieber", 398, 140000000));

        //This musician should not be added to the top10 because they don't have enough records sold        
        top10.add(new Musician("Karel the Dog", 332, 60));
        
        //This musician should replace the artist with the least Weeks on the top 40 charts.
        top10.add(new Musician("Tracy the Turtle", 332, 150000000));
        
        //This musician should not replace an artist, but is a Platinum artist
        top10.add(new Musician("Alex Eacker", 100, 23400000));
        
        top10.printTop10();


    } 
}

