package studio7;

public class Die {
	private int sides;
	
	public Die (int sides)
	{
		this.sides = sides;
	}
	
	public int rollDie ()
	{
		return (int)(Math.random() * sides + 1);
	}
}
