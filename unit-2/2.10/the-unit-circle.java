public class UnitCircle 
{
    public static void main(String[] args)
    {
        System.out.println("Radians: (cos, sin)");
        
        double angle = 0;
        double cosine = Math.cos(angle);
        cosine = Math.round(cosine * 100) / 100.0;
        double sin = Math.sin(angle);
        sin = Math.round(sin * 100) / 100.0;
        System.out.println(angle + ": " + cosine + "," + sin);

        angle = Math.PI/2;
        
        cosine = Math.cos(angle);
        cosine = Math.round(cosine * 100) / 100.0;
        
        sin = Math.sin(angle);
        sin = Math.round(sin * 100) / 100.0;
        
        System.out.println(angle + ": " + cosine + "," + sin);


        angle = Math.PI;
        
        cosine = Math.cos(angle);
        cosine = Math.round(cosine * 100) / 100.0;
        
        sin = Math.sin(angle);
        sin = Math.round(sin * 100) / 100.0;
        
        System.out.println(angle + ": " + cosine + "," + sin);
    }
}
