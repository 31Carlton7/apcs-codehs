TicTacToe.java:
--------------
public class TicTacToe
{
    private String[][] board;
    
    public TicTacToe()
    {
        String[][] initBoard = {{"-", "-", "-"}, {"-", "-", "-"}, {"-", "-", "-"}};
        this.board = initBoard;
    }
    
    public String[][] getBoard()
    {
        return board;
    }
}

TicTacToeTester.java:
--------------------
public class TicTacToeTester
{
    //You don't need to alter any of the code in this class!
    //This is just to test that your TicTacToe class is working correctly
    public static void main(String[] args)
    {
        TicTacToe board = new TicTacToe();
        printBoard(board.getBoard());
    }
    
    public static void printBoard(String[][] array)
    {
        for(String[] row: array)
        {
            for(String play: row)
            {
                System.out.print(play+ " ");
            }
            System.out.println();
        }
    }
}

