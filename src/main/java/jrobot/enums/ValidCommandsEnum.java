package jrobot.enums;

/**
 * Relação de comandos válidos para o robot
 * 
 * @author tiagoamorim
 */
public enum ValidCommandsEnum {
	
	MOVE("M"),
	TURN_LEFT("L"),
	TURN_RIGHT("R");
	
	private final String command;
	
	ValidCommandsEnum(String command){
		this.command = command;
	}
	
	public String getCommand() {
		return command;
	}
	
	/**
	 * Valida se comando dado pertence ao domínio
	 * 
	 * @param String testCommand
	 * @return boolean
	 */
	public static boolean isValidCommand(String command) {
		for (ValidCommandsEnum validCommand : ValidCommandsEnum.values()) {
			if (validCommand.getCommand().equals(command)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Retorna letra associada ao enum de direção 
	 * @param command
	 * @return
	 */
	public static ValidCommandsEnum getByValue(String command) {
		for (ValidCommandsEnum validCommand : ValidCommandsEnum.values()) {
			if (validCommand.getCommand().equals(command)) {
				return validCommand;
			}
		}
		return null;
	}

}
