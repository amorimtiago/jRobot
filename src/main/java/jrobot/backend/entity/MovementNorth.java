package jrobot.backend.entity;

public class MovementNorth implements Movement{
	/**
	 * Aplica calculo para "subida" do robo - norte
	 * 
	 * @param Coord coord Coordenadas iniciais para calculo
	 * @return Coord novas coordenadas calculadas
	 */
	@Override
	public Coord move(Coord coord) {
		return new Coord( coord.getX(), coord.getY() + 1, coord.getOrientacao());
	}
}
