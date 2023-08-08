package co.edu.sena.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.sena.models.entity.Matricula;
import co.edu.sena.models.service.MatriculaService;


@RestController
@RequestMapping("/api/matricula")
public class MatriculaController {
	
	
	@Autowired
	MatriculaService matriculaService;
	
	@GetMapping("/{id}")
	public Optional<Matricula> buscarPorId(@PathVariable Integer id) {
		return matriculaService.findById(id);
	}
	
	
	@GetMapping("/listar")
	public List<Matricula> ListarTodos() {
		return matriculaService.findAll();
	}

	@PostMapping
	public Matricula guardar(@RequestBody Matricula m) {
		return matriculaService.Save(m);
	}

	@DeleteMapping("/{id}")
	public void eliminar(Integer id) {
		matriculaService.deleteById(id);
	}

	

}
