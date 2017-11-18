package jrobot.enums;
/**
 * Lista de possíveis direções para orientação e validação
 * @author tiagoamorim
 *
 */
public enum DirectionEnum {
	
	NORTH(0, "N"),
	WEST(1, "W"),
	SOUTH(2, "S"),
	EAST(3, "E");
	
	private final int id;
	private final String heading;
	
	DirectionEnum(int id, String direcao){
		this.id = id;
		this.heading = direcao;
	}
	
	public int getId() {
		return id;
	}

	public String getHeading() {
		return heading;
	}
}

