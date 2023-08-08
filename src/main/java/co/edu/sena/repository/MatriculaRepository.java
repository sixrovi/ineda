package co.edu.sena.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.sena.models.entity.Matricula;

public interface MatriculaRepository extends JpaRepository<Matricula, Integer> {

}
