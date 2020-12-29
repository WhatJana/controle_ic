package br.inatel.ehealth.controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import br.inatel.ehealth.telas.FrameLogin;
import br.inatel.ehealth.telas.FramePrimario;
import br.inatel.ehealth.telas.PainelLogin;
import br.inatel.ehealth.telas.PainelPrimario;

public class BotaoCadastrar implements ActionListener {
	private PainelLogin painelLogin;
	private PainelPrimario painelPrimario = new PainelPrimario();
	boolean eBolsista = false;
	boolean eOrientador = false;

	public BotaoCadastrar(PainelLogin painelLogin) {
		this.painelLogin = painelLogin;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		FramePrimario.startPrimario();
		}

}
