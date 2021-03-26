import java.time.LocalDate;

import javax.swing.JOptionPane;

class Poo {
		
		private String nome;
		private int idade;
		private int[] nascimento;
		private double altura;
		
		public void getNome() {
			JOptionPane.showMessageDialog(null, this.nome);
		}

    public void setNome() {
			this.nome = JOptionPane.showInputDialog(null, "digite seu nome"); 
		}

		public void getIdade() {
			JOptionPane.showMessageDialog(null, this.idade);
    }
    
    public void setIdade() {
      this.idade = this.nascimento[2] - LocalDate.now().getYear();
    }

		public void getNascimento() {
			JOptionPane.showMessageDialog(null, this.nascimento[0], this.nascimento[1], this.nascimento[2] );
    }
    
    public void setNascimento() {
      this.nascimento[0] = JOptionPane.showInputDialog(null, "digite seu dia de nascimento");
      this.nascimento[1] = JOptionPane.showInputDialog(null, "digite seu mês de nascimento");
      this.nascimento[2] = JOptionPane.showInputDialog(null, "digite seu ano de nascimento");
    }

		public void getAltura() {
			JOptionPane.showMessageDialog(null, this.altura);
    }

    public void setAltura() {
      this.altura = JOptionPane.showInputDialog(null, "digite sua altura");
    }
    
	}