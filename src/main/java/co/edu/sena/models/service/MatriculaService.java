package co.edu.sena.models.service;

import java.util.List;
import java.util.Optional;

import co.edu.sena.models.entity.Matricula;

public interface MatriculaService {
	
	public Optional<Matricula>findById(Integer id);
	public List<Matricula>findAll();
	public Matricula Save(Matricula m);
	public void deleteById(Integer id);

}
