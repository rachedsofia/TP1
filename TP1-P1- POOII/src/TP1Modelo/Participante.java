package TP1Modelo;
import java.time.LocalDate;
import java.util.ArrayList;

public class Participante {
	public String nombre;
	public String apellido;
	public int id;
	public int cantPuntos = 0;
	LocalDate fechaIns;
	public ArrayList<Concurso> listConcurso = new ArrayList<Concurso>();

	public boolean inscripto = false;

	public Participante(String nombre, String apellido, int id) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
		this.fechaIns = LocalDate.now();
	}

	public int getCantPuntos() {
		return cantPuntos;
	}

}
