package com.jrobot.test.integration;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import org.junit.Assert;

import jrobot.JRobotApiApp;
import jrobot.backend.service.RobotService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = JRobotApiApp.class)
public class RobotServiceIntegrationTest {

	private RobotService robotService = new RobotService();
	
	@Before
	public void init() {
		Assert.assertNotNull(robotService);
	}
	
	@Test
	public void testPosicao1() throws Exception{
		String[] commands = "MMRMMRMM".split("");
		String expectedPosition = "(2, 0, S)";
		
		robotService.processCommands(commands);
		
		Assert.assertEquals(expectedPosition, robotService.getRobotCoordString());
	}
	
	@Test
	public void testPosicao2() throws Exception{
		String[] commands = "MML".split("");
		String expectedPosition = "(0, 2, W)";
		
		robotService.processCommands(commands);
		
		Assert.assertEquals(expectedPosition, robotService.getRobotCoordString());
	}
	
	@Test
	public void testPosicao2Repeticao() throws Exception{
		String[] commands = "MML".split("");
		String expectedPosition = "(0, 2, W)";
		
		robotService.processCommands(commands);
		robotService.processCommands(commands);
		
		Assert.assertEquals(expectedPosition, robotService.getRobotCoordString());
	}
	
	@Test(expected = Exception.class)
	public void testComandoInvalido() throws Exception{
		String[] commands = "AAA".split("");
		
		robotService.processCommands(commands);
	}
	
	
	@Test(expected = Exception.class)
	public void testForaLimite() throws Exception{
		String[] commands = "MMMMMMMMMMMMMMMMMMMMMMMM".split("");
		
		robotService.processCommands(commands);
	}
	
}
