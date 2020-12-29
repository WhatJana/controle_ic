package br.inatel.ehealth.controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import br.inatel.ehealth.telas.FrameCadastroAluno;
import br.inatel.ehealth.telas.FrameCadastroOrientador;
import br.inatel.ehealth.telas.FramePrimario;
import br.inatel.ehealth.telas.PainelPrimario;


public class BotaoContinuar implements ActionListener{
	private PainelPrimario painelPrimario;
	
	public BotaoContinuar (PainelPrimario painelPrimario) {
		this.painelPrimario = painelPrimario;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(painelPrimario.bolsista && !painelPrimario.orientador)
		{
			FrameCadastroAluno.startCadastroAluno();
		}
		else if (!painelPrimario.bolsista && painelPrimario.orientador)
			FrameCadastroOrientador.startCadastroOrientador();
		else JOptionPane.showMessageDialog(null, "Selecione uma opção!");
		
	}
	

}
