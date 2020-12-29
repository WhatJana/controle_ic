package br.inatel.ehealth.controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import br.inatel.ehealth.telas.PainelCadastroAluno;


public class BotaoSalvarAluno implements ActionListener {
	private PainelCadastroAluno painelCadastroAluno;

	public BotaoSalvarAluno (PainelCadastroAluno painelCadastroAluno) {
		this.painelCadastroAluno = painelCadastroAluno;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String caminhoArquivo = painelCadastroAluno.getTextNome() + ".txt";
		try {
			
			PrintWriter ps = new PrintWriter(new FileWriter(caminhoArquivo, true)); 
			StringBuilder builder = new StringBuilder(); 

			
			builder.append("Nome: " + painelCadastroAluno.getTextNome());
			builder.append("\n");
			builder.append("E-mail: " + painelCadastroAluno.getTextEmail());
			builder.append("\n");
			builder.append("Matrícula: " + painelCadastroAluno.getTextMatricula());
			builder.append("\n");
			builder.append("Curso: " + painelCadastroAluno.getTextCurso());
			builder.append("\n");

			ps.print(builder.toString()); 
			ps.close();
			
			painelCadastroAluno.limpaNome();
			painelCadastroAluno.limpaEmail();
			painelCadastroAluno.limpaMatricula();
			painelCadastroAluno.limpaCurso();
		}
		catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		System.out.println("Salvou no arquivo");
		
	}

}
