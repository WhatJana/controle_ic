package br.inatel.ehealth.telas;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import br.inatel.ehealth.controle.BotaoContinuar;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JSeparator;

public class PainelPrimario extends JPanel {
	public Boolean bolsista = false;
	public Boolean orientador = false;

	/**
	 * Create the panel.
	 */
	public PainelPrimario() {
		setLayout(null);
		
		JRadioButton rdbtnBolsista = new JRadioButton("Aluno");
		rdbtnBolsista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bolsista = rdbtnBolsista.isSelected();
			}
		});
		rdbtnBolsista.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		rdbtnBolsista.setBounds(61, 92, 60, 23);
		add(rdbtnBolsista);
		
		JRadioButton rdbtnOrientador = new JRadioButton("Orientador");
		rdbtnOrientador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				orientador = rdbtnOrientador.isSelected();
			}
		});
		rdbtnOrientador.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		rdbtnOrientador.setBounds(148, 92, 84, 23);
		add(rdbtnOrientador);
		
		JLabel lblPergunta = new JLabel("Bem-vindo");
		lblPergunta.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblPergunta.setHorizontalAlignment(SwingConstants.CENTER);
		lblPergunta.setBounds(61, 50, 177, 35);
		add(lblPergunta);
		
		JLabel lblTitulo = new JLabel("E-Health");
		lblTitulo.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(41, 11, 203, 35);
		add(lblTitulo);
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.addActionListener(new BotaoContinuar(this));
		btnContinuar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnContinuar.setBounds(98, 141, 89, 23);
		add(btnContinuar);

	}
}
