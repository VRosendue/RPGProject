package items;

import dependencies.equipment.piece;

public class Item {
	
	private final String name;
	private final piece slot;
	private final int requiredLevel;
	
	public Item(String name, piece slot, int requiredLevel) {
		this.name = name;
		this.slot = slot;
		this.requiredLevel = requiredLevel;
	}
	
	public String getName() {
		return name;
	}
	
	public piece getSlot() {
		return slot;
	}
	
	public int getRequiredLevel() {
		return requiredLevel;
	}

}
