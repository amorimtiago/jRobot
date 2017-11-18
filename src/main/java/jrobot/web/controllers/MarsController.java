package jrobot.web.controllers;


import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import jrobot.backend.service.RobotService;

@Controller
public class MarsController {
	
	@Autowired
	RobotService robotService;
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}

	
	/**
	 * Access point REST para receber comandos imputados para o robot
	 * @param HttpServletResponse response
	 * @param String commands lista de comandos sequenciais
	 * @return ResponseEntity<String>
	 */
	@RequestMapping(value="/rest/mars/{commands}", method=RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<String> mars(HttpServletResponse response, @PathVariable String commands) {
		response.setContentType("text/plain");
	    response.setCharacterEncoding("UTF-8");
	    
	    String[] commandList = commands.split("");
	    
	    // Processa lista de comandos
	    try {
			robotService.processCommands(commandList);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
	    
	    // OK, retorna coordenadas
	    return ResponseEntity.status(HttpStatus.OK).body(robotService.getRobotCoordString());
				
	}
	
}
