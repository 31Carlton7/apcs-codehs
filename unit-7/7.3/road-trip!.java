GeoLocation.java:
----------------
/*
 * This class stores information about a location on Earth.  Locations are
 * specified using latitude and longitude.  The class includes a method for
 * computing the distance between two locations.
 *
 * This implementation is based off of the example from Stuart Reges at 
 * the University of Washington.
 */

public class GeoLocation 
{
    // Earth radius in miles
    public static final double RADIUS = 3963.1676;  

    private double latitude;
    private double longitude;
    private String name;

    /**
     * Constructs a geo location object with given latitude and longitude
     */
    public GeoLocation(double theLatitude, double theLongitude, String name) 
    {
        latitude = theLatitude;
        longitude = theLongitude;
        this.name = name;
    }

    /**
     * Returns the latitude of this geo location
     */
    public double getLatitude() 
    {
        return latitude;
    }

    /**
     * returns the longitude of this geo location
     */
    public double getLongitude() 
    {
        return longitude;
    }
    
    public String getName()
    {
        return name;
    }

    // returns a string representation of this geo location
    public String toString() 
    {
        return name + " (" + latitude + ", " + longitude + ")";
    }

    // returns the distance in miles between this geo location and the given
    // other geo location
    public double distanceFrom(GeoLocation other) 
    {
        double lat1 = Math.toRadians(latitude);
        double long1 = Math.toRadians(longitude);
        double lat2 = Math.toRadians(other.latitude);
        double long2 = Math.toRadians(other.longitude);
        // apply the spherical law of cosines with a triangle composed of the
        // two locations and the north pole
        double theCos = Math.sin(lat1) * Math.sin(lat2) +
            Math.cos(lat1) * Math.cos(lat2) * Math.cos(long1 - long2);
        double arcLength = Math.acos(theCos);
        return arcLength * RADIUS;
    }
}


RoadTrip.java:
-------------
import java.util.ArrayList;

public class RoadTrip
{
    
    ArrayList<GeoLocation> myRoadTrip = new ArrayList<GeoLocation>();
    
    // Create a GeoLocation and add it to the road trip
    public void addStop(String name, double latitude, double longitude)
    {
        GeoLocation geo = new GeoLocation(latitude, longitude, name);
        myRoadTrip.add(geo);
    }
    
    // Get the total number of stops in the trip
    public int getNumberOfStops()
    {
        return myRoadTrip.size();
    }
    
    // Get the total miles of the trip
    public double getTripLength()
    {
        double tripLength = 0.0;
        for(int i = 0; i < myRoadTrip.size() - 1; i++)
        {
            tripLength += myRoadTrip.get(i).distanceFrom(myRoadTrip.get(i + 1));
            //break;
        }
        return tripLength;
    }
    
    // Return a formatted toString of the trip
    public String toString()
    {
        String myString = "";
        
        for(int i = 0; i < myRoadTrip.size(); i++)
        {
            myString += (i + 1) + ". " + myRoadTrip.get(i).toString() + "\n";
        }
        
        return myString;
    }
}

RoadTripTester.java:
-------------------
public class RoadTripTester
{
    public static void main(String[] args)
    {
        RoadTrip rt = new RoadTrip();
        rt.addStop("San Francisco", 37.7833, -122.4167);
        rt.addStop("Los Angeles", 34.052235, -118.243683);
        rt.addStop("Las Vegas", 36.114647, -115.172813);

        
        System.out.println(rt);
        
        System.out.println("Stops: " + rt.getNumberOfStops());
        System.out.println("Total Miles: " + rt.getTripLength());
    }
}
