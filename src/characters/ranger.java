package characters;

public class ranger {

	public class Ranger extends player {
		public Ranger(String name) {
			super(name, 1, 7, 1);
			validWeaponTypes = List.of(WeaponType.BOW);
			validArmorTypes = List.of(ArmorType.LEATHER, ArmorType.MAIL);
		}
		
		@Override
		public String levelUp() {
			characterAttributes.increase(1,5,1);
			return super.levelUp();
		}
	}


}
