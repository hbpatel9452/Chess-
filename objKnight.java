public class objKnight extends objChessPieces
{
	
	public void objKnight ()
	{
	}
	
	public boolean legalMove (int startRow, int startColumn, int desRow, int desColumn, int[][] playerMatrix)
	{
		
		finalDesRow = desRow;
		finalDesColumn = desColumn;
		strErrorMsg = "Horse can only move in a L shape";
		
		if (desRow == (startRow - 2) && desColumn == (startColumn - 1)) 
		{
			return true;
		}
		else if (desRow == (startRow - 2) && desColumn == (startColumn + 1)) 
		{
			return true;
		}
		else if (desRow == (startRow + 2) && desColumn == (startColumn - 1)) 
		{
			return true;
		}
		else if (desRow == (startRow + 2) && desColumn == (startColumn + 1)) 
		{
			return true;
		}
		else if (desRow == (startRow - 1) && desColumn == (startColumn - 2)) 
		{
			return true;
		}
		else if (desRow == (startRow - 1) && desColumn == (startColumn + 2))
		{
			return true;
		}
		else if (desRow == (startRow + 1) && desColumn == (startColumn - 2)) 
		{
			return true;
		}
		else if (desRow == (startRow + 1) && desColumn == (startColumn + 2))
		{
			return true;
		}
		
		return false;
		
	}
	
}