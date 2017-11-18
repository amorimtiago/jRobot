package jrobot.backend.service;

import org.springframework.stereotype.Service;

import jrobot.backend.entity.Grid;
import jrobot.backend.entity.Coord;
import jrobot.backend.entity.OrientationNorth;
import jrobot.backend.entity.Robot;


@Service
public class RobotService {
	
	private Robot robot;
	
	private MovementParser movementParser = new MovementParser();
	
	/**
	 * Inicia processo de validação e aplicação dos comandos do robo
	 * @param String[] commandList lista de comandos já convertida em string 
	 * @throws Exception
	 */
	public void processCommands(String[] commandList) throws Exception {
		robot = new Robot(new Grid(), new Coord(0, 0, new OrientationNorth()));

		// Circula lista de commandos
		for(String command : commandList) {
			// Aplica comando ao robo, se for válido
			movementParser.applyCommand(command, robot);
			
			// Se robot saiu do limite, retorna exception
			if (robot.getBoard().isOffLimits(robot.getCoord())) {
				throw new Exception("[jRobot]: Limite do Grid excedido.");
			}
		}
	}
	
	/**
	 * Consulta coordenadas do Robot
	 * @return
	 */
	public String getRobotCoordString() {
		return robot.getCoord().getOrientacaoString();
	}
	
	
}
