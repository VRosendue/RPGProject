package dependencies.attribute;

public class mainAttribute {
	private int strength;
	private int dexterity;
	private int intelligence;
	private int health;
	
	
	
	public mainAttribute(int health, int strength, int dexterity, int intelligence) {
		this.health = health;
		this.strength = strength;
		this.dexterity = dexterity;
		this.intelligence = intelligence;
	}
	
	/*@Override
	//public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null) || getClass() != o.getClass())) return false;
		
		PrimaryAttribute that = (PrimaryAttribute) o;
		
		if (strength != that.strength) return false;
		if (dexterity != that.dexterity) return false;
		return intelligence == that.intelligence;*/
	}
	
	//@Override
	//public int hashCode() {
		//int result = strength;
		//result = 31 * result + dexterity;
		//result = 31 * result + intelligence;
		//return result;
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
	
	public void incrementStats(int health, int strength, int dexterity, int intelligence) {
		this.health += health;
		this.strength += strength;
		this.dexterity += dexterity;
		this.intelligence += intelligence;
	}

}
