package com.jrobot.test.unit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import jrobot.JRobotApiApp;
import jrobot.backend.entity.Coord;
import jrobot.backend.entity.Grid;
import jrobot.backend.entity.OrientationNorth;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = JRobotApiApp.class)
public class GridUnitTest {
		
	@Test
	public void testGridConstruction() throws Exception {
		Grid grid = new Grid();
		Assert.assertNotNull(grid);
	}
	
	@Test
	public void testGridLimits() throws Exception {
		Grid grid = new Grid();
		OrientationNorth orientationNorth = new OrientationNorth();
		Coord coord = new Coord(2, 2, orientationNorth);
		
		// Grid
		Assert.assertNotNull(grid);
		
		// Dentro do limite
		Assert.assertFalse(grid.isOffLimits(coord));
		
		// Fora do limite
		coord = new Coord(-1, -2, orientationNorth);
		Assert.assertTrue(grid.isOffLimits(coord));
	}
}
