package jrobot.backend.entity;

public class MovementSouth implements Movement{
	
	/**
	 * Aplica calculo para "descida" do robo - sul
	 * 
	 * @param Coord coord Coordenadas iniciais para calculo
	 * @return Coord novas coordenadas calculadas
	 */
	public Coord move(Coord coord) {
		return new Coord(coord.getX(), coord.getY() - 1, coord.getOrientacao());
	}
	
}
