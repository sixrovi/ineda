package co.edu.sena.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.sena.models.entity.Matricula;
import co.edu.sena.repository.MatriculaRepository;

@Service
public class MatriculaServiceImpl implements MatriculaService {
	
	@Autowired
	MatriculaRepository matriculaRepository;

	@Override
	public Optional<Matricula> findById(Integer id) {
		// TODO Auto-generated method stub
		return matriculaRepository.findById(id);
	}

	@Override
	public List<Matricula> findAll() {
		// TODO Auto-generated method stub
		return matriculaRepository.findAll();
	}

	@Override
	public Matricula Save(Matricula m) {
		// TODO Auto-generated method stub
		return matriculaRepository.save(m);
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		matriculaRepository.deleteById(id);
		
	}
	
	

}
