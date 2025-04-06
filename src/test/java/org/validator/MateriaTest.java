package org.validator;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class MateriaTest {

  @Test
  public void noPuedeCursarSinTenerCorrelativasCorrectas() {
    Materia am1 = new Materia(List.of());
    Materia am2 = new Materia(List.of(am1));

    Alumno matias = new Alumno(List.of());
    assertFalse(am2.puedeCursar(matias));
  }

  @Test
  public void puedeCursarTeniendoCorrelativasCorrectas() {
    Materia syo = new Materia(List.of());
    Materia pdp = new Materia(List.of());
    Materia md = new Materia(List.of());
    Materia ddsi = new Materia(List.of(pdp, syo, md));

    Alumno matias = new Alumno(new ArrayList<>(List.of(syo, pdp, md)));
    assertTrue(ddsi.puedeCursar(matias));
  }

  @Test
  public void puedeCursarMateriaSinCorrelativas() {
    Materia am1 = new Materia(List.of());

    Alumno matias = new Alumno(List.of());
    assertTrue(am1.puedeCursar(matias));
  }

}
