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

    /**
     * Constructs a geo location object with given latitude and longitude
     */
    public GeoLocation(double theLatitude, double theLongitude) 
    {
        latitude = theLatitude;
        longitude = theLongitude;
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

    // returns a string representation of this geo location
    public String toString() 
    {
        return "latitude: " + latitude + ", longitude: " + longitude;
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


HowFarAway.java:
---------------
import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        Scanner inputN = new Scanner(System.in);
        
        System.out.print("Enter the latitude of the starting location: ");
        double sLat = inputN.nextDouble();
        
        System.out.print("\n");
        
        System.out.print("Enter the longitude of the starting location: ");
        double sLon = inputN.nextDouble();
        
        System.out.print("\n");
        
        System.out.print("Enter the latitude of the ending location: ");
        double eLat = inputN.nextDouble();
        
        System.out.print("\n");
        
        System.out.print("Enter the longitude of the ending location: ");
        double eLon = inputN.nextDouble();
        
        GeoLocation sgl = new GeoLocation(sLat, sLon);
        GeoLocation egl = new GeoLocation(eLat, eLon);
        
        System.out.println("The distance is " + egl.distanceFrom(sgl) + " miles.");    
    }
}

