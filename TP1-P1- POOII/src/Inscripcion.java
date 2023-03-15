import java.time.LocalDate;
import java.util.ArrayList;

public class Inscripcion {
	public LocalDate fechaIns;
	public String fecha1;
	public boolean inscipto;
	Participante participante;
	public ArrayList<Concurso> listConcursos = new ArrayList<Concurso>();
	public ArrayList<Participante> listParticipante = new ArrayList<Participante>();

	public Inscripcion() {
		this.inscipto = false;
		this.fechaIns = LocalDate.now();
	}

	public boolean participanteInscripto() {
		return (participante.inscripto);
	}

	public boolean participanteYaInscripto(Participante participante) {
		return (listParticipante.contains(participante));
	}

	public boolean sePuedeInscribir(Concurso concurso) {
		return ((this.fechaIns.isAfter(concurso.fechaDesde)) && (this.fechaIns.isBefore(concurso.fechaHasta)));
	}

	public void inscribirParticipante(Participante participante, Concurso consurso) {
		if ((participanteYaInscripto(participante) == false) && ((fechaIns.equals(consurso.fechaDesde)))) {
			participante.cantPuntos += 10;
			System.out.println(participante.cantPuntos);
		} else if (sePuedeInscribir(consurso) == true) {
			participante.inscripto = true;
			participante.agregarConcurso(consurso);
			consurso.agregarParticipante(participante);
		} else {
			System.out.println("El participante: *" + participante.nombre + " " + participante.apellido
					+ "* no se podrá inscribir ya que la fecha de inscripción caducó");
		}
	}

//	public void inscribirParticipante(Participante participante, Concurso consurso) {
//		if (fechaIns.equals(consurso.fechaDesde)) {
//			participante.cantPuntos += 10;
//		} else if ((this.fechaIns.isAfter(consurso.fechaDesde)) && (this.fechaIns.isBefore(consurso.fechaHasta))) {
//			participante.inscripto = true;
//			participante.agregarConcurso(consurso);
//			consurso.agregarParticipante(participante);
//		} else {
//			System.out.println("El participante: *" + participante.nombre + " " + participante.apellido
//					+ "* no se podrá inscribir ya que la fecha de inscripción caducó");
//		}
//	}

}
