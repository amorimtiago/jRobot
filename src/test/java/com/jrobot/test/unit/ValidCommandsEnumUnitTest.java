package com.jrobot.test.unit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import jrobot.JRobotApiApp;
import jrobot.enums.ValidCommandsEnum;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = JRobotApiApp.class)
public class ValidCommandsEnumUnitTest {

	
	@Test
	public void testIsValidCommand() throws Exception {
		
		Assert.assertTrue(ValidCommandsEnum.isValidCommand("M"));
		Assert.assertTrue(ValidCommandsEnum.isValidCommand("L"));
		Assert.assertTrue(ValidCommandsEnum.isValidCommand("R"));
		Assert.assertFalse(ValidCommandsEnum.isValidCommand("A"));
	}
}
