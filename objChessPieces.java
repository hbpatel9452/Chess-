public class objChessPieces
{
	
	protected int finalDesRow = 0;
	protected int finalDesColumn = 0;
	protected String strErrorMsg = "";
	
	public objChessPieces ()
	{
	}
	
	private boolean checkAxisMove (int newRow, int newColumn, int[][] playerMatrix)
	{
		
		if (playerMatrix[newRow][newColumn] != 0) 
		{

			strErrorMsg = "A piece is blocking the route"; 
			return false;
			
		}
		
		return true;
		
	}
	
	protected boolean axisMove (int startRow, int startColumn, int desRow, int desColumn, int[][] playerMatrix, boolean straightAxis)
	{
		
		if (straightAxis) 
		{
			
			if ((startColumn == desColumn) && (startRow != desRow)) 
			{
				
				if (desRow < startRow) 
				{					
					
					for (int newRow = (startRow - 1); newRow > desRow; newRow--) 
					{
						
						if (!checkAxisMove(newRow, desColumn, playerMatrix))
						{
							return false;
						}
						
					}

				}
				else 
				{
					
					for (int newRow = (startRow + 1); newRow < desRow; newRow++)
					{
						
						if (!checkAxisMove(newRow, desColumn, playerMatrix))
						{
							return false;
						}
							
					}
				
				}
				
			}
			else if ((startRow == desRow) && (startColumn != desColumn)) 
			{
				
				if (desColumn < startColumn) 
				{
					
					for (int newColumn = (startColumn - 1); newColumn > desColumn; newColumn--)
					{
						
						if (!checkAxisMove(desRow, newColumn, playerMatrix))
						{
							return false;
						}
						
					}
				
				}
				else 
				{
					
					for (int newColumn = (startColumn + 1); newColumn < desColumn; newColumn++)
					{
						
						if (!checkAxisMove(desRow, newColumn, playerMatrix))
						{
							return false;
						}
						
					}
					
				}
				
			}
			else 
			{
				
				strErrorMsg = "Should not see this error message";
				return false;
				
			}
		
		}
		else 
		{
			
			strErrorMsg = "The destination is not on the same diagonal line"; 
			int newColumn = 0;
			
			if (desRow < startRow && desColumn < startColumn) 
			{
				
				if ((desRow - startRow) == (desColumn - startColumn))
				{
					
					for (int newRow = (startRow - 1); newRow > desRow; newRow--)
					{
						
						newColumn = startColumn - (startRow - newRow);

						if (!checkAxisMove(newRow, newColumn, playerMatrix))
						{
							return false;
						}
						
					}

				}
				else
				{
					return false;
				}
	
			}
			else if (desRow < startRow && desColumn > startColumn) 
			{
				
				if ((desRow - startRow) == (startColumn - desColumn))
				{
					
					for (int newRow = (startRow - 1); newRow > desRow; newRow--)
					{
						
						newColumn = startColumn + (startRow - newRow);

						if (!checkAxisMove(newRow, newColumn, playerMatrix))
						{
							return false;
						}
						
					}

				}
				else
				{
					return false;
				}
				
			}
			else if (desRow > startRow && desColumn < startColumn) 
			{
				
				if ((startRow - desRow) == (desColumn - startColumn))
				{
					
					for (int newRow = (startRow + 1); newRow < desRow; newRow++)
					{
						
						newColumn = startColumn - (newRow - startRow);

						if (!checkAxisMove(newRow, newColumn, playerMatrix))
						{
							return false;
						}
						
					}

				}
				else
				{
					return false;
				}
				
			}
			else if (desRow > startRow && desColumn > startColumn) 
			{
				
				if ((startRow - desRow) == (startColumn - desColumn))
				{
					
					for (int newRow = (startRow + 1); newRow < desRow; newRow++)
					{
						
						newColumn = startColumn + (newRow - startRow);

						if (!checkAxisMove(newRow, newColumn, playerMatrix))
						{
							return false;
						}
						
					}

				}
				else
				{
					return false;
				}
				
			}
			else 
			{
				
				strErrorMsg = "Should never see this error message";
				return false;
				
			}
		
		}		
		
		finalDesRow = desRow;
		finalDesColumn = desColumn;
		
		return true;
		
	}
	
	public int getDesRow ()
	{
		return finalDesRow;
	}
	
	public int getDesColumn ()
	{
		return finalDesColumn;
	}
	
	public String getErrorMsg ()
	{
		return strErrorMsg;
	}
	
}