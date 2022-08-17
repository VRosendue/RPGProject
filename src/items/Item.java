package items;

public class Item {
	
	private final String name;
	private final Slot slot;
	private final int requiredLevel;
	
	public Item(String name, Slot slot, int requiredLevel) {
		this.name = name;
		this.slot = slot;
		this.requiredLevel = requiredLevel;
	}
	
	public String getName() {
		return name;
	}
	
	public Slot getSlot() {
		return slot;
	}
	
	public int getRequiredLevel() {
		return requiredLevel;
	}

}
