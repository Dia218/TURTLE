package world.object;

import item.Item;

abstract public class Object extends Item{
	public String object_name;
	
	public String returnName() {
		return object_name;
	}
}