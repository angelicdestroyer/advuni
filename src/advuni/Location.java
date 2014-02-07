package advuni;

import java.util.ArrayList;

public class Location {
	
	String description;
	
	ArrayList<Item> items;
	
	public void addItem(Item item)
	{
		items.add(item);
	}
	
	@Override
	public String toString() {
		return description;
	}

}
