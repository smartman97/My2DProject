package array.model;

public class Player
{
	private String name;
	private String position;
	
	public Player()
	{
		this.name = "Bob";
		this.position = "Bench";
	}
	
	public Player(String name, String position)
	{
		this.name = name;
		this.position = position;
	}
	
	public String toString()
	{
		String playerDescription = "This players name is " + name + " and he plays " + position;
		
		return playerDescription;
	}

	public String getName()
	{
		return name;
	}

	public String getPosition()
	{
		return position;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setPosition(String position)
	{
		this.position = position;
	}
	
	
}
