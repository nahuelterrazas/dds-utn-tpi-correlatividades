package org.validator;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.List;
import org.junit.jupiter.api.Test;

public class InscripcionTest {

  @Test
  public void noCumpleConCorrelativasEnCadaMateria() {
    Materia syo = new Materia(List.of());
    Materia pdp = new Materia(List.of());
    Materia md = new Materia(List.of());
    Materia fisica = new Materia(List.of());
    Materia quimica = new Materia(List.of());

    Materia ddsi = new Materia(List.of(pdp, syo, md));
    Materia fisica2 = new Materia(List.of(fisica));

    Alumno matias = new Alumno(List.of(syo, md, fisica));

    Inscripcion inscripcion = new Inscripcion(matias, List.of(ddsi, fisica2, quimica));
    assertFalse(inscripcion.esExitosa(matias.getAprobadas()));
  }

  @Test
  public void cumpleConCorrelativasEnCadaMateria() {
    Materia syo = new Materia(List.of());
    Materia pdp = new Materia(List.of());
    Materia md = new Materia(List.of());
    Materia fisica = new Materia(List.of());
    Materia quimica = new Materia(List.of());

    Materia ddsi = new Materia(List.of(pdp, syo, md));
    Materia fisica2 = new Materia(List.of(fisica));

    Alumno matias = new Alumno(List.of(syo, pdp, md, fisica));

    Inscripcion inscripcion = new Inscripcion(matias, List.of(quimica, ddsi, fisica2));
    assertTrue(inscripcion.esExitosa(matias.getAprobadas()));
  }

}