package br.inatel.ehealth.controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import br.inatel.ehealth.telas.PainelCadastroOrientador;


public class BotaoSalvarOrientador implements ActionListener {
	private PainelCadastroOrientador painelCadastroOrientador;
	
	public BotaoSalvarOrientador (PainelCadastroOrientador painelCadastroOrientador) {
		this.painelCadastroOrientador = painelCadastroOrientador;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String caminhoArquivo = painelCadastroOrientador.getTextNome() + ".txt";
		try {
			PrintWriter ps = new PrintWriter(new FileWriter(caminhoArquivo, true));
			StringBuilder builder = new StringBuilder(); 
			
			builder.append("Nome: " + painelCadastroOrientador.getTextNome());
			builder.append("E-mail: " + painelCadastroOrientador.getTextEmail());
			ps.print(builder.toString()); 
			ps.close();
			
			painelCadastroOrientador.limpaNome();
			painelCadastroOrientador.limpaEmail();
					}
		catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		System.out.println("Salvou no arquivo");		
	}

}
