TicTacToe.java:
--------------
import java.util.Arrays; 

public class TicTacToe
{
   //copy over your constructor from the Tic Tac Toe Board activity in the previous lesson!
   private int turn;
   private String[][] board;
   private String[] x = {"X", "X", "X"};
   private String[] o = {"O", "O", "O"};
   
   public TicTacToe()
    {
        String[][] initBoard = {{"-", "-", "-"}, {"-", "-", "-"}, {"-", "-", "-"}};
        this.board = initBoard;
        this.turn = turn;
    }
   
   //this method returns the current turn
   public int getTurn()
   {
       return turn;
   }
   
   /*This method prints out the board array on to the console
   */
   public void printBoard()
   {
        System.out.println("  0 1 2");
        
       for(int rows = 0; rows < board.length; rows++)
       {
           System.out.print(rows + " ");
           for(int cols = 0; cols < board[rows].length; cols++)
           {
               System.out.print(board[rows][cols] + " ");
           }
        System.out.println();
       }
   }
   
   //This method returns true if space row, col is a valid space
   public boolean pickLocation(int row, int col)
   {
       if(board[row][col] == "-")
       {
           return true;
       }
       else
       {
           return false;
       }
   }
   
   //This method places an X or O at location row,col based on the int turn
   public void takeTurn(int row, int col)
   {
       if(turn % 2 == 0)
       {
           board[row][col] = "X";
       }
       else
       {
           board[row][col] = "O";
       }
       
       turn++;
   }
   
   //This method returns a boolean that returns true if a row has three X or O's in a row
   public boolean checkRow()
   {
       boolean isTrue;
       
       if(Arrays.equals(board[0], x) || Arrays.equals(board[1], x) || Arrays.equals(board[2], x) || Arrays.equals(board[0], o) || Arrays.equals(board[1], o) || Arrays.equals(board[2], o))
       {
           isTrue = true;
       }
       else
       {
           isTrue = false;
       }
       
       return isTrue;
   }
   
    //This method returns a boolean that returns true if a col has three X or O's
   public boolean checkCol()
   {
      boolean isTrue;
       
      if(board[0][0] == "X" && board[1][0] == "X" && board[2][0] == "X")
       {
           isTrue = true;
       }
       else if(board[0][0] == "O" && board[1][0] == "O" && board[2][0] == "O")
       {
           isTrue = true;
       }
       else
       {
           isTrue = false;
       }
       
      return isTrue;
   }
   
    //This method returns a boolean that returns true if either diagonal has three X or O's
   public boolean checkDiag()
   {
       boolean isTrue;
       
       if(board[0][0] == "X" && board[1][1] == "X" && board[2][2] == "X")
       {
           isTrue = true;
       }
       else if(board[0][0] == "O" && board[1][1] == "O" && board[2][2] == "O")
       {
           isTrue = true;
       }
       else
       {
           isTrue = false;
       }
       
       return isTrue;
   }
   
   //This method returns a boolean that checks if someone has won the game
   public boolean checkWin()
   {
       boolean isTrue;
       
       if(checkDiag() || checkCol() || checkRow())
       {
           isTrue = true;
       }
       else
       {
           isTrue = false;
       }
       
       return isTrue;
   }

}

TicTacToeTester.java:
--------------------
import java.util.Arrays; 

public class TicTacToeTester
{
    public static void main(String[] args)
    {
        //This is to help you test your methods. Feel free to add code at the end to check
        //to see if your checkWin method works!
        TicTacToe game = new TicTacToe();
        System.out.println("Initial Game Board:");
        game.printBoard();
        
        //Prints the first row of turns taken
        for(int row = 0; row < 3; row++)
        {
            if(game.pickLocation(0, row))
            {
                game.takeTurn(0, row);
            }
        }
        System.out.println("\nAfter three turns:");
        game.printBoard();
        
        
    
    }
}


