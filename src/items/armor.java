package items;

import dependencies.attribute.mainAttribute;
import dependencies.equipment.*;

public class armor extends Item {
	
	private final mainAttribute bonusAttribute;
	private final ArmorType armorType;
	
	
	//assign bonusAttributes for armors
	public armor(String name, int requiredLevel,ArmorType armorType, piece armorPiece, int bonusHealth, int bonusStrength, int bonusDexterity, int bonusIntelligence)
	{
		super(name, armorPiece, requiredLevel);
		this.armorType = armorType;
		this.bonusAttribute = new mainAttribute(bonusHealth, bonusStrength, bonusDexterity, bonusIntelligence);
	}

	public mainAttribute getBonusAttribute() {
		return bonusAttribute;
	}

	public ArmorType getArmorType() {
		return armorType;
	}
	
}

