package jrobot.backend.entity;

/**
 * Classe do robot atuando com as interfaces para movimento e orientação.
 * @author tiagoamorim
 *
 */
public class Robot {

	private Coord coordenada;
	private Grid grid;
	private Movement movement;
	
	public Robot (Grid grid, Coord coord) {
		this.grid = grid;
		this.coordenada = coord;
	}
	
	public void turnRight() {
		this.coordenada.setOrientacao( this.coordenada.getOrientacao().turnRight() );
	}
	
	public void turnLeft() {
		this.coordenada.setOrientacao( this.coordenada.getOrientacao().turnLeft() );
	}
	
	public void moveFromOrigem() {
		this.coordenada = this.movement.move(this.coordenada);
	}
	
	public Coord getCoord() {
		return this.coordenada;
	}
	

	public void setCoord(Coord coord) {
		this.coordenada = coord;
	}
	
	public Grid getBoard() {
		return grid;
	}

	public void setBoard(Grid grid) {
		this.grid = grid;
	}
	
	public Movement getMovement() {
		return movement;
	}

	public void setMovement(Movement movement) {
		this.movement = movement;
	}
	
	
}


