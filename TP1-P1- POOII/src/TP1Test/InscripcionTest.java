package TP1Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import TP1Modelo.Concurso;
import TP1Modelo.Participante;

public class InscripcionTest {
//	[TestFixture]

//	String fechaI1 = "11/03/2023";
//	String fechaF2 = "20/03/2023";
//	String fechaF3 = "07/03/2023";
//	String fechaF4 = "10/03/2023";

//	LocalDate fecha1 = LocalDate.parse(fechaI1);
//	LocalDate fecha2 = LocalDate.parse(fechaF2);
//	LocalDate fecha3 = LocalDate.parse(fechaF3);
//	LocalDate fecha4 = LocalDate.parse(fechaF4);

	@Test
	public void ConcursoPoderJudicial() {
		// inicializaci�n
		Participante participante1 = new Participante("Sofia", "Rached", 44122180);
		LocalDate fecha3 = LocalDate.of(2023, 03, 07);
		LocalDate fecha4 = LocalDate.of(2023, 03, 10);
		Concurso concursoPoderJudicial = new Concurso("Poder Judicial", fecha3, fecha4);
		boolean valorEsperadoParticipante2Inscripto = false;

		// ejercitacion
		concursoPoderJudicial.inscribirParticipante(participante1);
		boolean resultado2 = participante1.inscripto;
//		
		// validacion
		assertEquals(valorEsperadoParticipante2Inscripto, resultado2);

	}

	@Test
	public void concursoTecnologia() {
		// inicializacion
		LocalDate fecha1 = LocalDate.of(2023, 03, 15);
		LocalDate fecha2 = LocalDate.of(2023, 03, 20);

		Participante participante1 = new Participante("Sofia", "Rached", 44122180);
		Concurso concursoTecno = new Concurso("Tecnolog�a", fecha1, fecha2);
		int valorEsperadoParticipante1Inscripto = 10;

		// ejercitacion
		concursoTecno.inscribirParticipante(participante1);
		int resultado1 = participante1.getCantPuntos();

		// validacion
		assertEquals(valorEsperadoParticipante1Inscripto, resultado1);

	}

	@Test
	public void concursoPoderJudicial1() {
		// inicializacion
		LocalDate fecha3 = LocalDate.of(2023, 03, 07);
		LocalDate fecha4 = LocalDate.of(2023, 03, 10);
		Participante participante2 = new Participante("Luciana", "Rached", 465432225);
		Concurso concursoPoderJudicial = new Concurso("Poder Judicial", fecha3, fecha4);
		boolean valorEsperadoParticipante3Inscripto = false;
		// ejercitacion
		concursoPoderJudicial.inscribirParticipante(participante2);
		boolean resultado3 = participante2.inscripto;

		// validacion
		assertEquals(valorEsperadoParticipante3Inscripto, resultado3);
	}

}