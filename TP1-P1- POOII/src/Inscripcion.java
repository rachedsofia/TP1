import java.time.LocalDate;
import java.util.ArrayList;

public class Inscripcion {
	public LocalDate fechaIns;
	public String fecha1;
	public boolean inscipto;
	Participante participante;
	public ArrayList<Concurso> listConcursos = new ArrayList<Concurso>();

	public Inscripcion() {
		this.inscipto = false;
		this.fechaIns = LocalDate.now();
	}

	public boolean participanteInscripto() {
		return (participante.inscripto);
	}

	public void inscribirParticipante(Participante participante, Concurso consurso) {
		if (fechaIns.equals(consurso.fechaDesde)) {
			participante.cantPuntos += 10;
		} else if ((this.fechaIns.isAfter(consurso.fechaDesde)) && (this.fechaIns.isBefore(consurso.fechaHasta))
				&& (fechaIns.equals(consurso.fechaHasta))) {
			participante.inscripto = true;
			participante.agregarConcurso(consurso);
			consurso.agregarParticipante(participante);
		} else {
			System.out.println("El participante: *" + participante.nombre + " " + participante.apellido
					+ "* no se podr� inscribir ya que la fecha de inscripci�n caduc�");
		}

	}
}
