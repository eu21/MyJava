public class Monster{ // class should begin with CAPITAL letter
	
	public final String TOMBSTONE = "Here lies a dead monster";
	
	private int health = 500;
	private int attack = 20;
	private int movement = 2;
	private int xPosition = 0;
	private int yPosition = 0;
	private boolean alive = true;
	
	
	public String name = "Big Monster";
	
	public int getAttack() //Accessor methods - they have access to private variables
	{
		return attack;
	}
	
	public int getMovement()
	{
		return movement;
	}
	
	public int getHealth()
	{
		return health;
	}
	
	public void setHealth(int decreaseHealth)
	{
		health = health - decreaseHealth;
		
		if (health < 0)
		{
			alive = false;
		}
	}
	
	public void setHealth(double decrease) //Override method setHealth. Name the same but attribute must be different.
	{
		int intDecreaseHealth = (int) decrease;
		health = health - intDecreaseHealth;
		
		if (health < 0)
		{
			alive = false;
		}
	}
	
	public Monster(int newHealth, int newAttack, int newMovement) //Constructor can't return any value
	{
		health = newHealth;
		attack=newAttack;
		movement = newMovement;
	}
	
	//Default constructor does nothing, if you not define any constructor
	public Monster() //Overloading constructor
	{
		
	}
	
	public static void main(String[] args)
	{
		Monster Frank = new Monster();
		
		System.out.println(Frank.attack);
		
		
	}
	
	
}