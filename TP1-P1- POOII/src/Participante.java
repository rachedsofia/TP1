import java.util.ArrayList;

public class Participante {
	public String nombre;
	public String apellido;
	public int id;
	public int cantPuntos = 0;

	public boolean inscripto = false;
	public ArrayList<Concurso> listConcursos = new ArrayList<Concurso>();

	public Participante(String nombre, String apellido, int id) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
	}

	public void agregarConcurso(Concurso unConcurso) {
		this.listConcursos.add(unConcurso);
	}

	public int getCantPuntos() {
		return cantPuntos;
	}

}
