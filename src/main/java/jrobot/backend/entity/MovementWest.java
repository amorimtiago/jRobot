package jrobot.backend.entity;

public class MovementWest implements Movement{
	/**
	 * Aplica calculo para "virada à esquerda" do robo - Oeste
	 * 
	 * @param Coord coord Coordenadas iniciais para calculo
	 * @return Coord novas coordenadas calculadas
	 */
	public Coord move(Coord coord) {
		return new Coord(coord.getX() -1, coord.getY(), coord.getOrientacao());
	}
}
