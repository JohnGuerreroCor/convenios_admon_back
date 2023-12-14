package com.usco.edu.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usco.edu.entities.TasaGraduacionPeriodo;
import com.usco.edu.entities.TasaGraduacionPersonas;
import com.usco.edu.entities.TasaGraduacionSemestre;
import com.usco.edu.service.ITasaGraduacionService;

@RestController
@RequestMapping(path = "tasaGraduacion")
public class TasaGraduacionRestController {
	
	@Autowired
	ITasaGraduacionService tasaGraduacionService;
	
	@GetMapping(path = "obtener-tasa-graduacion-periodo/{programaCodigo}")
	public List<TasaGraduacionPeriodo> obtenerPeriodosMatriculados(@PathVariable int programaCodigo) {
		
		return tasaGraduacionService.obtenerPeriodosMatriculados(programaCodigo);
		
	}
	
	@GetMapping(path = "obtener-tasa-graduacion-semestres/{programaCodigo}")
	public List<TasaGraduacionSemestre> obtenerSemestresPrograma(@PathVariable int programaCodigo) {
		
		return tasaGraduacionService.obtenerSemestresPrograma(programaCodigo);
		
	}
	
	@GetMapping(path = "obtener-tasa-graduacion-matriculados/{periodoInicial}/{periodoFinal}/{programaCodigo}")
	public List<TasaGraduacionPersonas> obtenerEstudiantesPrimerIngreso(@PathVariable String periodoInicial, @PathVariable String periodoFinal, @PathVariable int programaCodigo) {
		
		return tasaGraduacionService.obtenerEstudiantesPrimerIngreso(periodoInicial, periodoFinal, programaCodigo);
		
	}
	
	@GetMapping(path = "obtener-tasa-graduacion-graduados/{programaCodigo}/{periodo}")
	public List<TasaGraduacionPersonas> obtenerGraduados(@PathVariable int programaCodigo, @PathVariable String periodo) {
		
		return tasaGraduacionService.obtenerGraduados(programaCodigo, periodo);
		
	}

}
