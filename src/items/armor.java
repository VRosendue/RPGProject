package items;

public class armor expands Item {
	
	private final PrimaryAttribute bonusAttributes;
	private final ArmorType armorType
	
	public armor(String name, Slot slot, int requiredLevel, ArmorType armorType, int bonusStrength, int bonusDexterity, int bonusIntelligence)
	{
		super(name, slot, requiredLevel);
		this.armorType = armorType;
		bonusAttributes = new PrimaryAttribute(bonusStrength, bonusDexterity, bonusIntelligence);
	}

	
	public PrimaryAttribute getBonusAttributes() {
		return bonusAttributes;
	}
	
	public ArmorType getArmorType() {
		return armorType;
	}
}
