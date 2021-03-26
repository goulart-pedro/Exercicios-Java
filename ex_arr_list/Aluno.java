
enum Sexo {
    MASCULINO, FEMININO;
}

public class Aluno {

    String nome;
    Sexo sexo;
    int idade;
    double notaFinal;
    String nomePai;

    public Aluno(String nome, Sexo sexo, int idade, double notaFinal) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.notaFinal = notaFinal;
    }

}