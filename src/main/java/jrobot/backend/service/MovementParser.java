package jrobot.backend.service;

import jrobot.backend.entity.Robot;
import jrobot.enums.DirectionEnum;
import jrobot.enums.ValidCommandsEnum;

/**
 * Recebe os comandos informados pelo usuario e traduz para a interface do robot
 * @author tiagoamorim
 *
 */

public class MovementParser {
	
	private MovementFactory movementFactory = new MovementFactory();
		
	/**
	 * Aplica os comandos recebidos
	 * @param String command comando unitário
	 * @param robot Robot a ser aplicado o comando
	 * @throws Exception
	 */
	public void applyCommand(String command, Robot robot) throws Exception{
		// Unifica os comandos
		command = command.toUpperCase();
		
		// Se não for movimento válido, gera erro
		if (! ValidCommandsEnum.isValidCommand(command)) {
			throw new Exception("[jRobot]: O comando '" + command + "' não é um movimento válido.");
		}
		
		// Converte para o enum original e aplica comando
		switch(ValidCommandsEnum.getByValue(command)) {
			case TURN_LEFT:
				robot.turnLeft();
				break;
			case TURN_RIGHT:
				robot.turnRight();
				break;
			case MOVE:
				// Cria novo movimento para a direção e move a partir do local
				DirectionEnum robotOrientation = robot.getCoord().getOrientacao().getDirecao();
				robot.setMovement(movementFactory.getMovement(robotOrientation));
				robot.moveFromOrigem();
		}
	}
	
	
}
