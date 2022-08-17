package characters;

public class warrior {

	public class Warrior extends player {
		public Warrior(String name) {
			super(name, 5, 2, 1);
			validWeaponTypes = List.of(WeaponType.Axe, WeaponType.HAMMER, WeaponType.SWORD);
			validArmorTypes = List.of(ArmorType.MAIL , ArmorType.PLATE);
		}
		
		@Override
		public String levelUp() {
			characterAttributes.increase(3,2,1);
			return super.levelUp();
		}
	}


}
