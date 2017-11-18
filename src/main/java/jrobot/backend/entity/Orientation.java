package jrobot.backend.entity;

import jrobot.enums.DirectionEnum;

/**
 * Interface para mudança de orientação através da direção atual
 * Cada implementação possui sua nova direção (state), de acordo com a atual
 * @author tiagoamorim
 *
 */
public interface Orientation {
	DirectionEnum direcao = DirectionEnum.NORTH;
	DirectionEnum getDirecao();
	Orientation turnLeft();
	Orientation turnRight();
	
}
