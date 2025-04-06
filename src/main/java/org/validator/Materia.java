package org.validator;

import java.util.List;

public class Materia {
  private List<Materia> correlativas;

  public Materia(List<Materia> correlativas) {
    this.correlativas = correlativas;
  }

  public Boolean puedeCursar(Alumno alumno) {
    return alumno.getAprobadas().containsAll(correlativas);
  }
}
