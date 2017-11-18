package jrobot.backend.service;

import jrobot.backend.entity.Movement;
import jrobot.backend.entity.MovementEast;
import jrobot.backend.entity.MovementNorth;
import jrobot.backend.entity.MovementSouth;
import jrobot.backend.entity.MovementWest;
import jrobot.enums.DirectionEnum;

/**
 * Cria novo movimento de acordo com direção atual
 * @author tiagoamorim
 *
 */
public class MovementFactory {

	public Movement getMovement(DirectionEnum direcao) {
		switch(direcao){
			case NORTH:
				return new MovementNorth();
			case SOUTH:
				return new MovementSouth();
			case EAST:
				return new MovementEast();
			case WEST:
				return new MovementWest();
			default: 
				return new MovementNorth();
		}
	}
}
