package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {

  @NotBlank(message = "Preencha os campos corretamente")
  @Size(min = 3, max = 50, message = "'${validatedValue' precisa estar entre {min} e {max} caracteres ")
  private String nome;

  @NotBlank(message = "Preencha os campos corretamente")
  @Size(min = 3, max = 50, message = "'${validatedValue' é inválido")
  private String cpf;

  @NotBlank(message = "Preencha os campos corretamente")
  @Size(min = 3, max = 50, message = "'${validatedValue' precisa estar entre {min} e {max} caracteres ")
  private String bairro;

  @NotBlank(message = "Preencha os campos corretamente")
  @Past( message = " Data '${validatedValue' é inválida")
  private LocalDate dataDeNascimento;
}
