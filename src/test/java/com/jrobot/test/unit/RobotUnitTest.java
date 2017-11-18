package com.jrobot.test.unit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import jrobot.JRobotApiApp;
import jrobot.backend.entity.Coord;
import jrobot.backend.entity.Grid;
import jrobot.backend.entity.Movement;
import jrobot.backend.entity.MovementNorth;
import jrobot.backend.entity.OrientationNorth;
import jrobot.backend.entity.Robot;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = JRobotApiApp.class)
public class RobotUnitTest {
	
	@Test
	public void testRobotConstruction() throws Exception {
		Robot robot = new Robot(new Grid(), new Coord(0, 0, new OrientationNorth()));
		Assert.assertNotNull(robot);
	}

	@Test
	public void testTurnLeft() throws Exception {
		Robot robot = new Robot(new Grid(), new Coord(0, 0, new OrientationNorth()));
		robot.turnLeft();
		
		String coordString = robot.getCoord().getOrientacaoString();
		
		Assert.assertEquals("(0, 0, W)", coordString);
	}
	
	@Test
	public void testTurnRigth() throws Exception {
		Robot robot = new Robot(new Grid(), new Coord(0, 0, new OrientationNorth()));
		robot.turnRight();
		
		String coordString = robot.getCoord().getOrientacaoString();
		
		Assert.assertEquals("(0, 0, E)", coordString);
	}
	
	@Test
	public void testMoveNorth() throws Exception {
		Robot robot = new Robot(new Grid(), new Coord(0, 0, new OrientationNorth()));
		Movement movement = new MovementNorth();
		
		robot.setMovement(movement);
		robot.moveFromOrigem();
		
		String coordString = robot.getCoord().getOrientacaoString();
		
		Assert.assertEquals("(0, 1, N)", coordString);
	}
}
