package characters;

import dependencies.attribute.mainAttribute;
import items.equipment;
import items.weapon;
import items.armor;
import exceptions.*;

public abstract class player {

	private int level = 1;
	protected mainAttribute classAttribute;
    private equipment currentEquipment;
	private final String name;

	public player(String name, int health, int strength, int dexterity, int intelligence) {
		this.name = name;
		classAttribute = new mainAttribute(health, strength, dexterity, intelligence);
		setCurrentEquipment(new equipment());
	}

	public abstract void equipWeapon(weapon weapon) throws IncorrectWeaponTypeException, PlayerTooLowException;

	public abstract void equipArmor(armor armor) throws IncorrectArmorTypeException, PlayerTooLowException;

	public abstract void levelUp();

	public String getName() {
		return name;
	}

	public int getLevel() {
		return level;
	}

	public mainAttribute getclassAttribute() {
		return classAttribute;
	}

	public equipment getCurrentEquipment() {
		return currentEquipment;
	}

	public void setCurrentEquipment(equipment currentEquipment) {
		this.currentEquipment = currentEquipment;
	}

}
