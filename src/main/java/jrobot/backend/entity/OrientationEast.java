package jrobot.backend.entity;

import jrobot.enums.DirectionEnum;

public class OrientationEast implements Orientation{
	private DirectionEnum direcao = DirectionEnum.EAST;
	
	@Override
	public Orientation turnLeft() {
		return (Orientation) new OrientationNorth();
	}

	@Override
	public Orientation turnRight() {
		return (Orientation) new OrientationSouth();
	}
	
	@Override
	public DirectionEnum getDirecao() {
		return this.direcao;
	}
}
