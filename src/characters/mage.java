package characters;

public class mage {
	
	public class Mage extends player {
		public Mage(String name) {
			super(name, 1, 1, 8);
			validWeaponTypes = List.of(WeaponType.STAFF, WeaponType.WAND);
			validArmorTypes = List.of(ArmorType.CLOTH);
		}
		
		@Override
		public String levelUp() {
			characterAttributes.increase(1,1,5);
			return super.levelUp();
		}
	}

}
