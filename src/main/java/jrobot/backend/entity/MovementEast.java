package jrobot.backend.entity;

public class MovementEast implements Movement{	
	/**
	 * Aplica calculo para "virada à direita" do robo - leste
	 * 
	 * @param Coord coord Coordenadas iniciais para calculo
	 * @return Coord novas coordenadas calculadas
	 */
	@Override
	public Coord move(Coord coord) {
		return new Coord( coord.getX()+1, coord.getY(), coord.getOrientacao());
	}

}
