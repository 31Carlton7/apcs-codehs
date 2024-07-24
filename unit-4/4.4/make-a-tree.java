public class TreeOfStars
{
    public static void main(String[] args)
    {
         // Call makeATree 
	     makeATree();
    }
    public static void makeATree()
    {
       int numLevels = 9;
       int longestLevelWidth = (numLevels * 2) + 1;
       for(int i = 0; i < numLevels; i++) {
           int spacing = longestLevelWidth/2 - i;
           
           for(int j = 0; j < spacing; j++) {
               System.out.print(" ");
           }
           
           for(int k = 0; k <= i; k++) {
               System.out.print(" *");
           }
           
           System.out.print(" ");
           System.out.println();
        }
     }
}
