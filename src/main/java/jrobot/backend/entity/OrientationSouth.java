package jrobot.backend.entity;

import jrobot.enums.DirectionEnum;

public final class OrientationSouth implements Orientation{
	private DirectionEnum direcao = DirectionEnum.SOUTH;
	
	@Override
	public Orientation turnLeft() {
		return (Orientation) new OrientationEast();
	}

	@Override
	public Orientation turnRight() {
		return (Orientation) new OrientationWest();
	}

	@Override
	public DirectionEnum getDirecao() {
		return this.direcao;
	}
}
