package characters;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import dependencies.equipment.ArmorType;
import dependencies.equipment.WeaponType;
import dependencies.equipment.piece;
import exceptions.IncorrectArmorTypeException;
import exceptions.IncorrectWeaponTypeException;
import exceptions.PlayerTooLowException;
import items.Item;
import items.armor;
import items.weapon;

public class warrior extends player {
	
	private List<WeaponType> validWeaponTypes = new ArrayList<>();
	private List<ArmorType> validArmorTypes = new ArrayList<>();

	public warrior(String name) {
		super(name, 100, 5, 2, 1);

		validWeaponTypes = List.of(WeaponType.AXE, WeaponType.HAMMER, WeaponType.SWORD);
		validArmorTypes = List.of(ArmorType.MAIL, ArmorType.PLATE);
	}

	@Override
	public void levelUp() {
		classAttribute.incrementStats(10, 3, 2, 1);
	}

	public List<WeaponType> getValidWeaponTypes() {
		return validWeaponTypes;
	}

	public void setValidWeaponTypes(List<WeaponType> validWeaponTypes) {
		this.validWeaponTypes = validWeaponTypes;
	}

	public List<ArmorType> getValidArmorTypes() {
		return validArmorTypes;
	}

	public void setValidArmorTypes(List<ArmorType> validArmorTypes) {
		this.validArmorTypes = validArmorTypes;
	}

	@Override
	public void equipWeapon(weapon weapon) throws IncorrectWeaponTypeException, PlayerTooLowException {
		if (this.getLevel() < weapon.getRequiredLevel()) {
			throw new PlayerTooLowException("player too low level to equip item");
		} else if (!this.validWeaponTypes.contains(weapon.getWeaponType())) {
			throw new IncorrectWeaponTypeException("ranger cannot wield " + weapon.getWeaponType());
		} else {
			HashMap<piece, Item> tempEquipment = getCurrentEquipment().getEquippable();
			tempEquipment.put(piece.WEAPON, weapon);
			this.getCurrentEquipment().setEquippable(tempEquipment);
		}

	}

	@Override
	public void equipArmor(armor armor) throws IncorrectArmorTypeException, PlayerTooLowException {
		if (this.getLevel() < armor.getRequiredLevel()) {
			throw new PlayerTooLowException("player too low level to equip item");
		} else if (!this.validArmorTypes.contains(armor.getArmorType())) {
			throw new IncorrectArmorTypeException("ranger cannot wield " + armor.getArmorType());
		} else {
			HashMap<piece, Item> tempEquipment = getCurrentEquipment().getEquippable();
			tempEquipment.put(piece.CHESTPIECE, armor);
			tempEquipment.put(piece.LEGPIECE, armor);
			tempEquipment.put(piece.HEADPIECE, armor);
			this.getCurrentEquipment().setEquippable(tempEquipment);
		}

	}

}