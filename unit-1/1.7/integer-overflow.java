public class IntegerOverflow
{
    public static void main(String[] args)
    {
        int maxValue = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;
        
        System.out.println(minValue);
        System.out.println(maxValue);
        System.out.println(minValue - 1);
        System.out.println(maxValue + 1);
    }
}
