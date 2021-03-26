
import java.util.ArrayList;

public class ex007 {
    public static void main(String[] args) {

        ArrayList<Aluno> alunos = new ArrayList<Aluno>();

        alunos.add(new Aluno("Pedro Goulart", Sexo.MASCULINO, 17, 100.00));
        alunos.add(new Aluno("Augustus Schwartzmann", Sexo.MASCULINO, 50, 98.15));
        alunos.add(new Aluno("Marcos Aurelius", Sexo.MASCULINO, 23, 68.22));
        alunos.add(new Aluno("Elizabeth Windsor", Sexo.FEMININO, 14, 87.33));
        alunos.add(new Aluno("Margaret Thatcher", Sexo.FEMININO, 12, 64.50));
        alunos.add(new Aluno("Julius Cæsaer", Sexo.MASCULINO, 15, 69.80));
        alunos.add(new Aluno("Friedrich Hohenzollern", Sexo.MASCULINO, 18, 76.55));
        alunos.add(new Aluno("Rogerinho das Águas", Sexo.MASCULINO, 21, 5.00));
        alunos.add(new Aluno("Alfredo Mercúrio", Sexo.MASCULINO, 11, 5.00));

        for (Aluno aluno : alunos) {
            System.out.printf("\"%s\"; %s; %d; %f\n", aluno.nome, aluno.sexo, aluno.idade, aluno.notaFinal);
        }

    }

}
