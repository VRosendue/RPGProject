package items;

import dependencies.equipment.WeaponType;
import dependencies.equipment.piece;

public class weapon extends Item {

	private final double flatDamage;
	private final double weaponSpeed;
	private final WeaponType weaponType;
	private double dps;

	public weapon(String name, piece slot, int requiredLevel, double flatDamage, double weaponSpeed,
			WeaponType weaponType) {
		super(name, slot, requiredLevel);
		this.flatDamage = flatDamage;
		this.weaponSpeed = weaponSpeed;
		this.weaponType = weaponType;
		this.dps = calculateDps();

	}

	public double calculateDps() {
		return dps = flatDamage * weaponSpeed;
	}

	public double getFlatDamage() {
		return flatDamage;
	}

	public double getWeaponSpeed() {
		return weaponSpeed;
	}

	public WeaponType getWeaponType() {
		return weaponType;
	}

	public double getDps() {
		return dps;
	}

	public void setDps(double dps) {
		this.dps = dps;
	}

}
