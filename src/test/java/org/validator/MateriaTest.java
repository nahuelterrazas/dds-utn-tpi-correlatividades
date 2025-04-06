package org.validator;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class MateriaTest {

  @Test
  public void noPuedeCursar_sinCorrelativasCorrectas() {
    Materia am1 = new Materia(List.of());
    Materia am2 = new Materia(List.of(am1));

    Alumno ezequiel = new Alumno(List.of());
    assertFalse(am2.puedeCursar(ezequiel));
  }

  @Test
  public void puedeCursar_correlativasCorrectas() {
    Materia syo = new Materia(List.of());
    Materia pdp = new Materia(List.of());
    Materia md = new Materia(List.of());
    Materia ddsi = new Materia(List.of(pdp, syo, md));

    Alumno maria = new Alumno(List.of(syo, pdp, md));
    assertTrue(ddsi.puedeCursar(maria));
  }

  @Test
  public void puedeCursar_materiaSinCorrelativas() {
    Materia am1 = new Materia(List.of());

    Alumno cesar = new Alumno(List.of());
    assertTrue(am1.puedeCursar(cesar));
  }

}
