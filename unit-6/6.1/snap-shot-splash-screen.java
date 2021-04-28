public class SnapShot
{
    public static void main(String[] args)
    {
        // Start here!
        String[] text = {"Welcome", "to", "the snap shot", "app!"};
        
        for(int i = 0; i < text.length; i++)
        {
            System.out.println(text[i]);
        }
        
        System.out.println();
        
        text[0] = "Upgrade";
        text[3] = "premium app!";
        
        for(int i = 0; i < text.length; i++)
        {
            System.out.println(text[i]);
        }
    }
}
