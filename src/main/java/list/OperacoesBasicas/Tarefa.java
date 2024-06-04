package main.java.list.OperacoesBasicas;

public class Tarefa {
  //atributo
  private String descricao;

  //construtor
  public Tarefa(String descricao) {
    this.descricao = descricao;
  }
  //método get
  public String getDescricao() {
    return descricao;
  }

  @Override
  public String toString() {
    return  descricao;
  }
}
