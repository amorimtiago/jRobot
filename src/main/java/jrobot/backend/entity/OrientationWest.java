package jrobot.backend.entity;

import jrobot.enums.DirectionEnum;

public class OrientationWest implements Orientation{
	private DirectionEnum direcao = DirectionEnum.WEST;
	
	@Override
	public Orientation turnLeft() {
		return (Orientation) new OrientationSouth();
	}

	@Override
	public Orientation turnRight() {
		return (Orientation) new OrientationNorth();
	}
	
	@Override
	public DirectionEnum getDirecao() {
		return this.direcao;
	}
}
