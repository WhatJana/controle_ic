package br.inatel.ehealth.controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import br.inatel.ehealth.telas.FrameHorario;
import br.inatel.ehealth.telas.FrameLogin;
import br.inatel.ehealth.telas.PainelLogin;

public class BotaoEntrar implements ActionListener {
	private PainelLogin painelLogin;
	
	public BotaoEntrar(PainelLogin painelLogin) {
		this.painelLogin = painelLogin;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String nomeArquivo = painelLogin.getTextNome() + ".txt";
		File f = new File(nomeArquivo);
		if(f.exists()) {
			FrameHorario.startHorario();
		}
		else JOptionPane.showMessageDialog(null, "Nome incorretos! Cadastre-se");
	}

}
