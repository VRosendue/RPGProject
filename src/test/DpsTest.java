package test;
import items.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dependencies.equipment.WeaponType;
import dependencies.equipment.piece;

class DpsTest {

	@Test
	void dpstest() {
		double expected = 7 * 1.1;
		
		
		weapon testWeapon = new weapon("Common Axe", piece.WEAPON , 1, 7, 1.1, WeaponType.AXE);
		
		double actual = testWeapon.calculateDps();
		
		assertEquals(expected, actual);
	}

}
