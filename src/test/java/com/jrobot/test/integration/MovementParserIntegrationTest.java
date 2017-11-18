package com.jrobot.test.integration;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import jrobot.JRobotApiApp;
import jrobot.backend.entity.Coord;
import jrobot.backend.entity.Grid;
import jrobot.backend.entity.OrientationNorth;
import jrobot.backend.entity.Robot;
import jrobot.backend.service.MovementParser;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = JRobotApiApp.class)
public class MovementParserIntegrationTest {

	private MovementParser movementParser = new MovementParser();
	
	
	@Test
	public void testInitialPositionIsCorrect() throws Exception {
		Robot robot = new Robot(new Grid(), new Coord(0, 0, new OrientationNorth()));
		// Posicao Inicial "(0, 0, N)"		
		String posicaoInicial = robot.getCoord().getOrientacaoString();
		Assert.assertEquals("(0, 0, N)", posicaoInicial);		
	}
	
	@Test
	public void testMove() throws Exception {	
		Robot robot = new Robot(new Grid(), new Coord(0, 0, new OrientationNorth()));
		// Comando Move
		movementParser.applyCommand("M", robot);
		Assert.assertEquals("(0, 1, N)", robot.getCoord().getOrientacaoString());
	}
	
	
	@Test
	public void testLeft() throws Exception {
		Robot robot = new Robot(new Grid(), new Coord(0, 0, new OrientationNorth()));
		// Comando Left
		movementParser.applyCommand("L", robot);
		Assert.assertEquals("(0, 0, W)", robot.getCoord().getOrientacaoString());
	}
	
	
	@Test
	public void testRight() throws Exception {
		Robot robot = new Robot(new Grid(), new Coord(0, 0, new OrientationNorth()));
		// Comando Right
		movementParser.applyCommand("R", robot);
		Assert.assertEquals("(0, 0, E)", robot.getCoord().getOrientacaoString());
		
	}
	
}
