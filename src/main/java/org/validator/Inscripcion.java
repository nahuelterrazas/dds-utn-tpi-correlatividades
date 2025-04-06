package org.validator;

import java.util.List;

public class Inscripcion {
  private Alumno alumno;
  private List<Materia> asignaturas;

  public Inscripcion(Alumno alumno, List<Materia> asignaturas) {
    this.asignaturas = asignaturas;
    this.alumno = alumno;
  }

  public boolean esExitosa(List<Materia> aprobadas) {
    return asignaturas.stream().allMatch(materia -> materia.puedeCursar(alumno));
  }

}
