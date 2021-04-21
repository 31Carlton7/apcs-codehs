public class FallingBodies
{
    public static void main(String[] args)
    {
        double g = 9.8;
        double t = 10.0;
        double height = 0.5 * g * t * t;
        double velocity = g * t;
        
        System.out.println("The height of the cliff was " + height);
        System.out.println("The velocity the ball fell down at was " + velocity);
    }
}
