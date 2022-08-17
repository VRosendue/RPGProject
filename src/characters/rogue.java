package characters;

public class rogue {
	

	public class Rogue extends player {
		public Rogue(String name) {
			super(name, 2, 6, 1);
			validWeaponTypes = List.of(WeaponType.DAGGER, WeaponType.SWORD);
			validArmorTypes = List.of(ArmorType.LEATHER, ArmorType.MAIL);
		}
		
		@Override
		public String levelUp() {
			characterAttributes.increase(1,4,1);
			return super.levelUp();
		}
	}
}



