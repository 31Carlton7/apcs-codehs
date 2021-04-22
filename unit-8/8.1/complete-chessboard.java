public class ChessBoard
{
    public static void main(String[] args)
    {
        //Create an 8x8 2D String array called chess.
        String[][] chess = new String[8][8];
        
        String[] piecesOne = {"Rook", "Knight", "Bishop", "Queen", "King", "Bishop", "Knight", "Rook"};
        String[] piecesTwo = {"Pawn", "Pawn", "Pawn", "Pawn", "Pawn", "Pawn", "Pawn", "Pawn"};
        String[] piecesThree = {"-", "-", "-", "-", "-", "-", "-", "-"};
        
        chess[0] = piecesOne;
        chess[chess.length - 1] = piecesOne;
        chess[1] = piecesTwo;
        chess[chess.length - 2] = piecesTwo;
        chess[2] = piecesThree;
        chess[3] = piecesThree;
        chess[4] = piecesThree;
        chess[5] = piecesThree;
        
        //Use this method to print the chess board onto the console
        print(chess);
        

    }
    
    //Do not make alterations to this method!
    public static void print(String[][] array)
    {
        for(String[] row: array)
        {
            for(String thing: row)
            {
                System.out.print(thing + "\t");
            }
            System.out.println();
        }
    }
}
