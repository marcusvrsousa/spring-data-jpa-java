package me.dio.academia.digital.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//Data é uma anotaçao do lombok que serve para criar setters and getters
//NoArgs significa que vou ter um construtor vazio e o AllArgs indica que vou ter
// todos esses atributos no construtor
@Entity
@Table(name = "tb_alunos")
public class Aluno {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;


  private String nome;

  @Column(unique = true)
  private String cpf;


  private String bairro;


  private LocalDate dataDeNascimento;


  @OneToMany(mappedBy = "aluno", fetch = FetchType.LAZY) // TRAS SÓ INFO NECESSARIA SEM TODOS OS DETALHES
  @JsonIgnore // IGNORA ALGUMA EXCESSAO QUE POSSA APARECER
  private List<AvaliacaoFisica> avaliacoes = new ArrayList<>();

}
