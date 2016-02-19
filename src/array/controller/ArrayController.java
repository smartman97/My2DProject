package array.controller;

import array.model.Player;
import array.view.ArrayFrame;

public class ArrayController
{
	private ArrayFrame baseFrame;
	private Player [][] myPlayer;
	
	public ArrayController()
	{
		myPlayer = new Player[3][3];
		baseFrame = new ArrayFrame(this);
	}
	
	public void start()
	{
		setupArray();
	}
	
	private void setupArray()
	{
		for(int row = 0; row < myPlayer.length; row++)
		{
			for(int col = 0; col < myPlayer[0].length; col++)
			{
				myPlayer[row][col] = new Player();
				if(col % 2 == 0)
				{
					myPlayer[row][col].setPosition("QB");
				}
				else
				{
					myPlayer[row][col].setName("Tom Brady");
				}
			}
		}
	}
	
	public Player [][] getMyPlayers()
	{
		return myPlayer;
	}
}
