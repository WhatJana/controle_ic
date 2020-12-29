package br.inatel.ehealth.controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import br.inatel.ehealth.telas.PainelHorario;
import br.inatel.ehealth.telas.PainelLogin;

public class BotaoSalvarHorario implements ActionListener {
	private PainelHorario painelHorario;
	private PainelLogin painelLogin = new PainelLogin();
	
	public BotaoSalvarHorario(PainelHorario painelHorario) {
		this.painelHorario = painelHorario;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String caminhoArquivo = painelLogin.getTextNome() + ".txt";
		try {
			
			PrintWriter ps = new PrintWriter(new FileWriter(caminhoArquivo, true));
			StringBuilder builder = new StringBuilder();
			
			for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 7; j++) {
                	builder.append(painelHorario.tableHorario.getModel().getValueAt(i, j) + " ");
                	ps.print(builder.toString());
                	System.out.println(painelHorario.tableHorario.getModel().getValueAt(i, j) + " ");
                }
			}
			ps.close();
		}catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
