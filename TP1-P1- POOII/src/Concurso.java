import java.time.LocalDate;
import java.util.ArrayList;

public class Concurso {

	public String nombreConcurso;
	public LocalDate fechaDesde;
	public LocalDate fechaHasta;
	public String fechaDesde1;
	public String fechaHasta1;
	public ArrayList<Participante> listParticipante = new ArrayList<Participante>();

	public Concurso(String nombre, LocalDate fechaDesde, LocalDate fechaHasta) {
		this.nombreConcurso = nombre;
		this.fechaDesde = fechaDesde;
		this.fechaHasta = fechaHasta;
	}

	public void agregarParticipante(Participante unParticipante) {
		this.listParticipante.add(unParticipante);
	}

}
