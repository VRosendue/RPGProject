package dependencies.attribute;

public class mainAttribute {
	private int strength;
	private int dexterity;
	private int intelligence;
	private int health;
	
	
	//Setting main attributes
	public mainAttribute(int health, int strength, int dexterity, int intelligence) {
		this.health = health;
		this.strength = strength;
		this.dexterity = dexterity;
		this.intelligence = intelligence;
	}
	
	public int getHealth() {
		return health;
	}
	
	public int getStrength() {
		return strength;
	}
	
	public int getDexterity() {
		return dexterity;
	}
	
	public int getIntelligence() {
		return intelligence;
		
	}
	//setting up for level up incrementals
	public void incrementStats(int health, int strength, int dexterity, int intelligence) {
		this.health += health;
		this.strength += strength;
		this.dexterity += dexterity;
		this.intelligence += intelligence;
	}

}
