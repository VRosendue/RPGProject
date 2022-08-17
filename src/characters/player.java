package characters;

public abstract class player {
	
	private final String name;
	private int level = 1;
	protected PrimaryAttribute characterAttributes;
	private HashMap<Slot, Item> equipment;
	protected List<WeaponType> validWeaponTypes;
	protected List<ArmorType> validArmorTypes;
	
	public player(String name, int strength, int dexterity, int intelligence) {
		this.name = name;
		characterAttributes = new PrimaryAttribute(strength,dexterity,intelligence);
		initializeEquipment();
	}
	
	private void initializeEquipment() {
		equipment = new HashMap<>();
		equipment.put(Slot.HEAD, null);
		equipment.put(Slot.BODY, null);
		equipment.put(Slot.LEGS, null);
		equipment.put(Slot.WEAPON, null);
		
	}
	
	public String equip(Weapon weapon) throws InvalidWeaponException {
		if(weapon.getRequiredLevel() > level)
			throw new InvalidWeaponException("Weapon level too high");
		
		if(!validWeaponTypes.contains(weapon.getWeaponType()))
			throw new InvalidWeaponException("Wrong weapon type");
		
		equipment.put(weapon.getSlot(), weapon);
		return "Weapon equipped";
		
		
	}
	
	public String levelUp() {
		level++;
		return name + "levelled up, they are now level" + level;
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getLevel() {
		return level;
	}
	
	public PrimaryAttribute getCharacterAttributes() {
		return characterAttributes;
	}
	

}
