package jrobot.backend.entity;

/**
 * Interface para definição do movimento através da factory, de acordo com orientação
 * Cada uma das orientações define qual cálculo de movimento no eixo XY
 * @author tiagoamorim
 *
 */
public interface Movement {
	public Coord move(Coord coord);
}
