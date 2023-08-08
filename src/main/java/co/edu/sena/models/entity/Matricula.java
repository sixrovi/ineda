package co.edu.sena.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "Matricula")
public class Matricula {
	@Id
	@Column(name = "id_Matricula")
	private int codigo;
	
	@Column(name = "codigo_Estudiante")
	private String estudiante;
	
	@Column (name = "grado_estudiante")
	private String grado;
	
	@Column(name = "costo_matricula")
	private int costo;
	
	
	
	public Matricula() {
		
	}



	public Matricula(int codigo, String estudiante, String grado, int costo) {
		
		this.codigo = codigo;
		this.estudiante = estudiante;
		this.grado = grado;
		this.costo = costo;
	}



	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public String getEstudiante() {
		return estudiante;
	}



	public void setEstudiante(String estudiante) {
		this.estudiante = estudiante;
	}



	public String getGrado() {
		return grado;
	}



	public void setGrado(String grado) {
		this.grado = grado;
	}



	public int getCosto() {
		return costo;
	}



	public void setCosto(int costo) {
		this.costo = costo;
	}
	
	
	

}
