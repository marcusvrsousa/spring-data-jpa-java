package me.dio.academia.digital.entity.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class MatriculaForm {

  @NotNull(message = "preencha corretamente")
  @Positive(message = "o ID do aluno precisa ser positivo")
  private Long alunoId;

}
