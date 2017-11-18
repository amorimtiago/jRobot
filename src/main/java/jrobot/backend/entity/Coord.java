package jrobot.backend.entity;

/**
 * Define as coordenadas para o robot, com posição X, Y e 
 * 	Orientação do ponto cardeal
 * @author tiagoamorim
 *
 */
public class Coord {
	
	private int x = 0;
	private int y = 0;
	private Orientation orientacao;
	
	public Coord(int x, int y, Orientation orientacao) {
		this.x = x;
		this.y = y;
		this.orientacao = orientacao;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public Orientation getOrientacao() {
		return orientacao;
	}
	public void setOrientacao(Orientation orientacao) {
		this.orientacao = orientacao;
	}
	
	
	/**
	 * Retorna Coordenada formatada como String (x,y,D)
	 * @return
	 */
	public String getOrientacaoString() {
		return "(" + String.valueOf(this.x) +
			   ", " + String.valueOf(this.y) + 
			   ", " +  this.orientacao.getDirecao().getHeading() + ")";
	}
}
