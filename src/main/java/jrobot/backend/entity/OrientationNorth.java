package jrobot.backend.entity;

import jrobot.enums.DirectionEnum;

public class OrientationNorth implements Orientation{
	private DirectionEnum direcao = DirectionEnum.NORTH;
	
	@Override
	public Orientation turnLeft() {
		return (Orientation) new OrientationWest();
	}

	@Override
	public Orientation turnRight() {
		return (Orientation) new OrientationEast();
	}
	
	@Override
	public DirectionEnum getDirecao() {
		return this.direcao;
	}
}
