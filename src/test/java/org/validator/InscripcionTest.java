package org.validator;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.List;
import org.junit.jupiter.api.Test;

public class InscripcionTest {

  Materia syo = new Materia(List.of());
  Materia pdp = new Materia(List.of());
  Materia md = new Materia(List.of());
  Materia fisica = new Materia(List.of());
  Materia quimica = new Materia(List.of());

  Materia ddsi = new Materia(List.of(pdp, syo, md));
  Materia fisica2 = new Materia(List.of(fisica));

  @Test
  public void noExitosa_noCumpleConCorrelativasEnCadaMateria() {
    Alumno santiago = new Alumno(List.of(syo, md, fisica));

    Inscripcion inscripcion = new Inscripcion(santiago, List.of(ddsi, fisica2, quimica));
    assertFalse(inscripcion.esExitosa());
  }

  @Test
  public void exitosa_cumpleConCorrelativasEnCadaMateria() {
    Alumno nahuel = new Alumno(List.of(syo, pdp, md, fisica));

    Inscripcion inscripcion = new Inscripcion(nahuel, List.of(quimica, ddsi, fisica2));
    assertTrue(inscripcion.esExitosa());
  }

}