package jrobot.backend.entity;

/**
 * Define o grid onde o robot atua
 * @author tiagoamorim
 *
 */

public class Grid {
	private final int initX = 0;
	private final int initY = 0;
	private final int limitX = 4;
	private final int limitY = 4;
	
	/**
	 * Retorna se coordenadas informadas estão fora do limite do grid
	 * 
	 * @param Coord coord
	 * @return boolean
	 */
	public boolean isOffLimits(Coord coord) {
		if (coord.getX() < this.initX || coord.getX() > this.limitX ||
			coord.getY() < this.initY || coord.getY() > this.limitY ) {
			return true;
		}
		
		return false;
	}
}
