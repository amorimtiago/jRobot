package com.jrobot.test.unit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import jrobot.JRobotApiApp;
import jrobot.backend.entity.Coord;
import jrobot.backend.entity.OrientationNorth;

import org.junit.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = JRobotApiApp.class)
public class CoordUnitTest {
	
	@Test
	public void testCoordConstruction() throws Exception {
		OrientationNorth orientationNorth = new OrientationNorth();
		Coord coord = new Coord(0, 0, orientationNorth);
		
		Assert.assertNotNull(coord);
		Assert.assertEquals("(0, 0, N)", coord.getOrientacaoString());
	}
	
}
