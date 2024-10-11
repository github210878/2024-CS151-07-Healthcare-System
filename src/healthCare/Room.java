package healthCare;

public abstract class Room {
	
	int capacity;
	int currentPopulation;
	
	public Room()
	{
		capacity = 1;
		currentPopulation = 0;
	}
	
	public Room(int max)
	{
		capacity = max;
		currentPopulation = 0;
		
	}
	
	public boolean addPatients(int i)
	{
		if(currentPopulation < capacity)
		{
			currentPopulation += i;
			return true;
		} else
		{
			return false;
		}
		
	}
	
	public int getCapacity()
	{
		return capacity;
	}
	
	public int getCurrentPopulation()
	{
		return currentPopulation;
	}
	

}
