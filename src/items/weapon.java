package items;

public class weapon extends Item {
	
	private final double damage;
	private final double speed;
	private final WeaponType weaponType;
	
	public Weapon(String name, int requiredLevel, WeaponType weaponType, double damage, double speed)
	{
		super(name, piece.WEAPON, requiredLevel);
		this.damage = damage;
		this.speed = speed;
		this.weaponType = weaponType;
		
	}
	
	public double getDps() {
		return damage*speed;
	}
	
	
	public WeaponType getWeaponType() {
		return weaponType;
	}
	

}
