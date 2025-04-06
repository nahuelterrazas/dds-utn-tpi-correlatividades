package org.validator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class AlumnoTest {

  @Test
  public void aproboNuevaMateria() {
    Materia am1 = new Materia(new ArrayList<>());
    Materia pdp = new Materia(new ArrayList<>());
    Materia ddsi = new Materia(new ArrayList<>(List.of(pdp)));

    Alumno matias = new Alumno(new ArrayList<>(List.of(am1, pdp)));
    matias.aprobar(ddsi);
    assertEquals(3, matias.getAprobadas().size());
  }

}
